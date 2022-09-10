package com.assignment.testCases;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.assignment.pageObjects.SignINEmailPage;


public class SignInEmailPageTest extends Baseclass {
	
	
	
	@Test
	public void signInEmailPageTest() {
		
		driver.get(Baseurl);
		Reporter.log("Url Entered Successfully");
		logger.info("Url Entered Successfully");
		
		//Baseclass.setup(br);
		SignINEmailPage sp= new SignINEmailPage(driver);
             sp.setEmail(username);
             sp.clickNext();
             
             if(driver.getTitle().equals("")) {
     			Assert.assertTrue(true);
     			System.out.println("Email Entered Successfully");
     			Reporter.log("Email Entered Successfully");
     			logger.info("Email Entered Successfully");
     			
     		}
     		else{
     			Assert.assertTrue(false);
     			System.out.println("Worng Email Enetered");
     			Reporter.log("Wrong Email Entered");
     			logger.info("Wrong Email Entered");
     			
     		}
             
             
          Baseclass.tearDown();
          System.out.println("Application Closed Successfully");
          Reporter.log("Application Closed Successfully");
         logger.info("Application Closed Successfully");
		
	}

}
