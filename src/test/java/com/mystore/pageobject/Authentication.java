package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authentication {

	public WebDriver idriver;
	public Authentication(WebDriver rdriver) {
		this.idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
///////////////////////////////////////  CREATE AN ACCOUNT  ///////////////////////////////////////////////////	
	
	
	//identify the  WebElements 
	
	//create Email
	@FindBy(name="email_create")
	WebElement Email_create;
	
	//SubmitCreate
	@FindBy(id="SubmitCreate")
	WebElement Submitcreate;
	
	
	
	//Action method on a WebElement
	public void Email_Create(String enterEmail) {
		Email_create.sendKeys(enterEmail);
	}
	
	
	public void SubmitCreate( ) {
		Submitcreate.click();
	}
	
	
	
	
//////////////////////////////////////////   ALREADY REGISTERED     /////////////////////////////////////////////

	// Identify the WebElement 
	
	//EnterEmail
	@FindBy(name="email")
	WebElement Enter_email;
	
	//EnterPassword
	@FindBy(id="passwd")
	WebElement Enter_pwd;
	
	//Click on LoginButton
	@FindBy(id="SubmitLogin")
	WebElement SubmitLogin;
	
	
	
	// Action method the WebPage
	public void Enter_Email(String EnterEmail) {
		Enter_email.sendKeys(EnterEmail);
	}
	
	
	public void Enter_pwd(String Enterpwd) {
		Enter_pwd.sendKeys(Enterpwd);
	}
	
	
	public void SubmitLogin( ) {
		SubmitLogin.click();
	}
}
