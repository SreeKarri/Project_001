package AmazonEndtoEnd.Project_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_08_SortingbyPrice_Reviews extends Browser_Launch_Quit_Methods {
@Test
public void sortby() throws InterruptedException {
	HomePage hp=new HomePage(d);
	hp.Accandlist(d);
	hp.signin(d);
	
	LoginPage l=new LoginPage(d);
	l.useremail(d);
	l.Password(d);
	
	hp.productsearching(d);
	
	SearchResultPage se= new SearchResultPage(d);
	
	se.sortingbypriceandRating(d);
	
  
	
	
	
	
	
}
}
