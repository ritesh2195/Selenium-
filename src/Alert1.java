	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class Alert1 {
	
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

	        driver.get("http://demo.guru99.com/test/delete_customer.php");
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        driver.findElement(By.name("cusid")).sendKeys("jdjndkjk");
	        
	        driver.findElement(By.name("submit")).click();
	        
	        Alert alt=driver.switchTo().alert();
	        
            String txt=alt.getText();
	        
	        System.out.println(txt);
	        
	        alt.accept();
	        
	      
			
			
		}
	
	}
