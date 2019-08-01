/**
 * 
 */
package TradewindsPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author Meher
 *
 */
public class loginPage {
	WebDriver driver= null;
	By loginmenu=By.className("dropdown-toggle");
 	By userename=By.id("username");
	By userpassword=By.id("password");
	By loginbutton=By.id("login_button");
	 
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}

	
	public void signin() {
		System.out.println("In POM");
		driver.findElement(loginmenu).click();
		System.out.println("clicking dropdown");
		driver.findElement(userename).sendKeys("testuser");
		driver.findElement(userpassword).sendKeys("testuser");
		driver.findElement(loginbutton).click();
	}
}
