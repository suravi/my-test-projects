package ultimateQAautomation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ultimateQApageObject.*;

public class UltimateQATest {
	private static WebDriver driver= null;
	
	
	public static void main(String[] args) {
		UltimateQATest home =new UltimateQATest();
	//	Browser browser= new Browser(driver);
	//	browser.browseropen(driver);
		home.invokeBrowser();
	//	home.homepage();
		home.Signin();
		
	//	home.closeBrowser();
		//browser.closeBrowser();

	}
	
	
	public void invokeBrowser() {
		try {
			System.out.println("invokingBrowser from POM version");
			System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
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
			UltimateQAPage page= new UltimateQAPage(driver);
			
			System.out.println("Browsing UltimateQA automation helping homepage");
			driver.get("https://www.ultimateqa.com/");
			System.out.println(driver.getCurrentUrl());
			page.complicatedPage();
			page.facebook();
			page.buttonclick();
			page.twitterclick();
			page.search();
			page.formfillup();
			page.login();
			page.toggle();
			page.forgotpassword();
	}
			
			public void Signin() {
				SignInPage login= new SignInPage(driver);
				System.out.println("Testing SignIn page in Ultimate QA test automation site");
				driver.get("https://courses.ultimateqa.com/users/sign_in");
				System.out.println(driver.getCurrentUrl());
				//login.signin();
				login.signup();
				
			}
}
