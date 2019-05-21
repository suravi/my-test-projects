package ultimateQApageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	WebDriver driver= null;
	By useremail=By.id("user_email");
	By userpassword=By.id("user_password");
	By rememberme=By.id("user_remember_me");
	By signinbutton=By.id("btn-signin");
	

	By forgotpassword=By.className("forgot-password");
	By submitbutton=By.xpath("//*[@id=\"new_user\"]/input[3]");
	By signinlink=By.xpath("//*[@id=\"wrap\"]/header/div/div[2]/nav/ul[2]/li/a");
	
	By newaccount=By.linkText("Create a new account");
	By firstname=By.id("user_first_name");
	By lastname=By.id("user_last_name");
	By terms=By.id("user_terms"); 
	

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void signin() {
		driver.findElement(useremail).sendKeys("testuser@abc.com");
		driver.findElement(userpassword).sendKeys("testpassword");
		remembermestatus();
		//driver.findElement(By.id("user_remember_me")).click();
		driver.findElement(signinbutton).click();
		forgotpassword();
	}

	public void remembermestatus()
	{
		WebElement check=driver.findElement(rememberme);
		boolean status=check.isSelected();
		System.out.println(status);
		if(status==false) {
			check.click();
			System.out.println("it is now " +check.isSelected());
		}
		else System.out.println("Checkbox already selected. No click");

	}

	public void forgotpassword() {
		driver.findElement(forgotpassword).click();
		driver.findElement(useremail).sendKeys("testuser@abc.com");
		driver.findElement(submitbutton).click();
		WebElement check = driver.findElement(signinlink);
		boolean status=check.isDisplayed();
		System.out.println("forgot password visibility "+status);
		if(status==false) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			status=check.isDisplayed();
			System.out.println("after implicitwait status is " +status);
			check.click();
		}
		else { 


			/*WebDriverWait wait = new WebDriverWait(driver, 20);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wrap\"]/header/div/div[2]/nav/ul[2]/li/a")));

		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"wrap\"]/header/div/div[2]/nav/ul[2]/li/a")));

		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wrap\"]/header/div/div[2]/nav/ul[2]/li")));

		    driver.findElement(By.xpath("//*[@id=\"wrap\"]/header/div/div[2]/nav/ul[2]/li/a")).click();*/

			//parmanent overlays
			WebElement ele = driver.findElement(signinlink);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
		}

	}

	public void signup() {
		driver.findElement(newaccount).click();
		driver.findElement(firstname).sendKeys("firstName");
		driver.findElement(lastname).sendKeys("lastName");
		driver.findElement(useremail).sendKeys("abc@gmail.com");
		driver.findElement(userpassword).sendKeys("testpassword");
		driver.findElement(terms).click();
		//driver.findElement(By.id("recaptcha-anchor")).click();

	}

}
