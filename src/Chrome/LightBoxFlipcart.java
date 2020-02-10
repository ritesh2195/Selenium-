	package Chrome;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class LightBoxFlipcart {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  
			System.setProperty("webdriver.chrome.driver","E:\\selenium-java-3.141.59\\chromedriver.exe");

		    ChromeOptions options = new ChromeOptions();
					        
			options.addArguments("start-maximized");
					        
			options.addArguments("--disable-infobars");
					    
			options.addArguments("--disable-popup-blocking");
					        
			options.addArguments("--no-sandbox");
					        
			options.addArguments("--disable-dev-shm-usage");
					       
			WebDriver driver = new ChromeDriver(options);

	        driver.get("https://www.flipkart.com/");
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//*[text()='Login & Signup']")).click();
	        
	        driver.findElement(By.cssSelector("*[type^='text']")).sendKeys("bjbjkhn");
	        
	        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("jbxknnkb");
	        
	        driver.findElement(By.xpath("//*[contains @type, submit]")).click();
	        
	        
		}
	
	}
