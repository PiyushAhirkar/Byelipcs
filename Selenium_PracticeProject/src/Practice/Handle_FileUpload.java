package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_FileUpload {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(option);

		driver.navigate().to("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		try
		{
			String project_path =System.getProperty("user.dir");              //Retrieve the path of the Project
			WebElement choosefile =driver.findElement(By.id("myFile"));   
			choosefile.sendKeys(project_path +"\\ProjectData\\Profile Photo.png");
			Thread.sleep(3000);
			System.out.println("File Uploaded Successfully");

		}
		catch(Exception e)
		{
			System.out.println("File doesn't Found");
		}


		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("--Test case Passed--");

	}

}
