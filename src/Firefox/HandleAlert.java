	   package Firefox;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class HandleAlert {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-3.141.59\\geckodriver.exe");
			
			WebDriver driver = new 	FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://omayo.blogspot.com");
			
			driver.findElement(By.id("alert1")).click();
			
			Alert alt=driver.switchTo().alert();
			
			String Text=alt.getText();
			
			System.out.println(Text);
			
			Thread.sleep(5000);
			
			alt.accept();
			
			Thread.sleep(5000);
			
			driver.switchTo().defaultContent();
			
			driver.close();
			
		}
	
	}
