package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Verify_Visibility_Of_Password {
	// VERIFY ENCRYPTED/VISIBILITY OF PASSWORD IN TEXT BOX FEILD BY CLICKING ON "SHOW PASSWORD" CHECK BOX ..
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(option);

		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement Password_txt_box	=driver.findElement(By.name("Passwd"));

		Password_txt_box.sendKeys("Password is Visible");   //Enter TExt is Text box as "Password Is Visible"

		//Retrieve type Attribute value   if it is equal to "password" it mean's  It is in Encrypted format..
		String pswd =Password_txt_box.getAttribute("type");

		if(pswd.equals("password"))
		{
			System.out.println("Password Is in Encrypted format");

		}
		else if (pswd.equals("text"))
		{
			System.out.println("Password Is Visible");

		}

		else 
		{
			System.out.println("Something is wrong");
		}

		//Click on "Show Password" CheckBox

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();    
		Thread.sleep(3000);


		//Now Password Field Text should be visible.
		//Retrieve type Attribute value   if it is equal to "text" it mean's  It is in Visible format..
		String txt =Password_txt_box.getAttribute("type");

		if(txt.equals("password"))
		{
			System.out.println("Password is in Encrypted format");

		}
		else if (txt.equals("text"))
		{
			System.out.println("Password Is Visible Now");
		}

		else 
		{
			System.out.println("Something is wrong");
		}

		driver.quit();
		driver.manage().deleteAllCookies();
		System.out.println("--Test Case Passed--");
	}

}
