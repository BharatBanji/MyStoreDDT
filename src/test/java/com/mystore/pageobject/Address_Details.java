package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Address_Details {
	
	
	public WebDriver idriver;
	public Address_Details(WebDriver rdriver) {
		this.idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
 
	
	//identify the element 
	@FindBy(name="company")
	WebElement companynName;
	
	//Action method
	public void CompanyName(String name) {
		companynName.sendKeys(name);
	}
	
	
	
	
	//identify the element 
	@FindBy(id="address1")
	WebElement addressFirst;
	
	//Action method
	public void AddressFirst(String name) {
		addressFirst.sendKeys(name);
	}

	
	

	//identify the element 
	@FindBy(id="address2")
	WebElement addressSecond;
	
	//Action method
	public void AddressSecond(String name) {
		addressSecond.sendKeys(name);
	}

	
	
	

	//identify the element 
	@FindBy(id="city")
	WebElement cityName;
	
	//Action method
	public void CityName(String name) {
		cityName.sendKeys(name);
	}

	
	
	

	//identify the element 
	@FindBy(id="id_state")
	WebElement state;
	
	//Action method
	public void State(String name) {
		Select dropdown=new Select(state);
		dropdown.selectByVisibleText(name);
	}

	
	
	
	

	//identify the element 
	@FindBy(id="postcode")
	WebElement postcode;
	
	//Action method
	public void postCode(String name) {
		postcode.sendKeys(name);
	}

	
	
	

	//identify the element 
	@FindBy(id="id_country")
	WebElement country;
	
	//Action method
	public void Country(String name) {
		Select dropdown=new Select(country);
		dropdown.selectByVisibleText(name);
	}

	
	


	//identify the element 
	@FindBy(id="phone_mobile")
	WebElement phone_mobile;
	
	//Action method
	public void phonemobile(String name) {
		phone_mobile.sendKeys(name);
	}

	
	
	
	


	//identify the element 
	@FindBy(id="phone")
	WebElement phone;
	
	//Action method
	public void phoneFirst(String name) {
		phone.sendKeys(name);
	}

	
	



	//identify the element 
	@FindBy(name="other")
	WebElement additionalinfo;
	
	//Action method
	public void additionalInfo(String name) {
		additionalinfo.sendKeys(name);
	}


	
	



	//identify the element 
	@FindBy(name="alias")
	WebElement futureref;
	
	//Action method
	public void futureRef(String name) {
		futureref.clear();
		futureref.sendKeys(name);
	}


	


	//identify the element 
	@FindBy(name="submitAddress")
	WebElement summitbtn;
	
	//Action method
	public void summitBtn() {
		summitbtn.click();
	}
	
}
