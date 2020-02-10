	    package Chrome;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		
		public class ToolSqa {
	
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

	        driver.get("https://www.facebook.com/");
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	       driver.findElement(By.cssSelector("input#email[data-testid='royal_email']")).sendKeys("ritesh");
	        
		}
	
	}
