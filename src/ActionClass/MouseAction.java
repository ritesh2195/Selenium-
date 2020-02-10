	package ActionClass;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
	
	public class MouseAction {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
				        
	    options.addArguments("start-maximized");
				        
		options.addArguments("--disable-infobars");
				    
		options.addArguments("--disable-popup-blocking");
				        
		options.addArguments("--no-sandbox");
				        
		options.addArguments("--disable-dev-shm-usage");
				       
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://global.oup.com/?cc=gb");
				
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
		//WebElement element=driver.findElement(By.xpath("//*[text()='About Us']"));
				
		WebElement element2=driver.findElement(By.xpath("//*[text()='Academic & Professional']"));
//		
//		WebElement element1=driver.findElement(By.xpath("//*[text()='Our Mission']"));
				
		Actions objActions=new Actions(driver);
		
		objActions.moveToElement(element2).perform();
				
		//objActions.moveToElement(element).moveToElement(element2).moveToElement(element1).click().build().perform();
				
		//WebElement element1=driver.findElement(By.xpath("//*[text()='Our Mission']"));
				
		//objActions.moveToElement(element1).click().build().perform();
				
		//WebElement element3=driver.findElement(By.xpath("//*[text()='Higher Education']"));
				
		//objActions.moveToElement(element3).click().build().perform();
		
		//WebElement element4=driver.findElement(By.xpath("//*[text()='Education']"));
		
		//objActions.contextClick(element4).build().perform();
			
		}
	
	}
