package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_GoogleIn_Chrome {
	// Test For launching Google.com in Chrome Browser only & Verify page Title ;
	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.navigate().to("https://www.google.com/");            
		driver.manage().window().maximize(); 

		String ActualTitle = driver.getTitle();

		if(ActualTitle.equals("Google"))
		{
			System.out.println("Title Matched (Test Passed )");
		}
		else {

			System.out.println("Title Doesn't Matched (Test failed )");

		}

		driver.manage().deleteAllCookies();
		driver.close();

	}
}


