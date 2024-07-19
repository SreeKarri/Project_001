package AmazonEndtoEnd.Project_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_14_GivingRatings extends Browser_Launch_Quit_Methods{
@Test
public void RatingforPreviousorders() throws InterruptedException {
	 HomePage hp=new HomePage(d);
		hp.Accandlist(d);
		hp.signin(d);
		
		LoginPage l=new LoginPage(d);
		l.useremail(d);
		l.Password(d);
		
		hp.manageorders(d);
		
		OrderPage or=new OrderPage(d);
		WebDriverWait w =new WebDriverWait(d,Duration.ofSeconds(15));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='a-button-stack']")));
		
		or.ViewsItems(d);
		or.productreview(d);
		
		or.overallratig(d);
		
		//or.overallratig2(d);
		//or.overallratig3(d);
		
		 Reporter.log("***** Rating");
		
}
}
