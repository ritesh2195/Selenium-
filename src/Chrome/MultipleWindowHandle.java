		    package Chrome;
	
			import java.util.Iterator;
			import java.util.Set;
			import java.util.concurrent.TimeUnit;
			
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.openqa.selenium.chrome.ChromeOptions;
			
			public class MultipleWindowHandle {
		
			public static void main(String[] args) {
			
		    System.setProperty("webdriver.chrome.driver","E:\\selenium-java-3.141.59\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        
	        options.addArguments("start-maximized");
	        
	        options.addArguments("--disable-infobars");
	    
	        options.addArguments("--disable-popup-blocking");
	        
	        options.addArguments("--no-sandbox");
	        
	        options.addArguments("--disable-dev-shm-usage");
	       
	        WebDriver driver = new ChromeDriver(options);

	        driver.get("http://omayo.blogspot.com/");
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
            driver.findElement(By.linkText("Open a popup window")).click();
            
            driver.findElement(By.linkText("Blogger")).click();
            
	       // String parentWindowID= driver.getWindowHandle();
            
	        Set<String> set= driver.getWindowHandles();
	        
	        Iterator<String> itr=set.iterator();
	        
	        while (itr.hasNext()) {
	        	
	        String childWindowID=itr.next();
	        	
	        driver.switchTo().window(childWindowID);
	        	
	     	String windowTitle=driver.getTitle();
	     		
	     	if(windowTitle.equals("Basic Web Page Title")) {
	     			
	     	String txt=	driver.findElement(By.id("para1")).getText();
	     		
	     	System.out.println(txt);
		}
	
	}
}
}
