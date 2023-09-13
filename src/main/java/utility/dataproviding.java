package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testdata.DataUtils;

public class dataproviding
{
	
	@Test(dataProvider ="getData", dataProviderClass = DataUtils.class)
	
	public void login(String data[])
	{
		
		System.err.println("FirstName: "+ data[0]);
		System.err.println("LastName: "+ data[1]);
		//System.err.println()
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys(data[0]);
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(data[1]);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.getTitle();
		driver.close();*/
		
		driver.get("https://fluentforms.com/forms/contact-form-demo/");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data[0]);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data[1]);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(data[2]);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys(data[3]);
		driver.findElement(By.xpath("//textarea[@placeholder='Your Message']")).sendKeys(data[4]);
		
		
		
	}
	
	
}