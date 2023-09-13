package pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import utility.DatePicker;

public class Loginpage extends BasePage {
	
	@FindBy(xpath="(//img)[1]")WebElement pageTitl;
	@FindBy(xpath="//h5[text()='Login']")WebElement loginText;
	@FindBy(xpath="//input[@name='username']")WebElement userName;
	@FindBy(xpath="//input[@name='password']")WebElement passWord;
	@FindBy(xpath="//button[@type='submit']")WebElement loginButton;
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")WebElement myinfo;
	@FindBy(xpath="//input[@placeholder='yyyy-mm-dd']")WebElement swit;
	
	//@FindBy(xpath="//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")WebElement date;
	
	//@FindBy(xpath="(//i)[4]")WebElement drpButton;
	//@FindBy(xpath="//a[@href='/web/index.php/auth/logout']")WebElement logOut;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String  getPageTitle()
	{
		return driver.getTitle();
	}
	public boolean logText()
	{
		return loginText.isDisplayed();
		
	}
	public void adminLogin(String user, String pass) throws InterruptedException
	{
		userName.sendKeys(user);
		
		passWord.sendKeys(pass);
		takeScreen();

		loginButton.click();

	}
	
	public void info()
	{
	myinfo.click();	
	swit.sendKeys("2022-05-20");
	//DatePicker da=new DatePicker();
	//da.datpicker("2021-05-20");
	
	}
	
	//public void adminLogout() {
		//drpButton.click();
		//logOut.click();
	//}
	
	
}

