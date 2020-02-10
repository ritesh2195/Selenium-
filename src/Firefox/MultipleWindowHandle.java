	package Firefox;

	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class MultipleWindowHandle {
		
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
	
	WebDriver driver = new 	FirefoxDriver();
	
	driver.get("https://omayo.blogspot.com");
	
	driver.findElement(By.linkText("Open a popup window")).click();
	
	driver.findElement(By.linkText("Blogger")).click();
	
	// String parentWindowID= driver.getWindowHandle();
	
     Set<String> set= driver.getWindowHandles();
     
     Iterator<String> itr=set.iterator();
     
     while (itr.hasNext()) {
    	 
     String childWindowID=itr.next();
     
     driver.switchTo().window(childWindowID);
     
     String windowTitle=driver.getTitle();
     
     if(windowTitle.equals("Basic Web Page Title")) {
     			
     String txt=	driver.findElement(By.id("para1")).getText();
     		
     System.out.println(txt);
     		}
     	
     		
     	}
     }

		}
	
	
