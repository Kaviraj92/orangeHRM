package testing;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BasePage;
import pages.Loginpage;

public class LoginTest extends BasePage  {
	
	Loginpage objref;
	
	public LoginTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		objref =new Loginpage();
		
	}

	@Test
	public void admininout() throws InterruptedException
	{
		
		String expectedtitle="OrangeHRM";
		String actualtitle=objref.getPageTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		
		Assert.assertTrue(objref.logText());
		
		objref.adminLogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
		objref.info();
		
		//objref.adminLogout();
	}
}
