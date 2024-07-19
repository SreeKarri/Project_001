package AmazonEndtoEnd.Project_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_11_ValidatetillCheckout extends Browser_Launch_Quit_Methods{
@Test
public void validateEntireCheckoutprocess() throws InterruptedException {
	HomePage hp=new HomePage(d);
	hp.Accandlist(d);
	hp.signin(d);
	
	LoginPage l=new LoginPage(d);
	l.useremail(d);
	l.Password(d);
	hp.SearchingforShoe(d);
	SearchResultPage se= new SearchResultPage(d);
	se.product7(d);
	
	ProductPage p=new ProductPage(d);
	p.selectingsize(d);
	p.addingitems(d);
	
	
	CheckOUtandPaymentPage cp =new CheckOUtandPaymentPage(d);
	cp.procheckout(d);
	//cp.ph(d);
	//cp.address1(d);
	//cp.address2(d);
	//cp.city(d);
	//cp.country(d);
	//cp.pin(d);
	//cp.checkbox(d);
	//cp.usethisadd(d);
	WebDriverWait w =new WebDriverWait(d,Duration.ofSeconds(10));
	w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='a-section a-padding-base maple-banner__col']")));

    cp.addcredit_debit(d);
    d.switchTo().frame(0);
    cp.cardnumber(d);
    cp.Nameoncard(d);
    cp.date(d);
    cp.year(d);
    cp.verificationpin(d);
    cp.Addmycard(d);
	
	Reporter.log("Card added successfully");
	
	
	
	
}
}
