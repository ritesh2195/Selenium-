	            package Chrome;

				import java.util.concurrent.TimeUnit;
				
				import org.openqa.selenium.By;
				import org.openqa.selenium.WebDriver;
				import org.openqa.selenium.chrome.ChromeDriver;
				import org.openqa.selenium.chrome.ChromeOptions;
				
				public class GitHUb {
	
		        public static void main(String[] args) {
		        	
			// TODO Auto-generated method stub
		        	
			   System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
			   
			    ChromeOptions options = new ChromeOptions();
		        
		        options.addArguments("start-maximized");
		        
		        options.addArguments("--disable-infobars");
		        
		        options.addArguments("--incognito");
		        
		        options.addArguments("--disable-popup-blocking");
		        
		        options.addArguments("--no-sandbox");
		        
		        options.addArguments("--disable-dev-shm-usage");
		        
		    	WebDriver driver=new ChromeDriver(options);
		    	
		        driver.get("https://github.com");
		        
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		        
		        driver.findElement(By.cssSelector("Input.input-block")).sendKeys("jghhgf");
		        
		        driver.findElement(By.cssSelector("Input[name='user[email]']")).sendKeys("ghgvb");
		
		}
	
	}
