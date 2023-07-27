package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index_php {

	public WebDriver idriver;
	public Index_php(WebDriver rdriver) {
		this.idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Identify the Sign-in
	@FindBy(className="login")
	WebElement Sign_in;
	
	//action Sign-in method
	public void Sign_In(){
		Sign_in.click();
	}
}
