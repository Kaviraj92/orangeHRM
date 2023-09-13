package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BasePage;
import utility.UtilityFile;

public class AdminPage extends BasePage  {
	
	@FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")WebElement adMin;
	@FindBy(xpath="//h5[contains(@class,'oxd-text oxd-text--h5 oxd-table-filter-title')]")WebElement sysUser;
	@FindBy(xpath="//div[contains(@class,'input-field-bottom-space')]"
			+ "//input[@class='oxd-input oxd-input--active']")WebElement useRName;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")WebElement drp;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")WebElement empName;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")WebElement drp2;
	//After this
	@FindBy(xpath="(//i[@class='oxd-icon bi-plus oxd-button-icon'])")WebElement add;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")WebElement adddrp1;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")WebElement emloyeeName;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")WebElement adddrp2;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")WebElement usName;
	@FindBy(xpath="(//input[@type='password'])[1]")WebElement pass1;
	@FindBy(xpath="(//input[@type='password'])[2]")WebElement pass2;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	
	
	public AdminPage()
	{
		PageFactory.initElements(driver, this);	
		}
	
	public void adModuleclick()
	{
		adMin.click();
	}
	public Boolean userSys()
	{
		return sysUser.isDisplayed();
	}
	
	public void nameUser(String name)
	{
		
		useRName.sendKeys(name);
	}
	public void drop1() throws AWTException
	{
		drp.click();
		UtilityFile.doubledropdown(drp);
	}
	public void nameEmp() throws AWTException, InterruptedException
	{
		empName.sendKeys("Fiona");
		Thread.sleep(3000);
		UtilityFile.singledropdown(empName);
	}
	public void drop2() throws AWTException
	{
		drp2.click();
		UtilityFile.tripledropdown(drp2);
	}
	
	//After before testing
	
	public void addMethod() throws AWTException, InterruptedException
	{
		add.click();
		adddrp1.click();
		UtilityFile.doubledropdown(adddrp1);
		emloyeeName.sendKeys("Fiona");
		Thread.sleep(4000);
		UtilityFile.singledropdown(emloyeeName);
		adddrp2.click();
		Thread.sleep(4000);
		UtilityFile.tripledropdown(adddrp2);
		usName.sendKeys("Aishwa");
		Assert.assertTrue(usName.isEnabled());
		Thread.sleep(4000);
		pass1.sendKeys("01@Raguram");
		pass2.sendKeys("01@Raguram");
		save.click();
	
		
		
	}
	
	

}
