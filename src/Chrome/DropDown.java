	   package Chrome;
	
	   import org.openqa.selenium.By;
	   import org.openqa.selenium.WebDriver;
	   import org.openqa.selenium.WebElement;
	   import org.openqa.selenium.chrome.ChromeDriver;
	   			import org.openqa.selenium.chrome.ChromeOptions;
	   import org.openqa.selenium.support.ui.Select;
	
	   public class DropDown {
				
	   public static void main(String[] args) {
					
	   System.setProperty("webdriver.chrome.driver","E:\\selenium-java-3.141.59\\chromedriver.exe");
	
	   ChromeOptions options = new ChromeOptions();
	   
	   options.addArguments("start-maximized");
												        
	   options.addArguments("--disable-infobars");
												        
	   options.addArguments("--incognito");
												        
	   options.addArguments("--disable-popup-blocking");
				        
	   options.addArguments("--no-sandbox");
				        
	   options.addArguments("--disable-dev-shm-usage");
				       
	   WebDriver driver = new ChromeDriver(options);
	
	   driver.get("http://omayo.blogspot.com/");
	   
	   WebElement dropdown=driver.findElement(By.id("drop1"));
	   
	   Select select=new Select(dropdown);
	   
	   select.selectByVisibleText("doc 2");
	
			}
		
		}
