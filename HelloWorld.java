package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String args[]){
		
		System.setProperty("webdriver.gecko.driver","E://Selenium_software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
