package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import pages.MyInfoPage;

public class UtilityFile extends BasePage {
	
	//static MyInfoPage objref4;
	WebDriver driver;
	
public UtilityFile (WebDriver driver) {
		
		this.driver = driver;
	}
	
	public static void singledropdown(WebElement el) throws AWTException
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);	
	}
	
	public static void doubledropdown(WebElement el) throws AWTException
	{
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_DOWN);
		rb1.keyPress(KeyEvent.VK_DOWN);
		rb1.keyPress(KeyEvent.VK_DOWN);
		rb1.keyRelease(KeyEvent.VK_DOWN);
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyPress(KeyEvent.VK_ENTER);
	}
	public static void tripledropdown(WebElement el) throws AWTException
	{
		Robot rb2=new Robot();
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_ENTER);
		rb2.keyPress(KeyEvent.VK_ENTER);
	}
	
	public List<WebElement> getElements(By drp1) 
	{
		
		return driver.findElements(drp1);
	}

	public void selectValueFromDropdown(WebElement locator, String value) {
		
		List<WebElement> countryList = driver.findElements((By) locator);
		
		for (WebElement ele : countryList) {
			
			String text = ele.getText();
			//System.out.println(text);
			
			if(text.equals(value)) {
				
				ele.click();
				break;
			}
		}
		
		
	}
	
	public void clickElementByJS(By element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	
	}
	
	
	}
	


