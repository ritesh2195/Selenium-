	package XPath;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
	
	public class Flipcart {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
			   
		    ChromeOptions options = new ChromeOptions();
	        
	        options.addArguments("start-maximized");
	        
	        options.addArguments("--disable-infobars");
	        
	        options.addArguments("--disable-popup-blocking");
	        
	        options.addArguments("--no-sandbox");
	        
	        options.addArguments("--disable-dev-shm-usage");
	        
	    	WebDriver driver=new ChromeDriver(options);
	    	
	        driver.get("https://www.flipkart.com/");
	        
	        Thread.sleep(10000);
	        
	        //driver.findElement(By.xpath("//*[text()='_2AkmmA']")).click();
	        
	        WebElement element=driver.findElement(By.className("_2aUbKa"));
	        
	        Actions action=new Actions(driver);
	        
	        action.moveToElement(element).build().perform();
	        
//	        driver.findElement(By.xpath("//*[contains(@name,'q')]")).sendKeys("mobiles");
//	        
//	        driver.findElement(By.xpath("//*[@type='submit']")).click();
	        
	        
		}
	
	}
