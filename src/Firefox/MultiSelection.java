	package Firefox;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class MultiSelection {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
		
	WebDriver driver = new 	FirefoxDriver();
				
	driver.manage().window().maximize();
				
	driver.get("http://omayo.blogspot.com/");
	
	WebElement multipleselect=driver.findElement(By.id("multiselect1"));
	
	Select select=new Select(multipleselect);
	
	select.selectByVisibleText("Swift");
	
	select.selectByVisibleText("Audi");
		
	
		}
	
	}
