package AmazonEndtoEnd.Project_001;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_12_CheckEachPaymentMethod extends Browser_Launch_Quit_Methods{
@Test
public void OtherpaymentMethods() throws InterruptedException {
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
	cp.AmazonstoreCard(d);
	cp.addcheckingaccount(d);
	d.switchTo().frame(0);
	cp.nameonAccount(d);
	cp.Routingnumber(d);
	cp.checkingaccnumber(d);
	cp.confirmchecaccountno(d);
	cp.drivlicenseno(d);
	cp.licenseState(d);
	cp.addingcheckingaccount(d);
	
	//cp.ph(d);
	//cp.address1(d);
	//cp.address2(d);
	//cp.city(d);
	//cp.country(d);
	//cp.pin(d);
	//cp.checkbox(d);
	//cp.usethisadd(d);
	Reporter.log("successfully added otherPaymentMethods");
}
}
