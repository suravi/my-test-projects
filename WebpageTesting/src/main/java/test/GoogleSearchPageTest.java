package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchpageObject;

public class GoogleSearchPageTest {

	private static WebDriver driver= null;

	public static void main(String[] args) {
		GoogleSearchTest();
	}

	public static void GoogleSearchTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		GoogleSearchpageObject searchpageObject= new GoogleSearchpageObject (driver);
		driver.get("https://www.google.com/");
		searchpageObject.setTextInSearchBox("abc");
		searchpageObject.clickSearchButton();

		/*	GoogleSearchPage.textbox_search(driver).sendKeys("testing everything possible");
		//driver.findElement(By.name("btnK")).click();
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		//GoogleSearchPage.button_search(driver).click();
		System.out.println(driver.getCurrentUrl());*/
		driver.close();
	}
}
