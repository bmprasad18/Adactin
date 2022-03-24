package com.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Step_Def {
	
	@Given("User Enter The {string} In User Name Field")
	public void user_enter_the_in_user_name_field(String string) {
		System.out.println("User Enter The Anandhkpl In User Name Field");
	}

	@Given("User Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String string) {
		System.out.println("User Enter The Moorthi@05 In Password Field");
		
	}

	@Then("User Clicks The Login Button And It Navigates To The Search Home Page")
	public void user_clicks_the_login_button_and_it_navigates_to_the_search_home_page() {
		System.out.println("User Clicks The Login Button And It Navigates To The Search Home Page");
	}



}
