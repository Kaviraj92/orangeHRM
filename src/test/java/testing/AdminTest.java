package testing;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BasePage;
import pages.AdminPage;
import pages.Loginpage;

public class AdminTest extends BasePage {
	
	Loginpage objref;
	AdminPage objref1;
	
	public AdminTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialize();
		objref =new Loginpage();
		objref.adminLogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		objref1=new AdminPage();
		
	}
	
	@Test
	public void admintesting() throws AWTException, InterruptedException
	{
		objref1.adModuleclick();
		Assert.assertTrue(objref1.userSys());
		objref1.nameUser(prop.getProperty("name"));
		objref1.drop1();
		objref1.nameEmp();
		objref1.drop2();
		objref1.addMethod();
		
	
		
	}

}
