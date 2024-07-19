package AmazonEndtoEnd.Project_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_09_AddingItems extends Browser_Launch_Quit_Methods{
  @Test
  public void addingtoCart() throws InterruptedException {
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
		p.selectingsize(d);
		p.addingitems(d);
		
		WebElement displaycheckout=d.findElement(By.name("proceedToRetailCheckout"));
		Assert.assertEquals(displaycheckout.isDisplayed(),true,"Test case failed");
		Reporter.log("Items are added in the cart");
  }
}
