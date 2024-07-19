package AmazonEndtoEnd.Project_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TC_10_UdatingAndRemoveItems extends Browser_Launch_Quit_Methods{
@Test
public void cartitems() throws InterruptedException {
	HomePage hp=new HomePage(d);
	hp.Accandlist(d);
	hp.signin(d);
	
	LoginPage l=new LoginPage(d);
	l.useremail(d);
	l.Password(d);
	
	hp.cart(d);
	ShoppingCartPage sho=new ShoppingCartPage(d);
	
	WebDriverWait w =new WebDriverWait(d,Duration.ofSeconds(5));
	w.until(ExpectedConditions.presenceOfElementLocated(By.name("proceedToRetailCheckout")));
	sho.updatingitemquantity_removing(d);
	Reporter.log("Item was deleted successfully");
	
}
}
