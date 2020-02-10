	package ActionClass;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	
	public class Naukari {
	
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

			driver.get("https://www.naukri.com/mnjuser/homepage");
					
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
			
			WebElement element=driver.findElement(By.xpath("//*[text()='Recruiters']"));
			
			WebElement element1=driver.findElement(By.xpath("//*[text()='Browse All Recruiters']"));
			
			Actions action=new Actions(driver);
			
			action.moveToElement(element).moveToElement(element1).click().build().perform();
			
		}
	
	}
