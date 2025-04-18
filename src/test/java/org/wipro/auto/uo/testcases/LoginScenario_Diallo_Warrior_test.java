package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.baseutilities.InitiateBrowser;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;
import org.wipro.auto.uo.pages.LoginPage;
import org.wipro.auto.uo.pages.LoginPage_Diallo_Warrior;

public class LoginScenario_Diallo_Warrior_test extends InitiateBrowser
{

	@Test
	public void tc01_validate_valid_login_func() throws Exception
	{
		LoginPage_Diallo_Warrior  login = new LoginPage_Diallo_Warrior (driver);
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	//this test case read data from properties file
	//@Test
	//public void tc01_validate_invalid_login_func() throws Exception
	//{
		//LoginPage_Diallo_Warrior  login = new LoginPage_Diallo_Warrior (driver);
		
		//login.enter_username(ReadPropFiles.readconfig("username"));
		//login.enter_password(ReadPropFiles.readconfig("password"));
		//login.click_loginbttn();
		
		//because "this.driver" is null
		
	//}
}
