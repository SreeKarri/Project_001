package AmazonEndtoEnd.Project_001;

import org.testng.annotations.Test;

public class Tc_05_SearchingforShoe extends Browser_Launch_Quit_Methods{
   @Test
   public void searchingproduct() throws InterruptedException {
	   HomePage hp=new HomePage(d);
		hp.Accandlist(d);
		hp.signin(d);
		
		LoginPage l=new LoginPage(d);
		l.useremail(d);
		l.Password(d);
		
		hp.productsearching(d);
   }
}
