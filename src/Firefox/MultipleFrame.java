	 package Firefox;

	 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
		
	 public class MultipleFrame {
	
	 public static void main(String[] args) {
			
	 System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
			
	 WebDriver driver = new FirefoxDriver();
			
	 driver.get("http://omayo.blogspot.com/");
		
	 WebElement FrameOne=driver.findElement(By.id("iframe1"));
		
	 driver.switchTo().frame(FrameOne);
		
	 driver.findElement(By.linkText("Hotels")).click();
	 
	 driver.switchTo().defaultContent();
	 
	 driver.findElement(By.name("q")).sendKeys("Ritesh");
	
		}
	
	}
