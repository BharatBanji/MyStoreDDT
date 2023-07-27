package com.mystore.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {
    
	
	// initilize the driver
	public WebDriver idriver;
	
	//create a constructor
	public Create_Account(WebDriver rdriver) {
		this.idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//identify the gender
	@FindBy(id="uniform-id_gender1")
	WebElement titleMr;
	
	//create a action method
	public void TitleMr() {
		titleMr.click();		
	}
	
	
	
	
	
	// identify the element Firstname
	@FindBy(id="customer_firstname")
	WebElement firstName;
	
	//create a action method
	public void FirstName(String entername) {
		firstName.sendKeys(entername);
	}
	
	
	
	
	
	
	//identify the element lastname
	@FindBy(id="customer_lastname")
	WebElement lastName;
	
	//create a action method
		public void LastName(String lastname) {
			lastName.sendKeys(lastname);
		}
		
	
	
		
		
		
		
		// password
	@FindBy(id="passwd")
	WebElement password;
	

	//create a action method
	public void Password(String passwd) {
		password.sendKeys(passwd);
	}
	
	
	
	
	
	
	//selectdate
	@FindBy(name="days")
	WebElement date;
	
    public void DOBDate(String Date) {
    	
    	Select dropDown=new Select(date);
    	dropDown.selectByValue(Date);
		
	}

    
    
    
    
    //selectmonth
	@FindBy(name="months")
	WebElement month;
	
   public void DOBMonth(String Month) {
	   Select dropDown=new Select(month);
   	dropDown.selectByValue(Month);
	}


   
   
   
   
   
   //selectyear
	@FindBy(name="years")
	WebElement year;
	
	public void DOBYear(String Year)
	{
      Select dropDown=new Select(year);
    	dropDown.selectByValue(Year);
	}
	
	
	
	
	
	
	
	//summit Button
		@FindBy(id="submitAccount")
		WebElement Register;
		
		//create a action method
		public void Registerbtn() {
			Register.click();
		}
		
		
		
}
