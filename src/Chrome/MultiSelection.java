	package Chrome;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
	
	public class MultiSelection {
	
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","E:\\selenium-java-3.141.59\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
	        
    options.addArguments("start-maximized");
	        
	options.addArguments("--disable-infobars");
	    
	options.addArguments("--disable-popup-blocking");
	        
	options.addArguments("--no-sandbox");
	        
	options.addArguments("--disable-dev-shm-usage");
	       
	WebDriver driver = new ChromeDriver(options);

	driver.get("http://omayo.blogspot.com/");
	
	WebElement multiselect=driver.findElement(By.id("multiselect1"));
	
	Select select=new Select( multiselect);
	
	select.selectByVisibleText("Hyundai");
	
	select.selectByVisibleText("Swift");
		}
	
	}
