	package IFrame;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;
	
	public class toolsqa {
	
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

	        driver.get("https://www.toolsqa.com/iframe-practice-page");
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        WebElement element=driver.findElement(By.name("iframe1"));
	        
	        driver.switchTo().frame(element);
	        
	        driver.findElement(By.xpath("//*[text()='Tutorial']")).getAttribute("class");
	        
	        driver.switchTo().defaultContent();
	        
	        WebElement element1=driver.findElement(By.name("iframe2"));
	        
	        driver.switchTo().frame(element1);
	        
	        driver.findElement(By.xpath("//*[text()='Sortable']")).click();
	        
	        String attribute=driver.findElement(By.xpath("//*[text()='Sortable']")).getAttribute("href");
	        
	        System.out.println(attribute);
	        	       
		}
	
	}
	
