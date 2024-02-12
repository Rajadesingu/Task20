package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		String expMonth = "March 2024";
		int expDate = 22;

		WebDriver driver = new ChromeDriver();

		// load the URL
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// switching to iframe
		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click();

		while (true) {
			// capturing month
			String actMonth = driver.findElement(By.className("ui-datepicker-title")).getText();

			if (actMonth.equals(expMonth)) {

				break;
			} else

			{

				// next click
				driver.findElement(By.linkText("Next")).click();

			}

		}
			//print the selected date on console as output
		
			driver.findElement(By.linkText("22")).click();
			WebElement ele = driver.findElement(By.id("datepicker"));
			String text = ele.getAttribute("value");
			System.out.println(text);

	}

}
