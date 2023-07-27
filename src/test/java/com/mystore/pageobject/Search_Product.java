package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Product {


	public WebDriver idriver;
	public Search_Product(WebDriver rdriver) {
		this.idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//identify the WebElement
	@FindBy(className="button lnk_view btn btn-default")
     WebElement more;
	
	public void More() {
		more.click();
	}
}
