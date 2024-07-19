package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Handling_WebTable_StaticTable {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
//		ChromeOptions option =new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//JavaScriptExcecuter For handling Web PAge Scroll Down Action ;
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)");    //Vertically scroll down by 450 pixel

		//Retrieving Web-Page Table data in Console;

		List<WebElement> rows =	driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowcount=rows.size();
		//#1 Count The number Of Rows Present in the Web table (Static table)
		System.out.println("Total Number Of Rows Are - " +rowcount);

		//#2 Count The number Of Coloums Present in the Web table (Static table)
		List<WebElement> colms =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		int colmcount =colms.size();
		System.out.println("Total Number Of Coloums Are - " + colmcount);

		System.out.println("** table Data **");

		//#3 Retrieving Web-Table Data In Console
		for(int r=2;r<=rowcount;r++) 
		{
			for(int c=1;c<=colmcount;c++)
			{
				String cell_value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(" "+cell_value +" | ");
				Thread.sleep(1000);
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("-- All the Web-Table Data is Printed Successfully -- ");

		driver.quit();
		System.out.println(" || Test Case Passed  ||");




	}
}
