	package XPath;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class GitHub {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    
			System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
			   
		    ChromeOptions options = new ChromeOptions();
	        
	        options.addArguments("start-maximized");
	        
	        options.addArguments("--disable-infobars");
	        
	        options.addArguments("--disable-popup-blocking");
	        
	        options.addArguments("--no-sandbox");
	        
	        options.addArguments("--disable-dev-shm-usage");
	        
	    	WebDriver driver=new ChromeDriver(options);
	    	
	        driver.get("https://github.com/");
	        
	        driver.findElement(By.xpath("//*[@id='user[login]']")).sendKeys("ritesh");
	        
	        driver.findElement(By.xpath("//*[contains(@name,'user[email]')]")).sendKeys("bhjbjbjn");
	        
	        driver.findElement(By.cssSelector("*[type^='password']")).sendKeys("ghnbgvg");
		}
	
	}
