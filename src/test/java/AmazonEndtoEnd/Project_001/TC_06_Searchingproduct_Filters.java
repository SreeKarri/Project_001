package AmazonEndtoEnd.Project_001;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06_Searchingproduct_Filters extends Browser_Launch_Quit_Methods{
	@Test
	public void searchingbyFilters() throws InterruptedException {
		
	
	
	   HomePage hp=new HomePage(d);
		hp.Accandlist(d);
		hp.signin(d);
		
		LoginPage l=new LoginPage(d);
		l.useremail(d);
		l.Password(d);
		
		hp.productsearching(d);
		
		SearchResultPage se= new SearchResultPage(d);
		
		se.Filterbygender(d);
		se.Filterbygender2(d);
		se.FilterbyBrand(d);
		se.Filterbygender3(d);
		Reporter.log("Searching is done successfully by category wise");
	}
}
