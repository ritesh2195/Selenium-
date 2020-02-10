	package IFrame;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class ChromeOptions1 {
		
		public  ChromeOptions options=null;
	
		public  ChromeOptions getmain1() {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");

		    options = new ChromeOptions();
					        
		    options.addArguments("start-maximized");
					        
			options.addArguments("--disable-infobars");
					    
			options.addArguments("--disable-popup-blocking");
					        
			options.addArguments("--no-sandbox");
					        
			options.addArguments("--disable-dev-shm-usage");
					       
			return options;
			
		}
	
	}
