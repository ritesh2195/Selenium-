	package IFrame;

	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class toolsqa1 extends ChromeOptions1 {
		
		 WebDriver driver=null;
	    @Test
		public  void AB() {
	    	
	    	System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");
			
			driver=new ChromeDriver(options);
			
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
