package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReCaptcha {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://arjun.apollomunichinsurance.com/dist/#/linkAadhar");
		int frame1 = findFrameNumber(driver,By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		
		int frame2 = findFrameNumber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(frame2);
		
	}
	
	public static int findFrameNumber(WebDriver driver,By by){
	
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		for(i =0;i<frameCount;i++){
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if(count>0) {
				driver.findElement(by).click();
				break;
			}
			else
				System.out.println("continue");
		}
		return i;
		}
		
}
