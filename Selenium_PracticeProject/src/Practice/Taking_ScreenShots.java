package Practice;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Taking_ScreenShots {
	// Taking A Screen Of Whole Web-Page And also taking Screenshots of all img. tag name elements (Images) 
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");    // You Need To Just Change URL of new Page-->  
		driver.manage().window().maximize();                                                    // --> Remaining  Code Will be same  ;
		Thread.sleep(3000);

		//Take ScreenShot Of  Whole Web-Page 
		TakesScreenshot tc = (TakesScreenshot) driver;
		File scr = tc.getScreenshotAs(OutputType.FILE);
		File trg =new File(".//Screenshots//Scrennshot2.png");
		FileUtils.copyFile(scr, trg);

		System.out.println("Screenshot saved");

		int i=1;
		int j=1;
		List<WebElement> elements=driver.findElements(By.tagName("img"));
		System.out.println("Total imgs are :- "+elements.size());

		for (WebElement img:elements) 
		{
			File scr1=img.getScreenshotAs(OutputType.FILE);
			File trg1=new File(".//Screenshots//logo["+(j++)+"].png");
			FileUtils.copyFile(scr1, trg1);
			System.out.println((i++) + " img Captured");
		}
		
		driver.quit();
	}
}

