package ultimateQApageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UltimateQAPage {

	WebDriver driver= null;


	public  UltimateQAPage(WebDriver driver)
	{
		this.driver=driver;
	}


	public void complicatedPage()
	{
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("menu-item-587")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[2]/div/div[1]//div//li[1]/a")).click();
		System.out.println(driver.getCurrentUrl());
	}

	public void buttonclick() {
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[3]/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[3]/div[3]/div[3]/a")).click();
	}

	public void twitterclick() {
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[5]/div[1]/ul[1]//a")).click();
		driver.navigate().back();
	}

	public void facebook() {
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[5]/div[2]/ul[1]//a")).click();
		driver.navigate().back();
	}
	public void search() {
		driver.findElement(By.id("s")).sendKeys("abce");
		driver.findElement(By.id("searchsubmit")).click();
		driver.navigate().back();
	}
	
	public void formfillup() {
		driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("abce");
		driver.findElement(By.id("et_pb_contact_email_0")).sendKeys("abce@gmail.com");
		driver.findElement(By.id("et_pb_contact_message_0")).sendKeys("message body from selenium");

		String elementval1 = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/div/p/input")).getAttribute("data-first_digit");
		System.out.println("the value is " + elementval1);
		Integer.parseInt(elementval1);
		String elementval2 = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/div/p/input")).getAttribute("data-second_digit");
		int total = Integer.parseInt(elementval1) + Integer.parseInt(elementval2);
		String totalSt= Integer.toString(total);
		driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]//div/p/input")).sendKeys(totalSt);
		driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button")).click();
	}
	
	public void login() {
		String elementval1 = driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[7]/div[2]/div[2]/div[2]/form/p[1]/label")).getAttribute("for");
		System.out.println("the value is " + elementval1);
		driver.findElement(By.id(elementval1)).sendKeys("testuser");
		String elementval2 = driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[7]/div[2]/div[2]/div[2]//p[2]/label")).getAttribute("for");
		System.out.println("the value is " + elementval2);
		driver.findElement(By.id(elementval2)).sendKeys("mypassword");
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[7]/div[2]/div[2]/div[2]//button")).click();
		driver.navigate().back();
	}
	
	public void toggle() {
		driver.findElement(By.className("et_pb_toggle_title")).click();
	}
	public void forgotpassword() {
	
		//driver.findElement(By.className("et_pb_forgot_password")).click();
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]//div[7]//div[2]/div[2]//a")).click();
		driver.findElement(By.xpath("//*[@id=\"backtoblog\"]/a")).click();
		
	
	}
}
