package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import utility.DatePicker;

public class MyInfoPage extends BasePage {
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")WebElement myinfoclick;
	@FindBy(xpath="//input[@name='firstName']")WebElement firstName;
	@FindBy(xpath="//input[@name='lastName']")WebElement lastName;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")WebElement empId;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[5]")WebElement license;
	@FindBy(xpath="(//i[contains(@class,'calendar oxd-date-input-icon')])[1]")WebElement date;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[7]")WebElement ssNo;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[8]")WebElement sinNo;
	@FindBy(xpath="(//i[contains(@class,'down-fill oxd-select-text--arrow')])[1]")WebElement drp1;
	@FindBy(xpath="(//i[contains(@class,'down-fill oxd-select-text--arrow')])[2]")WebElement drp2;
	@FindBy(xpath="(//i[contains(@class,'calendar oxd-date-input-icon')])[2]")WebElement dob;
	@FindBy(xpath="(//span[contains(@class,'label-right oxd-radio-input')])")WebElement radio1;
	@FindBy(xpath="(//input[contains(@class,'oxd-input--active')])[13]")WebElement military;
	@FindBy(xpath="(//i[contains(@class,'oxd-checkbox-input-icon')])")WebElement smoker;
	@FindBy(xpath="(//i[contains(@class,'down-fill oxd-select-text--arrow')])[3]")WebElement blood;
	@FindBy(xpath="(//button[@type='submit'])[2]")WebElement save1;
	@FindBy(xpath="//i[contains(@class,'bi-plus oxd-button-icon')]")WebElement attach;
	@FindBy(xpath="//div[@class='oxd-file-button']")WebElement browse;
	

	public MyInfoPage()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void myclick(String fName, String lName,String id, String lics, String ss, String sin)
	{
		myinfoclick.click();
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		empId.sendKeys(id);
		license.sendKeys(lics);
	   // Date date1=new Date();
	   // date.datpicker("2023-05-05");
		ssNo.sendKeys(ss);
		sinNo.sendKeys(sin);
		
	
	}

	
 
	
	
	
	

}
