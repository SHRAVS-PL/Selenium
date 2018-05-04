package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrids {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20064/srh-vs-rr-4th-match-indian-premier-league-2018");
	    WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	    //parent to child traversal
	    int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	    String val = null;
	    
	    int sum = 0; 
	    for(int i=0;i< count-2;i++) {
	    	val= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	  System.out.println(val);
	    sum = sum+ Integer.parseInt(val);
	    }
	    //sibling to sibling traversal
	    System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	    
	     int extraval = Integer.parseInt(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	     int total = sum + extraval;
	     
	     int totalval = Integer.parseInt(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());

	     System.out.println(totalval +"," +total);
	     
	     if(totalval == total){
	    	 System.out.println("Passed");
	     }
	     else
	    	 System.out.println("Failed");
	
	}

}
