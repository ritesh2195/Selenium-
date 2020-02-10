	package ActionClass;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	
	public class Facebook {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
            System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
			
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	
			driver.get("http://facebook.com");
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			WebElement element=driver.findElement(By.name("email"));
			
			WebElement element1=driver.findElement(By.name("pass"));
			
			WebElement element2=driver.findElement(By.id("loginbutton"));
			
			Actions action=new Actions(driver);
			
		    //action.moveToElement(element).sendKeys("jsbjd").moveToElement(element1).sendKeys("cjbjkxcn").moveToElement(element2).click().build().perform();
			
			action.moveToElement(element).sendKeys(element, "hsjbjn").moveToElement(element1).sendKeys(element1, "bjbj").moveToElement(element2).click().build().perform();
			
		}
	
	}
