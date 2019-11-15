package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FirstFeature {
	
	private WebDriver driver = null;

@Given("^I should be at the login page$")
public void i_should_be_at_the_login_page() throws Throwable {
     driver= new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://react-redux.realworld.io");
     driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    
}

@And("^I provide valid userid and password$")
public void i_provide_valid_userid_and_password() throws Throwable {
	driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("yadvanshigaurav@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Aditi1592");
}

@When("^I click on sign in button$")
public void i_click_on_sign_in_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary pull-xs-right']")).click();
}

@Then("^I should be able to login inside conduit$")
public void i_should_be_able_to_login_inside_conduit() throws Throwable {
	
}

@And("^the title of the webpage should be conduit$")
public void the_title_of_the_webpage_should_be_conduit() throws Throwable {
	
	String my_title = driver.getTitle();
	System.out.println("Title is " + my_title);
	String expected_title="conduit";
	Assert.assertEquals(my_title, expected_title);
	System.out.println("Test completed");
	driver.quit();
}

@And("^I provide invalid userid and password$")
public void i_provide_invalid_userid_and_password() throws Throwable {
	driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("yadvanshigaurav13@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Aditi1593332");
}

@Then("^I should get the error message$")
public void i_should_get_the_error_message() throws Throwable {
	System.out.println("email or password is invalid");
}

}
