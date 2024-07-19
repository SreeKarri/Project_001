package AmazonEndtoEnd.Project_001;

import org.testng.annotations.Test;


public class TC_02_VerifyLogin extends Browser_Launch_Quit_Methods{
	@Test
	public void credentials() throws InterruptedException  {
		
		HomePage hp=new HomePage(d);
		hp.Accandlist(d);
		hp.signin(d);
		
		LoginPage l=new LoginPage(d);
		l.useremail(d);
		l.Password(d);
		
	}
}
