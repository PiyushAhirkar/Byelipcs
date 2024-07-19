package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Find_Broken_Links {

	// Find Broken Links On Web-Page and PRint URL on Console 

	public static void main(String[] args) {

		int validlink = 0;
		int brokenlink=0;

//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//
//		ChromeOptions option =new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver();

		driver.manage().deleteAllCookies();//https://identity.getpostman.com/client-auth/confirm?auth_challenge=b9047d39ed2562e98c35c9c7152883c45ec32b0b0d7685be7ddb3a71e64d73e9&auth_device=app_native&auth_device_version=10.17.0
		driver.navigate().to("http://tutorialsninja.com/demo/");            
		driver.manage().window().maximize();                           

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Link On Web Pages Are "+ links.size());	

		for(WebElement link : links)
		{
			System.out.println("++++++++++++++++++++++++");
			String url =link.getAttribute("href");

			if(url == null || url.isEmpty() )
			{
				System.out.println("Link Is Empty");
				continue;
			}

			try {
				HttpURLConnection huc =	(HttpURLConnection)(new URL(url).openConnection());  

				huc.connect();
				if(huc.getResponseCode() >= 400)
				{
					System.out.println(url + "- Is Broken");
					brokenlink++;


				}
				else 
				{ 
					System.out.println( url + "- Is Valid");

					validlink++ ;

				}

			} catch (MalformedURLException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();
			}


		}

		System.out.println("------------\n");
		System.out.println("Total valid Links Are "+ validlink);
		System.out.println("Total Broken links Are "+ brokenlink);

		driver.manage().deleteAllCookies();
		driver.quit();
	}

}

