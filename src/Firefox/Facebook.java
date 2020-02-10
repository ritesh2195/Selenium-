			package Firefox;
		
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.firefox.FirefoxDriver;
			import org.openqa.selenium.firefox.FirefoxOptions;
			
			public class Facebook {
			
			public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
			
			FirefoxOptions Options=new FirefoxOptions();
			
			Options.addArguments("start-maximized");
			
			Options.addArguments("--disable-infobars");
			
	        Options.addArguments("--incognito");
	        
	        Options.addArguments("--disable-popup-blocking");
	        
	        Options.addArguments("--no-sandbox");
	        
	        Options.addArguments("--disable-dev-shm-usage");
	        
			WebDriver driver = new 	FirefoxDriver();
			
			driver.get("https://facebook.com");
			
			driver.findElement(By.id("email")).sendKeys("ghvh");
			
			driver.findElement(By.id("pass")).sendKeys("tyfhv");
			
		    driver.findElement(By.linkText("Create a Page")).click();
			
		}
	
	}
