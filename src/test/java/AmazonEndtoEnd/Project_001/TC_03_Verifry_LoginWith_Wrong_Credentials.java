package AmazonEndtoEnd.Project_001;

import org.testng.annotations.Test;



public class TC_03_Verifry_LoginWith_Wrong_Credentials extends Browser_Launch_Quit_Methods {
	@Test
	public void incorrectcredentials() throws InterruptedException {
		HomePage hp=new HomePage(d);
		hp.Accandlist(d);
		hp.signin(d);
		
		LoginPage l=new LoginPage(d);
		l.useremail(d);
		l.Password(d);
	}
}
