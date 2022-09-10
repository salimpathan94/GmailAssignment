package com.assignment.testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.assignment.pageObjects.SignINEmailPage;
import com.assignment.pageObjects.SignInPasswordPage;

public class ForgottenPasswordTest extends Baseclass {
	
	
	
    @Test
	public void forgottenpasswordTest() {
		
    	driver.get(Baseurl);
		Reporter.log("Url Entered Successfully");
		//Log.info("Url Entered Successfully");
		
		
		
        SignINEmailPage sp= new SignINEmailPage(driver);
		
         sp.setEmail(username);
        
         sp.clickNext();
         
        System.out.println("email Enetered successfully");
        Reporter.log("Email Entered Successfully");
       logger.info("Email Entered Successfully");
    	
        
        SignInPasswordPage sp1= new SignInPasswordPage(driver);
        sp1.clickLinkForgot();
        
        
        if(driver.getTitle().equals("")) {
 			Assert.assertTrue(true);
 			System.out.println("Forgot Password Link Working");
 			Reporter.log("Forgot Password Link working ");
 			logger.info("Forgot Password Link working");
 			
 		}
 		else{
 			Assert.assertTrue(false);
 			System.out.println("Forgot Password Link not working");
 			Reporter.log("Forgot Password Link not working");
 			logger.info("Forgot Password Link not working");
 			
 		}
         
         
      Baseclass.tearDown();
      System.out.println("Application Closed Successfully");
      Reporter.log("Application Closed Successfully");
     logger.info("Application Closed Successfully");
    	
    	
    	
	}

}
