package com.stepdef;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class  Step_definition{
	WebDriver driver = Runner.driver;
	@Given("launch the swag labs")
	public void launch_the_swag_labs() {
	   driver.get("https://www.saucedemo.com/v1/");
	}
	@When("I entered the username in the username field")
	public void i_entered_the_username_in_the_username_field() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	@When("I entered the Password in the password field")
	public void i_entered_the_password_in_the_password_field() {
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	@When("I clicked the login button")
	public void i_clicked_the_login_button() {
	   driver.findElement(By.id("login-button")).click();
	   
	}
	@Then("i logged in into the page")
	public void i_logged_in_into_the_page() {
	    
	}
	@When("I clicked the  sauce labs Fleese jacket")
	public void i_clicked_the_sauce_labs_fleese_jacket() {
		driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();   
	}
	@When("i clicked the add to cart option")
	public void i_clicked_the_add_to_cart_option() {
	   driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	   driver.findElement(By.xpath("//span[text()='1']")).click(); 
	}
	 
	
	
}
