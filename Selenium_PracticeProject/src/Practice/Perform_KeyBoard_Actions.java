package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Perform_KeyBoard_Actions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver=new ChromeDriver(option);
		 
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		// Move Cursor to Login Button by Using Tab Keys on Keyboard ; 
		
		//Robot Class
		Robot j=new Robot();
		j.keyPress(KeyEvent.VK_TAB);
		j.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		j.keyPress(KeyEvent.VK_ENTER);
		j.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(3000);
		System.out.println("Login Complete");
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed ");
		
		driver.close();
		
		System.out.println("Test Passed");
	}

}
