package com.assignment.testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SetResolutionTest extends Baseclass {
	
	@Test
	public void setResolution() {
		
		
		driver.get(Baseurl);
		Reporter.log("Url Entered Successfully");
		
		logger.info("Url Ebtered Successfully");
		

		
		driver.manage().window().fullscreen();
		Reporter.log("WebPage Open as FullScreen Successfully");
		logger.info("WebPage Open as FullScreen Successfully");
		
		
	}

}
