package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) throws Exception {



		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=Af_xneGwmDiuJ3tfEJ0b2sRYy6upY9iUVG-ygjlEDxx1csuif9ennQ40MLdoBhHxAHTrehgNlzla&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.findElement(By.xpath("(//div[@role='link'])[5]")).click();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("piyushahirkar22@gmail.com");  //piyushahirkar22@gmail.com
		
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Piyush@1996");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();

		Thread.sleep(3000);  



	}

}
