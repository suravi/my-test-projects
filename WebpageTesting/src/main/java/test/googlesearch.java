package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;


public class googlesearch {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch() {

		System.out.println("invokingBrowser");
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		GoogleSearchPage.textbox_search(driver).sendKeys("abce");
		//driver.findElement(By.name("btnK")).click();
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		//GoogleSearchPage.button_search(driver).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
