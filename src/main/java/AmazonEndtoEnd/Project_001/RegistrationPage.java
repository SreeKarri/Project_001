package AmazonEndtoEnd.Project_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	 public static WebDriver d;
		@FindBy(id="ap_customer_name")
		WebElement firstandlastname;
		@FindBy(id="ap_email")
		WebElement mobilenumberoremail;
		@FindBy(id="ap_password")
		WebElement password;
		@FindBy(id="ap_password_check")
		WebElement confirmpassword;
		public  void customername() {
			firstandlastname.sendKeys("Sree Karri");
		}
		public void email() {
			mobilenumberoremail.sendKeys("jypra@gmail.com");
		}
		public void pwd() {
			password.sendKeys("jyo@12349");
		}
		public void confpwd() {
			confirmpassword.sendKeys("jyo@12349");
			confirmpassword.sendKeys(Keys.ENTER);
		}
		
		public RegistrationPage(WebDriver d) {
			PageFactory.initElements(d, this);
		
		}
}
