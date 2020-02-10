	  package Chrome;
	
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.openqa.selenium.chrome.ChromeOptions;
	  import org.openqa.selenium.remote.DesiredCapabilities;
		
	  public class chromeCapabilities {
		  
	  public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\chromedriver.exe");
	  
	  ChromeOptions objChromeOptions = new ChromeOptions();
	  
	  objChromeOptions.addArguments("start-maximized");
	  
      objChromeOptions.addArguments("--incognito");
      
      objChromeOptions.addArguments("--disable-popup-blocking");
      
      objChromeOptions.addArguments("--no-sandbox");
      
      objChromeOptions.addArguments("--disable-dev-shm-usage");
	
	  DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
		   
	  chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, objChromeOptions);
		   
	  @SuppressWarnings("deprecation")
		   
	  WebDriver driverLocal= new ChromeDriver(chromeCapabilities);
		
	  driverLocal.get("https://facebook.com");
		   
		   
		   
	}
}
