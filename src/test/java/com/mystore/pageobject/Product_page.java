package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Product_page {


	public WebDriver idriver;
	public Product_page(WebDriver rdriver) {
		this.idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//identify the WebElement
	
	//Enter the quantity
	@FindBy(name="qty")
     WebElement quantity;
	
	//select the Size
	@FindBy(id="group_1")
	 WebElement size;
	
	//color
	@FindBy(name="Orange")
    WebElement orange;
	
	
	@FindBy(name="Blue")
    WebElement blue;
	
	
	//add cart
	@FindBy(name="Submit")
	 WebElement AddTocart;
    
	
	//Action method on a WebPage
	
	public void Quantity(String number) {
		quantity.clear();
		quantity.sendKeys(number);
	}
	
	
	public void Size(String entersize) {
		Select Dropdown=new Select(size);
		Dropdown.deselectByVisibleText(entersize);
	}
	
	
	public void Orange() {
		orange.click();
	}
	
	
    public void Blue() {
    	blue.click();
	}
    
    
    public void AddToCart() {
    	AddTocart.click();
    }
}
