package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.UtilityFile;

public class BasePage {

	public  static WebDriver driver;
	public static Properties prop;
	public static UtilityFile utilfile;
	public static Logger logger=null;
	
	public BasePage() {
		
		try {
			
			FileInputStream config=new FileInputStream("./src/main/java/app/config/config.properties");
			
			prop=new Properties();
			prop.load(config);
	
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		logger=Logger.getLogger(BasePage.class);
		
	}
	
	public static void initialize()
	{
		String Browser = prop.getProperty("BROWSER");
		if (Browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		
		else if (Browser.equals("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(Browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			}
		
		//BASIC METHODS
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	
	}
	
	public static void  takeScreen()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

	
	

