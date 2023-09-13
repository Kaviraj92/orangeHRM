package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo
{
	private static Logger  logger=LogManager.getLogger(Log4jdemo.class);
	
	public static void main(String [] arg)
	{
		
		System.out.println("\n Hello...! \n");
		
		logger.error("This is an message");
		logger.fatal("This is fatal message");
		logger.info("This is information");
		
		System.out.println("\n Completed");
		
		
	}
	
	
}