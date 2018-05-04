package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.linkText("Forgot account?")).click();
		
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hi");
		driver.findElement(By.id("password")).sendKeys("1232");
		driver.findElement(By.id("Login")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("123ee");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("#u_0_2")).click();
	}

}
