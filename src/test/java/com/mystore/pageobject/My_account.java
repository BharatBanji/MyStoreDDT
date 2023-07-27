package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.core.ReturnInstruction.Return;

public class My_account {

	public WebDriver idriver;
	public My_account(WebDriver rdriver) {
		this.idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//identify the WebElement
	
	//view my customer account
	@FindBy(className="account")
	WebElement Title;
	
	
	//search item
	@FindBy(id="search_query_top")
	WebElement search;
	
	
	//submit_search
	@FindBy(name="submit_search")
	WebElement submit_search;
	
	//MyFirstAddress
	@FindBy(xpath="//*[@title=\"Add my first address\"]")
	WebElement Myfirstaddress;
	
	
	
	
	// Action method on a WebPage
	public  String getUserName() {
		String gettext=Title.getText();
	    return gettext; 
	}
	
	
	
	public void Search(String entertext) {
		search.sendKeys(entertext);
	}
	
	
	
	public void Submit_Search() {
		submit_search.click();
	}
	
	
	
	public void MyFirstAddress() {
		Myfirstaddress.click();
	}
	
	
	
	
	
	
	
	
}
