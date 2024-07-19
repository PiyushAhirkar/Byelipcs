package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Handling_DropDown {

	// Handling DropDown Retriving Values, selecting value etc.  Using Select Class;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);

		//Select dropdown =  new Select(driver.findElement(By.xpath("//*[@id=\"drop1\"]")));
		Select dropdown =  new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));

		//Fetch Default selected Option 
		String selectedvalue= dropdown.getFirstSelectedOption().getText();

		//Count Size of DropDown value 
		int totalvalue= dropdown.getOptions().size();
		System.out.println("Default selected value:- " + selectedvalue);
		System.out.println("Total no. of values store:-" + totalvalue);

		System.out.println("---Start---");

		// Retrive data from DropDown ;

		List<WebElement> alloptions =dropdown.getOptions();

		for(WebElement value:alloptions) {
			System.out.println(value.getText());

		}

		dropdown.selectByVisibleText("Price (high to low)");

		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Logout")).click();

		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("---END---");

		System.out.println("Test Passed");
	}

}




