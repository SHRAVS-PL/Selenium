package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		
	  System.setProperty("webdriver.ie.driver","E://Selenium_software/IEDriverServer.exe");
      WebDriver driver = new InternetExplorerDriver();
      driver.get("http://google.com");
    //Safari browser - Need not use set property for safari but download webdriver for safari
    //WebDriver driver = new SafariDriver();

 
	}

}
