package AmazonEndtoEnd.Project_001;

import org.testng.annotations.Test;

public class TC_07_ProductDetails extends Browser_Launch_Quit_Methods {
@Test
public void ensureproductdetails() throws InterruptedException {
	HomePage hp=new HomePage(d);
	hp.Accandlist(d);
	hp.signin(d);
	
	LoginPage l=new LoginPage(d);
	l.useremail(d);
	l.Password(d);
	
	hp.productsearching(d);
	
	SearchResultPage se= new SearchResultPage(d);
	se.product7(d);
	
	ProductPage p=new ProductPage(d);
	p.displayingprice(d);
	p.displayreviews(d);
	p.discription(d);
}
}
