package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviLogIn {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// load the URL
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//login
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("vlpylsqtgjibctztvh@ckptr.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("login-btn")).click();
		
		//// Verify login
		String pageTitleAfterLogin = driver.getTitle();
		if (pageTitleAfterLogin.contains("GUVI")) {
			System.out.println("User logged in successfully.");
		} else {
			System.out.println("Failed to login user.");
		}
		
		 driver.quit();
	}

}
