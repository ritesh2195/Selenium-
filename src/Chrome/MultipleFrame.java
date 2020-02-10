	package Chrome;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class MultipleFrame {
	
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

		driver.get("http://omayo.blogspot.com/");
		
		WebElement FrameOne=driver.findElement(By.id("iframe1"));
		
		driver.switchTo().frame(FrameOne);
		
		driver.findElement(By.linkText("Hotels")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("q")).sendKeys("Ritesh");
		
		
		}
	
	}
