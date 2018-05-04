package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver","E:/Selenium_software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://book.spicejet.com/search.aspx");
	Select s = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
	s.selectByValue("2");
    s.selectByVisibleText("3");
    s.selectByValue("5");
}
}
   