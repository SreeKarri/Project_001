package AmazonEndtoEnd.Project_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_15_ReachCartWithoutLogin extends Browser_Launch_Quit_Methods{
@Test 
public void CheckwithoutLogin() throws InterruptedException {
	  HomePage hp=new HomePage(d);
			
			
			hp.productsearching(d);
			
			SearchResultPage se= new SearchResultPage(d);
			se.product7(d);
			ProductPage p=new ProductPage(d);
			p.selectingsize(d);
			WebDriverWait w =new WebDriverWait(d,Duration.ofSeconds(15));
			w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='a-autoid-9-announce']")));
			p.addingitems(d);
			
			CheckOUtandPaymentPage cp =new CheckOUtandPaymentPage(d);
			cp.procheckout(d);
			Reporter.log("Reached till cart successfully");
			
}
}
