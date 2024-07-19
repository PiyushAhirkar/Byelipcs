package Practice;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		//Open Application URL
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login Into the Application
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();

		//User Login Successfully
		Thread.sleep(3000);
		String actualtitle =driver.getTitle();

		//Verify Page Title after Login completed
		if (actualtitle.equals("OrangeHRM")) {

			System.out.println("Title matched");
		}
		else {
			System.out.println("Title mismatched");
		}

		//Switch to Frame By ID
		driver.switchTo().frame("rightMenu");


		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		driver.switchTo().frame("rightMenu");
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Rohit");

		Thread.sleep(2000);
		
		// Entering Employee Details
		System.out.println("Enter Last Name ");
		driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Kumar");
		System.out.println("Enter First Name ");
		Thread.sleep(2000);

		driver.findElement(By.id("photofile")).sendKeys("C:\\Piyush_Selenium\\tiger.jpg");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Successfully LogOut");

		driver.quit();


	}



}


