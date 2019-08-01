/**
 * 
 */
package TradewindsTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import TradewindsPageObjects.*;
/**
 * @author Meher
 *
 */
public class Tradewinds {
	
	private static WebDriver driver= null;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tradewinds home = new Tradewinds();
		home.invokeBrowser();
		home.homepage();
		home.closeBrowser();
	}
	public void invokeBrowser() {
		try {
			System.out.println("invokingBrowser from POM version");
		// initialte browser using webdriver manager code
		/*	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();*/
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		

}
	
	public void closeBrowser() {
		driver.close();
	}
	
			public void homepage() {
			loginPage page= new loginPage(driver);
			
			System.out.println("Navigating to www.tradewindsnews.com");
			driver.get("https://www.tradewindsnews.com/");
			System.out.println(driver.getCurrentUrl());
			page.signin();
			
	}
			
}
