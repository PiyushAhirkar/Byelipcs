package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Handling_Slider {

	public static void main(String[] args) throws Exception {
		


		WebDriver driver= new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.navigate().to("https://letcode.in/test");            
		driver.manage().window().maximize();    

		WebElement ele =driver.findElement(By.xpath("//a[text()='AUI - 5']"));


		Actions act = new Actions(driver);
		act.moveToElement(ele, 95, 2086);             // used for scrolling the web page down and click on element as "Slider"
		Thread.sleep(3000);
		ele.click();
		//	act.click(ele);
		Thread.sleep(3000);

		WebElement scrollbar_loc_ele =driver.findElement(By.xpath("//input[@id='generate']"));
		int loc_X =scrollbar_loc_ele.getLocation().getX();
		int loc_Y =scrollbar_loc_ele.getLocation().getY();

		System.out.println(loc_X  +"  "+ loc_Y);


		act.dragAndDropBy(scrollbar_loc_ele,loc_X+50,loc_Y);

		String count =driver.findElement(By.xpath("//h1[@class='subtitle has-text-info']")).getText();
		System.out.println(count);
		String[] word =count.split(": ");
		String number = word[1];

		System.out.println(number);

		int a=Integer.parseInt(number);

		System.out.println(a);

		driver.findElement(By.tagName("button")).click();

		String c_names =driver.findElement(By.xpath("//p[@class='has-text-primary-light']")).getText();
		String[] country = c_names.split("-");

		int c =country.length;
		System.out.println(c);

		if (a==c) {
			for (String name : country) {
				System.out.println(name);

			}
			System.out.println("---------------");
			System.out.println("All Data Retrived");
		}
		else {
			System.out.println("Something went wronge");
		}

		System.out.println("**Test Case End**");

		driver.quit();
	}
}




















