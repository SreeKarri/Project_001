package AmazonEndtoEnd.Project_001;

import org.testng.annotations.Test;



public class Tc_01_Registration extends Browser_Launch_Quit_Methods {

	
 @Test
public void customerregistration() throws InterruptedException {

	
	HomePage hp=new HomePage(d);
	
	hp.Accandlist(d);
	
	hp.signin(d);
	System.out.println("444");
	LoginPage l=new LoginPage(d);
	l.createaccount(d);
	
	System.out.println("555");
	RegistrationPage reg=new RegistrationPage(d);
	reg.customername();
	reg.email();
	reg.pwd();
	reg.confpwd();
	System.out.println("666");	
}
}
