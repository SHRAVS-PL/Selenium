package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethod {

	public static void main(String args[]){
		
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.findElement(By.xpath("//*[@id='js-MultiCityOptions']/div/div[1]/div[3]/input")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='multicity']/label")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='js-MultiCityOptions']/div/div[1]/div[3]/input")).isDisplayed());

		
	}
}
