package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","E:/Selenium_software/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
      driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
      driver.switchTo().alert().accept();
      
      driver.get("http://www.echoecho.com/javascript4.htm");
      driver.findElement(By.xpath("//input[@name='B2']")).click();
      driver.switchTo().alert().dismiss();
      
}
}
