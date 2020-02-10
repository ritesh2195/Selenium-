	package XPath;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class facebook {
		
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
	    	
	        driver.get("https://www.facebook.com/");
	        
	        int k= driver.findElements(By.xpath("//body/div")).size();
	       
	        System.out.println(k);
	       
	        driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("ritezsh");
	        
	        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("bbnnn");
	        
	        String tagname=driver.findElement(By.xpath("//*[text()='Email or Phone']")).getTagName();
	        
	        System.out.println(tagname);
	        
	        String title=driver.getTitle();
	        
	        System.out.println(title);
	       
		}
	
	}
