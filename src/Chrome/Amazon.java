 package Chrome;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	
	public class Amazon {

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("http://amazon.com");
    
//    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi Note 8 mobile phone");
//    
//    driver.findElement(By.xpath("//*[@value='Go']")).click();
    
   driver.findElement(By.xpath("//*[text()='Hello. Sign in']"));
    
//     WebElement element= driver.findElement(By.className("nav-line-3"));
//    
//    Actions action=new Actions(driver);
//    
//    action.moveToElement(element).build().perform();
//    
    
    
    
		
	}

}
