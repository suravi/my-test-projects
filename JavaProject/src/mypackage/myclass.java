package mypackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;


public class myclass {



	WebDriver driver;

	//@Test(priority = 0)
	public void invokeBrowser() {
		try {
			System.out.println("invokingBrowser");
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

	//@Test(priority = 1)
   public void Logo() {
		System.out.println("clicking logo");
		driver.get("https://www.tradewindsnews.com/");
		driver.findElement(By.className("site_logo")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.getCurrentUrl().contains("https://www.tradewindsnews.com/") || driver.getPageSource().contains("</html>"))
		{
	System.out.println("page is not broken");
	System.out.println(driver.getCurrentUrl());
		}
		else driver.quit();
	}
		
//	@Test(priority = 8)
	public void closeBrowser() {
		driver.close();
	}
	
	public static void main(String[] arguments) {
		System. out. println("Let's do something using Java technology.");
		myclass invokeB=new myclass();
		invokeB.invokeBrowser();
		invokeB.Logo();
		invokeB.closeBrowser();
		
		}
}