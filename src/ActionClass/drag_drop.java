	package ActionClass;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
	
	public class drag_drop {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
					        
		options.addArguments("start-maximized");
					        
		options.addArguments("--disable-infobars");
					    
		options.addArguments("--disable-popup-blocking");
					        
		options.addArguments("--no-sandbox");
					        
		options.addArguments("--disable-dev-shm-usage");
					       
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://demo.guru99.com/test/drag_drop.html");
					
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		WebElement element=driver.findElements(By.id("fourth")).get(1);
			
		WebElement element1=driver.findElement(By.id("amt8"));
			
		Actions objActions=new Actions(driver);
			
		objActions.dragAndDrop(element, element1).build().perform();
			
		}
	
	}
