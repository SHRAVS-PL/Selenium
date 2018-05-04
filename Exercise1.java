package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
        System.out.println("The total links are "+ driver.findElements(By.tagName("a")).size());
        
        WebElement footer = driver.findElement(By.xpath("//*[@id='hlGlobalFooter']"));
        System.out.println("footer links are " +footer.findElements(By.tagName("a")).size());
        
        WebElement section = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
        System.out.println("section links are "+section.findElements(By.tagName("a")).size());
        
        driver.findElement(By.linkText("Site map")).click();
        System.out.println("driver.getTitle()");
        System.out.println("link count for site map is " +driver.findElements(By.tagName("a")).size());
	}

}
