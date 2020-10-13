package com.qa.Cuke.Cucumber.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example1SDF {
	
WebDriver driver; 
	
	@Before
	public void init() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\taydz\\Desktop\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\Cuke\\src\\test\\resources\\msedgedriver.exe");
	    driver = new EdgeDriver(); 
	}

		@Given("at web page")
		public void at_web_page() throws Throwable{
			driver.get("http://www.thedemosite.co.uk/");
		}


		@When("submit {string} and {string}")
		public void submit_root_and_root(String username,String password) throws Throwable{
			driver.findElement(By.xpath("//html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();

			driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")).sendKeys(username);
			driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")).sendKeys(password);

		}
		@Then("login with {string} and {string}")
		public void login_with_root_and_root(String username,String password) throws Throwable{
			driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")).click();
			driver.findElement(By.xpath("//html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();

			driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")).sendKeys(username);
			driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")).sendKeys(password);
			driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")).click();

			String login = driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
			
			assertEquals(login,"**Successful Login**");

		}
		@After
		public void quit() {
			driver.quit();
		}




}
