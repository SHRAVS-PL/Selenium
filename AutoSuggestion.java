package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
	    
		driver.findElement(By.name("fromPlaceName")).sendKeys("BENG");
		JavascriptExecutor js = (JavascriptExecutor)driver;
        String text = (String) js.executeScript("return document.getElementById(\"fromPlaceName\").value;");
        int i=0;
	    while(!text.equals("BENGALURU INTERNATION AIPORT")){
	    	i++;
    		driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);

                text = (String) js.executeScript("return document.getElementById(\"fromPlaceName\").value;");
        		System.out.println(text);
        		if(i>10) {
        			break;
        		}

        	}
	    
	    if(i<10) {
	    	System.out.println("Element found");
	    }
	    else
	    	System.out.println("Not found");
        }
}

