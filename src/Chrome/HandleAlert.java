		package Chrome;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class HandleAlert {
	
		public static void main(String[] args) throws InterruptedException {
		
			
        System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
			
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://omayo.blogspot.com");
	    
	    driver.findElement(By.id("alert1")).click();
	    
	    Alert alt = driver.switchTo().alert();
	    
	    String Txt=alt.getText();
	    
	    System.out.println(Txt);
	    
	    Thread.sleep(5000);
	    
	    alt.accept();
	    
	    Thread.sleep(5000);
	    
	    driver.switchTo().defaultContent();
	    
	    driver.close();
	    
	    
	    
	    
	    
	
		}
	
	}
