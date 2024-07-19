package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handle_Alerts {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
//		ChromeOptions option =new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://omayo.blogspot.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("alert1")).click();

		//driver.switchTo().alert().accept();   // Accepting the alert in this way also

		// Alert Type #1
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Type #1 Alert handle");

		// Alert Type #2
		driver.findElement(By.id("confirm")).click();
		System.out.println("Alert Text Is " +alert.getText());     //Retriving text From ALert
		alert.dismiss();                              // Alert Dismiss
		System.out.println("Type #2 Alert handle"); 

		// Alert Type #3
		driver.findElement(By.id("prompt")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Automation Testing");
		alert.accept();
		System.out.println("Type #3 Alert handle");

		driver.switchTo().defaultContent();              //Exit from Alert

		System.out.println("Test Passed");

		driver.quit();

	}

}
