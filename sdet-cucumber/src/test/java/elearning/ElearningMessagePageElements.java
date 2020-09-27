package elearning;

import org.openqa.selenium.By;

public class ElearningMessagePageElements {
	
	public By composeMessage = By.xpath("//img[@title='Compose message']//parent::a");
	
	public By sendTo = By.xpath("//input[@class='select2-search__field']");
	
	public By sendToOptions = By.xpath("//ul[@class='select2-results__options']");
	
	public By subjectMessage = By.xpath("//input[@id='compose_message_title']");

	public By submitMessage = By.xpath("//button[@id='compose_message_compose']");
	
	public By successMessage = By.xpath("//div[@class='alert alert-success']");
	
}
