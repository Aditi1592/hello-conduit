package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {				

     
    @Given("^Open the Firefox browser$")				
    public void open_the_Firefox_browser() throws Throwable							
    {		
        System.out.println("This Step open the Firefox browser");					
    }		

    @When("^User enters the URL and press enter$")					
    public void user_enters_the_URL_and_press_enter() throws Throwable 							
    {		
       System.out.println("This step types the URL and press enter.");					
    }		

    @Then("^Webpage is displayed$")					
    public void webpage_is_displayed() throws Throwable 							
    {    		
        System.out.println("This step displays the web application page.");					
    }		

}