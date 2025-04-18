package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.baseutilities.InitiateBrowser;
import org.wipro.auto.uo.pages.LoginPage_Manish;
import org.wipro.auto.uo.pages.LoginPage_SM;

public class LoginScenario_Manish extends InitiateBrowser
{

	@Test
	public void tc01_validate_valid_login_func() throws Exception
	{
		LoginPage_Manish login = new LoginPage_Manish(driver);
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	
}
