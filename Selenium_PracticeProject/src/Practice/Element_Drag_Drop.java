package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Element_Drag_Drop {
	// Handling Drag And Drop Operation By Using Actions Class 
	public static void main(String[] args) throws Exception {


		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Title matched:- "+ driver.getTitle());


		//Move Inside Frame
		driver.switchTo().frame(0);

		// Handle using Actions class
		Actions dragndrop=new Actions(driver);
		WebElement Drag =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement Drop =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		dragndrop.dragAndDrop(Drag,Drop).build().perform(); 
		Thread.sleep(3000);
		System.out.println("DRAG AND DROP DONE");

		//Exit From Frame
		driver.switchTo().defaultContent();

		driver.quit();   
		System.out.println("------END------");
		System.out.println("Test Case Passed");

	}

}
