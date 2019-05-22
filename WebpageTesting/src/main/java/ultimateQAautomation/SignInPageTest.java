package ultimateQAautomation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import ultimateQApageObject.SignInPage;

public class SignInPageTest {
	private static WebDriver driver= null;
	
	public static void main(String[] args) {
	SignInPageTest login= new SignInPageTest();
	login.invokeBrowser();
	login.Signin();
	login.closeBrowser();

	}
	
	public void invokeBrowser() {
		try {
			
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.firefoxdriver().setup();
			
			System.out.println("invokingBrowser from POM version");
			//System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver= new FirefoxDriver();
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

	public void Signin() {
		SignInPage login= new SignInPage(driver);
		System.out.println("Testing SignIn page in Ultimate QA test automation site");
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		System.out.println(driver.getCurrentUrl());
		login.signin();
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		login.signup();
		
	}
	
	
}
