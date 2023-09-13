package testing;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import base.BasePage;
import pages.AdminPage;
import pages.Loginpage;
import pages.MyInfoPage;

public class MyInfoTest extends BasePage {
	
	Loginpage objref;
	AdminPage objref1;
	MyInfoPage objref2;
	
	public MyInfoTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup()
	
	{
		initialize();
		objref =new Loginpage();
		objref.adminLogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		objref1=new AdminPage();
		objref2=new MyInfoPage();
		
	}
	
	@DataProvider()
	public Object[][] getTestDataForMechPerBackOffice() {
		
		
		
		try {
			return utility.ExcelUtil.readTestData(BaseConstants.Constants.MYINFO_MODULE_TEST_PATH, 
					BaseConstants.Constants.MYINFO_MODULE_TEST_SHEET_NAME);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	@Test(dataProvider ="getTestDataForMechPerBackOffice")
	public void myinforpage(String fName,String lName,String id,String lics,String ss,String sin)
	{
		objref2.myclick(fName, lName, id, lics, ss, sin);
		
		
		
	}
	
	
	


}

