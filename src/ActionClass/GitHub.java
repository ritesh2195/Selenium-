	package ActionClass;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class GitHub {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	     
			System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
						        
			options.addArguments("start-maximized");
						        
			options.addArguments("--disable-infobars");
						    
			options.addArguments("--disable-popup-blocking");
						        
			options.addArguments("--no-sandbox");
						        
			options.addArguments("--disable-dev-shm-usage");
						       
			WebDriver driver = new ChromeDriver(options);

			driver.get("https://github.com/");
						
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			JavascriptExecutor jsExec=(JavascriptExecutor)driver;
			
			jsExec.executeScript("window.scrollBy(0,600)");
			
			Thread.sleep(5000);
			
			jsExec.executeScript("window.scrollBy(0,600)");
			
			WebElement element=driver.findElement(By.xpath("//*[text()='Enterprise']"));
			
		    jsExec.executeScript("arguments[0].click();",element );


			
			
		}
	
	}
