package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
				// load the URL
				driver.get("https://www.guvi.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//SignUp 
				driver.findElement(By.linkText("Sign up")).click();
				driver.findElement(By.className("form-control")).sendKeys("jack");
				driver.findElement(By.id("email")).sendKeys("vlpylsqtgjibctztvh@ckptr.com");
				driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("7502807058");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
				driver.findElement(By.id("signup-btn")).click();
				
	}

}
