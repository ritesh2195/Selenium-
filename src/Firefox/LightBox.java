		package Firefox;
	
		import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class LightBox {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
					
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		
		Thread.sleep(5000);
			 
		driver.findElement(By.id("lightbox1")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".close.cursor")).click();
		}
	
	}
