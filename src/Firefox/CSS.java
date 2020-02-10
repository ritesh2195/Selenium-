	package Firefox;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class CSS {
	
	public static void main(String[] args) {
			
	System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
			
	WebDriver driver = new 	FirefoxDriver();
			
	driver.get("https://facebook.com");
	
	driver.findElement(By.cssSelector("#email")).sendKeys("ghfghbv");
	
	driver.findElement(By.cssSelector("#pass")).sendKeys("fbnjhgg");
		}
	
	}
