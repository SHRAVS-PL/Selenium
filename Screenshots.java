package basics;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshots {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver", "E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    driver.get("https://www.google.com/");
		File fs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs,new File("D:\\Screenshot.png"));
	}

}  
