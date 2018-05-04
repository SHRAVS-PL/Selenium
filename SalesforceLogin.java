package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceLogin {

	public static void main(String[] args) {
    /* System.setProperty("webdriver.gecko.driver", "E:/Selenium_software/geckodriver.exe");	
     WebDriver driver = new FirefoxDriver();
     driver.get("https://login.salesforce.com/");
     driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("1qw@w.com");
     driver.findElement(By.cssSelector("input[name*='pw']")).sendKeys("12ws");
     driver.findElement(By.name("Login")).click();*/
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("asd");
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("123");
        driver.findElement(By.xpath("//*[contains(@name,'proc')]")).click();
	}

}
