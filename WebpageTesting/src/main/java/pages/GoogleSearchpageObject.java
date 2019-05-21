package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpageObject {
	WebDriver driver=null;
	By textbox_search = By.name("q");
	By button_seach= By.name("btnK");

	public GoogleSearchpageObject(WebDriver driver) {
		this.driver=driver;
	}

	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}

	public void clickSearchButton() {
		driver.findElement(button_seach).sendKeys(Keys.RETURN);
	}
}
