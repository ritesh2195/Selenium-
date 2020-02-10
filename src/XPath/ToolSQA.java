	package XPath;

		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		
		public class ToolSQA {
	
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
	    	
	        driver.get("https://www.toolsqa.com/automation-practice-form/");
	        
            driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("ritesh");
	        
	        driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("mishra");
	        
	        driver.findElement(By.cssSelector("*[id^='datepicker']")).sendKeys("11/11/2019");
	        
	       
	        
		}
	
	}
