	        package Chrome;

			import java.util.Iterator;
			import java.util.Set;
			
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.openqa.selenium.chrome.ChromeOptions;
			
			public class MultipleWindows {
		
			public static void main(String[] args) {
			// TODO Auto-generated method stub
	
		    System.setProperty("webdriver.chrome.driver","E:\\selenium-java-3.141.59\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        
	        options.addArguments("start-maximized");
	        
	        options.addArguments("--disable-infobars");
	    
	        options.addArguments("--disable-popup-blocking");
	        
	        options.addArguments("--no-sandbox");
	        
	        options.addArguments("--disable-dev-shm-usage");
	       
	        WebDriver driver = new ChromeDriver(options);

	        driver.get("http://omayo.blogspot.com/");
	      
            driver.findElement(By.linkText("Open a popup window")).click();
            
            driver.findElement(By.linkText("Blogger")).click();
            
	        String parentWindowID= driver.getWindowHandle();
	        
	        Set<String> set= driver.getWindowHandles();
	        
	        Iterator<String> itr=set.iterator();
	        
	        while (itr.hasNext()) {
	        	
	        String childWindowID=itr.next();
	        	
	        if(!parentWindowID.equals(childWindowID)) {
	        		
	        driver.switchTo().window(childWindowID);
	        		
	        System.out.println(driver.getTitle());
	        		
	        	}
	        }
		}
	
	}
