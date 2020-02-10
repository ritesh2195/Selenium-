	package ActionClass;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class AJAX {
	
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

			driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
						
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[text()='16']")).click();
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceholder1_Label1")));
			
			
			
		}
	
	}
