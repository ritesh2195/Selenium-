	package Chrome;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class EX12_BrowserOption {
	
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

    driver.get("https://facebook.com");
			        
	int k=driver.findElements(By.tagName("td")).size();
		             
	System.out.println(k);
		             
	driver.findElement(By.id("email")).sendKeys("gghgf");
		             
	driver.findElement(By.name("pass")).sendKeys("hgj");
				     
	driver.findElement(By.linkText("Create a Page")).click();
			         
			    }
		}
	
	
