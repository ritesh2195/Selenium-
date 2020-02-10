	package XPath;

		import java.util.concurrent.TimeUnit;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		
		public class Github1 {
	
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
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//*[text()='Enterprise']")).click();
	        
	        WebDriverWait wait =new WebDriverWait(driver, 20);
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div[1]/div/div[1]/div/a")));
	        
	        driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div[1]/div/div[1]/div/a")).click();
	        
	       
		}
	
	}
