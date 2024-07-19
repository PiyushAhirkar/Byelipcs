package Practice;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo {



	public static void main(String[] args) throws Exception {

		//WebDriver driv= new ChromeDriver(option);


		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//screenshot of web element
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("Selenium Videos");
		File src1= searchbar.getScreenshotAs(OutputType.FILE);
		File trg1 = new File(".//Screenshots//searchbar.png");
		FileUtils.copyFile(src1, trg1);


		Thread.sleep(3000);

		//Taking  Screenshot of WebPage ;

		TakesScreenshot screenshot = (TakesScreenshot)driver ;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File trg =new File(".//Screenshots//photo.png");
		FileUtils.copyFile(src, trg);


		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Click on Enter Completed");

		driver.close();
		System.out.println("Tast Completed");












	}

}
