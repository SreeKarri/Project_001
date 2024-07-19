package AmazonEndtoEnd.Project_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver d;
	
	@FindBy(id="createAccountSubmit")
	WebElement createaccount;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	public void createaccount(WebDriver d) {
		Actions a=new Actions(d);
				a.moveToElement(createaccount).perform();
		createaccount.click();
	}

	public void useremail(WebDriver d) {
		email.sendKeys("jyokarri@gmail.com"+Keys.ENTER);
	}
	
	public void Password(WebDriver d) {
		password.sendKeys("Sree98765$12#"+Keys.ENTER);

	}

	

	public LoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
}
