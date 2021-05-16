package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBase {

	
	
		WebDriver driver;	
		//String Browsertype = "Firefox";		
		public void browserlaunching(String browser, String url) throws InterruptedException {	
			System.setProperty("webdriver.chrome.driver", "/Users/bashiruddin/Documents/Selenium_java_2/chromedriver");		
			System.setProperty("webdriver.gecko.driver", "/Users/bashiruddin/Documents/Selenium_java_2/geckodriver");	
			if (browser.equalsIgnoreCase("Firefox")){		
				driver = new FirefoxDriver();								}		
			else 
			{			driver = new ChromeDriver();					}	
			//driver.get("https://macys.com");				
			//driver.navigate().to("https://www.amazon.com");		
			Thread.sleep(4000);				driver.navigate().to(url);//		
			//		Thread.sleep(4000);//		
			//		driver.navigate().back();//		
			//		Thread.sleep(4000);//		
			//		driver.navigate().forward();//		
			//		Thread.sleep(4000);				
			driver.navigate().refresh();		
			driver.manage().deleteAllCookies();				
			String url1 = driver.getCurrentUrl();				
			System.out.println(url1);		
			String title = driver.getTitle();		
			System.out.println(title);				
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	}	
		
			}
		

