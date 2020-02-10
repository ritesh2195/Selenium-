	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class windowHandle1 {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");

		    ChromeOptions options = new ChromeOptions();
					        
			options.addArguments("start-maximized");
					        
			options.addArguments("--disable-infobars");
					    		        
			options.addArguments("--no-sandbox");
					        
			options.addArguments("--disable-dev-shm-usage");
					       
			WebDriver driver = new ChromeDriver(options);

	        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        String parentWindowID=driver.getWindowHandle();
	        
	        System.out.println("parent window handle "+parentWindowID );
	        
	        WebElement newWindow=driver.findElement(By.id("Win1"));
	        
	        newWindow.click();
	        
	        Set<String> windowHandles=driver.getWindowHandles();
	        
	        for(String handle: windowHandles)
	        {
	            if(!handle.equals(parentWindowID))
	            {
	            driver.switchTo().window(handle);
	            
	            Thread.sleep(1000);
	            
	            System.out.println("Title of the new window: " + driver.getTitle());
	        
	            System.out.println("Closing the new window...");
	            
	            driver.close();
	            
		}
	        } 
	        
	        
	        
	        }
		}
	        
