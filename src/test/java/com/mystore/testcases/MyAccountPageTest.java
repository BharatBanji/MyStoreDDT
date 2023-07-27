package com.mystore.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.Address_Details;
import com.mystore.pageobject.Authentication;
import com.mystore.pageobject.Create_Account;
import com.mystore.pageobject.Index_php;
import com.mystore.pageobject.My_account;

public class MyAccountPageTest extends BaseClass {

	//public WebDriver driver;
	
	@Test(enabled=false)
	public void verfiyRegistrationAndLogin()
	{
		//open url
		driver.get(url);
		log.info("open url");
		
		//create the object for index page
		Index_php pg=new Index_php(driver);
	    pg.Sign_In();
	
	    //create the object for myaccount
	    Authentication pg1=new  Authentication(driver);
	    pg1.Email_Create("veer19@gmail.com");
	    pg1.SubmitCreate();
	    log.info("enter the create email");
	    
	    Create_Account pg2=new Create_Account(driver);
	    pg2.TitleMr();
	    pg2.FirstName("bharat");
	    pg2.LastName("veer");
	    pg2.Password("hello");
	    pg2.DOBDate("15");
	    pg2.DOBMonth("8");
	    pg2.DOBYear("1999");
	    pg2.Registerbtn();
	    log.info("fill the all personal details");
	    
	    My_account pg3=new My_account(driver);
	    pg3.MyFirstAddress();
	    
	    
	    Address_Details pg4=new Address_Details(driver);
	    pg4.CompanyName("ADA EXPERENCE");
	    pg4.AddressFirst("sisauli");
	    pg4.AddressSecond("Sisauli choudhran patti");
	    pg4.CityName("Muzaffernagar");
	    pg4.State("California");
	    pg4.postCode("94501");
	    pg4.Country("United States");
	    pg4.phoneFirst("8650459099");
	    pg4.phonemobile("8650459098");
	    pg4.additionalInfo("Hi.....");
	    pg4.futureRef("delhi");
	    pg4.summitBtn();
	    log.info("fill the all info");
	    
	    
	    //verification the account completely done or not
	    String actual=pg3.getUserName();
	    String Expected= "Bharat veer";
	    if(actual.equals(Expected)) 
	    {
	    	Assert.assertTrue(true);
	    	log.info("verification is true");
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    	log.info("verification is false");
	    }
	    
	}
	
	
	
	
	
	@Test(enabled=false)
	public void ValidRegisterd() {
		//open url
		driver.get(url);
		log.info("open url");
		
		//create the object for index page
		Index_php pg=new Index_php(driver);
	     pg.Sign_In();
	     
	     
	     //create the object for myaccount
	     Authentication pg1=new  Authentication(driver);
	    pg1.Enter_Email("veer19@gmail.com");
	    log.info("enter the email");
	    pg1.Enter_pwd("hello");
	    log.info("enter the password");
	    pg1.SubmitLogin();
	    log.info("click the login btn");
	    
	    
	    My_account pg2=new My_account(driver);
	    
	    //verification the account completely done or not
	    String actual=pg2.getUserName();
	    String Expected= "Bharat veer";
	    if(actual.equals(Expected)) 
	    {
	    	Assert.assertTrue(true);
	    	log.info("verification is true");
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    	log.info("verification is false");
	    }
	}
	
	
	
}
