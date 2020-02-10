			package Chrome;
		
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
			
			public class facebookXPath {
	
		    public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://facebook.com");
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hyuhbu");
			
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("vbjbjb");
			
			driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
			
		}
	
	}
