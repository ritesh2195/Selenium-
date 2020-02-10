	package Firefox;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class DropDown {
		
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
			
	WebDriver driver = new 	FirefoxDriver();
			
	driver.manage().window().maximize();
			
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	
	WebElement dropdown=driver.findElement(By.id("continents"));
	   
	Select select=new Select(dropdown);
	   
	select.selectByVisibleText("North America");
	
		}
		
	}
