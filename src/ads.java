import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
		
		driver.findElement(By.xpath("//*[@title='Printed Summer Dress']")).click();
		
		driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		
		Thread.sleep(10000);
		
		//driver.switchTo().alert();
		
		driver.findElement(By.xpath("//*[@title='Proceed to checkout']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.className("standard-checkout")).click();
		
		//driver.findElement(By.id("order")).click();
		
//		Thread.sleep(10000);
		
//		driver.findElement(By.xpath("//*[@name='processAddress']")).click();
//		
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//*[@name='processCarrier']")).click();
		
	}

}
