package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","E:/Selenium_software/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
     /* driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123@gmail.com");
      driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abracadabra");
      driver.findElement(By.xpath("//*[@value='Log In']")).click();
      driver.close();*/
      
      driver.findElement(By.cssSelector("input[type='email']")).sendKeys("123@gmail.com");
      driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123");
      driver.findElement(By.cssSelector("*[value='Log In']")).click();
      driver.close();
     
	}

}
