package elearning;

import org.openqa.selenium.By;

public class ElearningRegistrationPageElements {
	
	public By signup = By.xpath("//a[contains(text(),'Sign up')]");
	
	public By firstName = By.xpath("//input[@id='registration_firstname']");
	
	public By lastName = By.xpath("//input[@id='registration_lastname']");
	
	public By email = By.xpath("//input[@id='registration_email']");
	
	public By username = By.xpath("//input[@id='username']");
	
	public By password = By.xpath("//input[@id='pass1']");
	
	public By confirmPassword = By.xpath("//input[@id='pass2']");
	
	public By submit = By.xpath("//button[@id='registration_submit']");
	
	public By signUpSuccessMsg = By.xpath("(//section//div[@class='row']//p)[1]");
	
	public By userIcon = By.xpath("//a/span[@class='caret']");
	
	public By usernameUserMenu = By.xpath("(//li//p)[1]");
	
	public By emailUserMenu = By.xpath("(//li//p)[2]");
	
	public By inboxUserMenu = By.xpath("//a[@title='Inbox']");
	

}
