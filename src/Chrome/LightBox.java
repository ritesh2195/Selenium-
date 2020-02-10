		package Chrome;

		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		
		public class LightBox {
		
		public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver","E:\\selenium-java-3.141.59\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
				        
		options.addArguments("start-maximized");
				        
		options.addArguments("--disable-infobars");
				    
		options.addArguments("--disable-popup-blocking");
				        
		options.addArguments("--no-sandbox");
				        
		options.addArguments("--disable-dev-shm-usage");
				       
		WebDriver driver = new ChromeDriver(options);

        driver.get("http://omayo.blogspot.com/p/lightbox.html");
		
		Thread.sleep(5000);
			 
		driver.findElement(By.id("lightbox1")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".close.cursor")).click();
		
			}
		
		}
