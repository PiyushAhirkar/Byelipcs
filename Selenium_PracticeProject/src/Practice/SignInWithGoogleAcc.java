package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SignInWithGoogleAcc {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://auth.trivago.com/en-IN");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		Thread.sleep(2000);

//		List<WebElement> City_names =driver.findElements(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[3]/ul/li/div/span"));
//
//		List<String> cities = new ArrayList<>();
//
//
//		for( WebElement City_w : City_names) {
//
//			String city =City_w.getText();
//			cities.add(city);
//
//			//if city name present in list so will do click action  else skip/close screen
//			if(city.endsWith("Bengaluru")) {
//				City_w.click();
//
//			}
//		}

		//System.out.println(city);

		//to print all ciry names in console
//		cities.forEach(System.out::println);
//		//System.out.println(City);

		//System.out.println(city_names);

		Thread.sleep(2000);
		//Save win handles in veriable;
		String winHandleBefore = driver.getWindowHandle();
		System.out.println(winHandleBefore);

		// Click on SignIn Button
		driver.findElement(By.xpath("//body/div[@id='__next']/section[@class='PageTransition_TransitionWrapper__oWkR8']/div/div[@class='Layout_container__j176q']/main[@class='Layout_mainContentContainer__qKTUw']/div/a[1]")).click();
		Thread.sleep(2000);
		


		// Store the current window handle


		// Perform the click operation that opens new window
		//driver.findElement(By.xpath("//div[contains(text(),'Continue with Google')]")).click();
		Thread.sleep(5000);
		// Switch to new window opened
//		for(String winHandle : driver.getWindowHandles()){
//			driver.switchTo().window(winHandle);
//			System.out.println(winHandle);
//		}

		// Perform the actions on new window
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("piyushahirkar22@gmail.com");  //piyushahirkar22@gmail.com
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("piyushsumerudigital@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Piyush@2023");   //Piyush@1996
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		// Close the new window, if that window no more required
		//driver.close();
		Thread.sleep(3000);
		// Switch back to original browser (first window)
//		driver.switchTo().window(winHandleBefore);
//			driver.close();
		// Continue with original browser (first window)


			
		
		//		Thread.sleep(3000);  

	}

}
