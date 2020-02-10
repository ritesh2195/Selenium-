package Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//*[@title='Log in to your customer account']")).click();
		driver.findElement(By.id("email")).sendKeys("riteshranjanmishra938@gmail.com");
		//driver.findElement(By.id("passwd")).sendKeys("mishra21");
		
	}

}
