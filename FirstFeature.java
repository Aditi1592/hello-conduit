package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FirstFeature {
	
	private WebDriver driver = null;

@Given("^I should be at the login page$")
public void i_should_be_at_the_login_page() throws Throwable {
     driver= new FirefoxDriver();
     String driverpath = "C:\\GeckoDriver.exe";
     System.setProperty("webdriver.gecko.driver", driverpath);
     DesiredCapabilities capabilities = DesiredCapabilities.firefox();
     capabilities.setCapability("marionette",true);
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

@When("^I click on login button$")
public void i_click_on_login_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary pull-xs-right']")).click();
}

@Then("^I should be able to login inside conduit$")
public void i_should_be_able_to_login_inside_conduit() throws Throwable {
	
}

@And("^the title of the webpage should be conduit$")
public void the_title_of_the_webpage_should_be_conduit() throws Throwable {
	
	String my_title = driver.getTitle();
	System.out.println("Title is " + my_title);
	System.out.println("Test completed");
	driver.close();
}

@And("^I provide invalid userid and password$")
public void i_provide_invalid_userid_and_password() throws Throwable {
	driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("yadvanshigaurav@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Aditi67332");
}

@Then("^I should get the error message$")
public void i_should_get_the_error_message() throws Throwable {
	String errorMessage = "email or password is invalid";
    String actualMessage = driver.findElement(By.xpath("//div[@class='auth-page']//li[1]")).getText();
    if(actualMessage.equals(errorMessage)) {
        System.out.println("Test Case Passed");
    }else{
        System.out.println("Test Case Failed");
    }
    driver.close();
}

@And("^I should be able to click on my name tab$")
public void i_should_be_able_to_click_on_my_name_tab() throws Throwable {
	driver.findElement(By.xpath("//a[contains(text(),'Grv786')]")).click();
}

@And("^I should be able to click on my articles$")
public void i_should_be_able_to_click_on_my_articles() throws Throwable {
	driver.findElement(By.xpath("//a[@class='nav-link active']")).click();
}

@And("^I should be able to click on favorited articles$")
public void i_should_be_able_to_click_on_favorited_articles() throws Throwable {
	driver.findElement(By.xpath("//a[contains(text(),'Favorited Articles')]")).click();
	driver.close();
}
@When("^I click on new post$")
public void i_click_on_new_post() throws Throwable {
	driver.findElement(By.xpath("//a[contains(text(),'New Post')]")).click();
}

@Then("^I enter the details$")
public void i_enter_the_details() throws Throwable {
	driver.findElement(By.xpath("//input[@placeholder='Article Title']")).sendKeys("gfhgvv657");
	driver.findElement(By.xpath("//input[@placeholder=\"What's this article about?\"]")).sendKeys("juvyhghc");
	driver.findElement(By.xpath("//textarea[@placeholder='Write your article (in markdown)']")).sendKeys("uyjg43ffdcg");
	driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys("ftg");
}

@When("^I click on publish article button$")
public void i_click_on_publish_article_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn btn-lg pull-xs-right btn-primary']")).click();
}

@Then("^I see my post with comment section$")
public void i_see_my_post_with_comment_section() throws Throwable {
    System.out.println("I can see my post with comment section");
}

@Then("^i post a new comment$")
public void i_post_a_new_comment() throws Throwable {
	driver.findElement(By.xpath("//textarea[@placeholder='Write a comment...']")).sendKeys("jufddtyc");
	driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
	driver.close();
}
}
