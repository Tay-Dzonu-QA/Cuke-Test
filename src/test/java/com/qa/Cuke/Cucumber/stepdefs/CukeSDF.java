package com.qa.Cuke.Cucumber.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 


public class CukeSDF {
	
	WebDriver driver; 
	
	@Before
	public void init() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\taydz\\Desktop\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\Cuke\\src\\test\\resources\\msedgedriver.exe");
	    driver = new EdgeDriver(); 
	}
	
	@Given("^I want to go to www.google.com$")
	public void i_want_to_go_to_www_google_com() throws Throwable {
	    driver.get("https://www.google.co.uk/imghp?hl=en&tab=wi&ogbl");
	}
	

	@When("We search for {string}")
	public void we_search_for(String string) throws Throwable {
	    WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[2]/input"));
	    searchBar.sendKeys(string+"\n");
	}

	@Then("google will return images of {string}")
	public void google_will_return_images_of_kittens(String string) throws Throwable {
		System.out.println(string);
		
	}
	
	@After
	public void quit() {
		driver.quit();
	}
}
