package elearning;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElearningSteps {
	
	WebDriver driver;
	ElearningRegistrationPageElements registrationPage = new ElearningRegistrationPageElements();
	ElearningMessagePageElements messagePage = new ElearningMessagePageElements();
	RegexGenerator regexGenerator = new RegexGenerator();
	String password = regexGenerator.getRegex(10);
	String firstName = regexGenerator.getRegex(10);
	String lastName = regexGenerator.getRegex(5);
	String email = regexGenerator.getRegex(10) + "@test.com";
	String username = regexGenerator.getRegex(10);
	
	
	@Before
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//prane//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

    @Given("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to_url(String url) {
        
    	driver.get(url);
    }

    @When("^I click on Register button$")
    public void i_click_on_register_button() {
        
    	driver.findElement(registrationPage.submit).click();
    	
    }

    @When("^I click on submit button$")
    public void i_click_on_submit_button() {
        
    	driver.findElement(messagePage.submitMessage).click();	
    }

    @Then("^I verify the message \"([^\"]*)\"$")
    public void i_verify_the_message(String message1) {
        
    	String message = driver.findElement(registrationPage.signUpSuccessMsg).getText();
    	System.out.println("SuccessMessage is: " + message);
    	
    	if(message.contains(message1)) {
    		
    		Assert.assertTrue(true);
    	}else {
    		
    		Assert.assertTrue(false);
    	}
    }

    @Then("^I should see success message as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_should_see_success_message(String message2, String sendto) {
        
    	String alertMessage = driver.findElement(messagePage.successMessage).getText();
    	System.out.println("Alert message is: " + alertMessage);
    	
    	if(alertMessage.contains(message2) && alertMessage.contains(sendto)) {
    		
    		Assert.assertTrue(true);
    	}else {
    		Assert.assertTrue(false);
    	}
    }

    @And("^I click on SignUp button$")
    public void i_click_on_signup_button() {
    	
    	driver.findElement(registrationPage.signup).click();
    }

    @And("^I enter value into input field First Name$")
    public void i_enter_value_into_input_field_first_name() {
        
    	driver.findElement(registrationPage.firstName).sendKeys(firstName);
    }

    @And("^I enter value into input field Last Name$")
    public void i_enter_value_into_input_field_last_name() {
        
    	driver.findElement(registrationPage.lastName).sendKeys(lastName);
    }

    @And("^I enter value into input field Username$")
    public void i_enter_value_into_input_field_username() {
        
    	driver.findElement(registrationPage.username).sendKeys(username);
    }
    
    @And("^I enter value into input field email$")
    public void i_enter_value_into_input_field_email() {
        
    	driver.findElement(registrationPage.email).sendKeys(email);
    }

    @And("^I enter value into input field Password$")
    public void i_enter_value_into_input_field_password() {
        
    	driver.findElement(registrationPage.password).sendKeys(password);
    }

    @And("^I enter value into input field Confirm Password$")
    public void i_enter_value_into_input_field_confirm_password() {
        
    	driver.findElement(registrationPage.confirmPassword).sendKeys(password);
    }

    @And("^I click on user icon$")
    public void i_click_on_user_icon() {
    	
        driver.findElement(registrationPage.userIcon).click();
    }

    @And("^I click on inbox link$")
    public void i_click_on_inbox_link() {
        
    	driver.findElement(registrationPage.inboxUserMenu).click();
    }

    @And("^I enter value into input field Send To as \"([^\"]*)\"$")
    public void i_enter_value_into_input_field_send_to(String sendto) throws InterruptedException {
        
    	Thread.sleep(15000);
    	driver.findElement(messagePage.sendTo).sendKeys(sendto);
    }

    @And("^I click on \"([^\"]*)\" in options list$")
    public void i_click_on_sendto_in_options_list(String sendto) {
        
    	driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'" + sendto + "')]")).click();
    }
    
    @And("^I click on compose button$")
    public void i_click_on_compose_button() {
        
    	driver.findElement(messagePage.composeMessage).click();
    }

    @And("^I enter value into input field Subject$")
    public void i_enter_value_into_input_field_subject() {
        
    	driver.findElement(messagePage.subjectMessage).sendKeys("test message");
    }

    @And("^I enter value into input field Message$")
    public void i_enter_value_into_input_field_message() {
        
    	driver.switchTo().frame(0);
    	driver.findElement(By.xpath("//body")).sendKeys(" Hi Naveen \n This is a test message");
    	driver.switchTo().defaultContent();
    }
    
    @After
    public void closeBrowser() {
    	
    	driver.quit();
    }

}