package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;

public class LoginPage_Diallo_Warrior 
{
	WebDriver driver;

	public LoginPage_Diallo_Warrior(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(id="user-name")
	WebElement username_textbox;
	public void enter_username(String uname) throws Exception
	{
		username_textbox.sendKeys(uname);
		
	}
	
	@FindBy(name="password")
	
	WebElement password_textbox;
	
	public void enter_password(String pass) throws Exception
	{
		password_textbox.sendKeys(pass);
		
	}
   @FindBy(css="[value='Login']")
   WebElement Login_click ;
   
 
	public void click_loginbttn() throws Exception
	{
		Login_click.click();
		
	}
	
	
}
