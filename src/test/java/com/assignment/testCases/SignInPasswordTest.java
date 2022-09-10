package com.assignment.testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.assignment.pageObjects.SignINEmailPage;
import com.assignment.pageObjects.SignInPasswordPage;

public class SignInPasswordTest extends Baseclass {
	
	@Test
	public void signInLoginPasswordTest() {
		
		
		driver.get(Baseurl);
		Reporter.log("Url Entered Successfully");
		//Log.info("Url Entered Successfully");
		
		
		SignINEmailPage sp= new SignINEmailPage(driver);
		
        sp.setEmail(username);
        
         sp.clickNext();
         
        System.out.println("email Enetered successfully");
        Reporter.log("Email Entered Successfully");
       // Log.info("Email Entered Successfully");
		
        
        SignInPasswordPage sp1= new SignInPasswordPage(driver);
       
        sp1.setPassword(password);
        
        sp1.clickNext();
        
        
        if(driver.getTitle().equals("Gmail")) {
 			Assert.assertTrue(true);
 			System.out.println("Login  Successfully");
 			Reporter.log("Login Successfully");
 			logger.info("Login Successfully");
 			
 		}
 		else{
 			Assert.assertTrue(false);
 			System.out.println("Worng Password Enetered");
 			Reporter.log("Wrong Password Entered");
 			logger.info("Wrong Password Entered");
 			
 		}
         
         
      Baseclass.tearDown();
      
      System.out.println("Application Closed Successfully");
      Reporter.log("Application Closed Successfully");
      logger.info("Application Closed Successfully");
        
        
        
	}
	
	
	
}
