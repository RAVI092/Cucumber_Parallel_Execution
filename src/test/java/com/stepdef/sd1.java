package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sd1 {

	
	@Given("user is at home page")
	public void user_is_at_home_page() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Downloads\\chromedriver.exe");
WebDriver d1=new ChromeDriver();
d1.navigate().to("https://www.google.com");
	}

	@When("user move to login section and click the Travel Agent login section")
	public void user_move_to_login_section_and_click_the_Travel_Agent_login_section() {


	}

	@When("enter the user name <\"uname\"> and password <\"pwd\"> and click the sign-in button")
	public void enter_the_user_name_uname_and_password_pwd_and_click_the_sign_in_button() {

	}

	@Then("verfiy that he is on the agent home page.")
	public void verfiy_that_he_is_on_the_agent_home_page() {

	}

	@Given("user is at homepage")
	public void user_is_at_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Downloads\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.navigate().to("https://www.spicejet.com/default.aspx");
	}

	@When("user move to login section and click the TravelAgent login section.")
	public void user_move_to_login_section_and_click_the_TravelAgent_login_section() {


	}

	@When("enter the valid user name <\"uname\"> and password <\"pwd\"> and click the sign-in button.")
	public void enter_the_valid_user_name_uname_and_password_pwd_and_click_the_sign_in_button() {


	}

	@Then("verfiy that he is not on the agent home page")
	public void verfiy_that_he_is_not_on_the_agent_home_page() {

	}

	
}
