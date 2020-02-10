		package CSSSPECIAL;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		
		public class facebook {
				
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
				   
			    ChromeOptions options = new ChromeOptions();
		        
		        options.addArguments("start-maximized");
		        
		        options.addArguments("--disable-infobars");
		        
		        options.addArguments("--incognito");
		        
		        options.addArguments("--disable-popup-blocking");
		        
		        options.addArguments("--no-sandbox");
		        
		        options.addArguments("--disable-dev-shm-usage");
		        
		    	WebDriver driver=new ChromeDriver(options);
		    	
		        driver.get("https://www.facebook.com/");
		        
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		        
		        int a=driver.findElements(By.cssSelector("input[class^='inputtext login_form_input_box']")).size();
		        
		        System.out.println(a);
		        
		        driver.findElements(By.cssSelector("input[class^='inputtext login_form_input_box']")).get(1).sendKeys("ghghh");
		        
		        boolean select=driver.findElement(By.cssSelector("*[name^='sex']")).isSelected();
		        
		        System.out.println(select);
		        
		        boolean select1=driver.findElement(By.cssSelector("*[name^='sex']")).isEnabled();
		        
		        String attribute=driver.findElement(By.cssSelector("*[name^='sex']")).getAttribute("id");
		        
		        System.out.println(attribute);
		        
		        System.out.println(select1);
			}
		
		}
