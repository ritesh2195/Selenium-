			package Chrome;
		
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
			
			public class Facebook {
	
		    public static void main(String[] args) {
		    	
			// TODO Auto-generated method stub
		    	
			System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
			
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	
			driver.get("http://facebook.com");
			
			driver.findElement(By.id("email")).sendKeys("hiiii");
			
			driver.findElement(By.id("pass")).sendKeys("hjhjh");
			
			driver.findElement(By.id("loginbutton")).click();
			
			String str=driver.getCurrentUrl();
			
			System.out.println(str);
			
			String a=driver.getTitle();
			
			System.out.println(a);
			
			driver.quit();
				}
			
			}
