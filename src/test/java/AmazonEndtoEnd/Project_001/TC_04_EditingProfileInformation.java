package AmazonEndtoEnd.Project_001;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_04_EditingProfileInformation extends Browser_Launch_Quit_Methods{
	@Test
	public void Profile() throws InterruptedException  {
		
		HomePage hp=new HomePage(d);
		hp.Accandlist(d);
		hp.signin(d);
		
		LoginPage l=new LoginPage(d);
		l.useremail(d);
		l.Password(d);
		
		hp.Accandlist(d);
		hp.manageprofile(d);
		hp.view(d);
		hp.perferredep(d);
		hp.Edit1(d);
		hp.selmen(d);
		hp.savedit(d);
		hp.agegroup(d);
		hp.Edit2(d);
		hp.selagegroup(d);
		hp.saved(d);
		
		
		
		
		
	}
}
