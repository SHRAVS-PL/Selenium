package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/tooldropdown.htm");
		/*driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		driver.findElement(By.xpath("//input[@value='Beer']")).click();*/
		int count = driver.findElements(By.name(" ")).size();
		for (int i=0;i<count;i++){
			String text = driver.findElements(By.name("choice")).get(i).getText();
		
		if(text.equals("YAHOO")){
			driver.findElements(By.name("choice")).get(i).click();
		}
		}
	}
}
