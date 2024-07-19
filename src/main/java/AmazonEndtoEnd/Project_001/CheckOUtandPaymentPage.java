package AmazonEndtoEnd.Project_001;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOUtandPaymentPage {
	public static WebDriver d;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement procedtocheckout;

	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement phone;

	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement address1;

	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement address2;

	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city;

	@FindBy(xpath=("(//span[@class='a-button-text a-declarative'])[2]"))
	WebElement state;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_14")
	WebElement select1st;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement pincode;

	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement checkbox;

	@FindBy(xpath=("(//input[@class='a-button-input'])[5]"))
	WebElement usethisadd;
	@FindBy(xpath="//a[@class='a-link-emphasis pmts-add-amazon-store-card-learn-more-link']")
	WebElement amzStorecard;
	@FindBy(id="apx-add-bank-account-content-trigger-declarative-action-test-id")
	WebElement checkingaccount;
	@FindBy(name="ppw-accountHolderName")
	WebElement accountholdername;
	@FindBy(name="addBankAccountRoutingNumber")
	WebElement routingnumber;
  @FindBy(name="addBankAccountNumber")
  WebElement accountnumber;
  @FindBy(name="confirmBankAccountNumber")
  WebElement confirmAccountnumber;
  @FindBy(name="addBankAccountDriversLicense")
  WebElement driverlicense;
  @FindBy(name="ppw-licenseIssuedState")
  WebElement maryland;
  @FindBy(xpath=("(//span[.='Add this checking account'])[1]"))
  WebElement addchecingaccount;
	@FindBy(xpath="//a[.='Add a credit or debit card']")
	WebElement addcreditDebit;
	@FindBy(name="addCreditCardNumber")
	WebElement cardnumber;
	@FindBy(name="ppw-accountHolderName")
	WebElement nameoncard;
	@FindBy(name="ppw-expirationDate_month")
	WebElement expiredate;
	@FindBy(name="ppw-expirationDate_year")
    WebElement expireyear;
	@FindBy(xpath="//input[@name='addCreditCardVerificationNumber']")
	WebElement securitycode;
	@FindBy(xpath="//span[.='Add your card']")
	WebElement addmycard;
	
	public void procheckout(WebDriver d) {
		procedtocheckout.sendKeys(Keys.ENTER);
	}
	public void ph(WebDriver d) throws InterruptedException {
		Actions a=new Actions(d);
		Thread.sleep(3000);
		a.moveToElement(phone).perform();
		phone.sendKeys("9929006644");
	}
	public void address1(WebDriver d) {
		address1.sendKeys("3370 SoniaTrl");
	}
	public void address2(WebDriver d) {
		address2.sendKeys("201");
	}
	public void city(WebDriver d) {
		city.sendKeys("Ellicott");
	}
	public void country(WebDriver d)  {
		state.click();}
	public void selectstate(WebDriver d) throws InterruptedException{
		
	Actions a1=new Actions(d);
		Thread.sleep(2000);
		a1.moveToElement(select1st).perform();
		Thread.sleep(3000);
		select1st.click();
	}
	public void pin(WebDriver d) throws InterruptedException {
		pincode.sendKeys("21043");
		Thread.sleep(2000);
	}
	public void checkbox(WebDriver d) {
		checkbox.click();
	}

    public void usethisadd(WebDriver d) throws InterruptedException

	{
		Thread.sleep(2000);
		Actions a4=new Actions(d);
	a4.moveToElement(usethisadd).perform();
		usethisadd.click();
	}
    public void AmazonstoreCard(WebDriver d) throws InterruptedException {
    	amzStorecard.click();
    	Thread.sleep(500);
    	
    }
    public void addcheckingaccount(WebDriver d) {
    	checkingaccount.click();
    }
    public void nameonAccount(WebDriver d) {
    	accountholdername.sendKeys("JYOTHISREE KARRI");
    	}
    public void Routingnumber(WebDriver d) {
    	routingnumber.sendKeys("113300033");
    }
    public void checkingaccnumber(WebDriver d) {
    	accountnumber.sendKeys("5860144541920488");
    }
    public void confirmchecaccountno(WebDriver d) {
    	confirmAccountnumber.sendKeys("5860144541920488");
    }
    public void drivlicenseno(WebDriver d) {
    	driverlicense.sendKeys("K-600-622-693-552");
    }
    public void licenseState(WebDriver d) {
    	Select s=new Select(maryland);
    	s.selectByVisibleText("MD");
    }
    public void addingcheckingaccount(WebDriver d) {
    	addchecingaccount.click();
    }
    
	public void addcredit_debit(WebDriver d)  {
		
		
		addcreditDebit.click();
	}
	
	public void cardnumber(WebDriver d) {
		cardnumber.sendKeys("4400661395032409");
				
	}
	public void Nameoncard(WebDriver d) {
		nameoncard.sendKeys("JYOTHISREE KARRI");	
	}
	public void date(WebDriver d) {
		Select s=new Select(expiredate);
		s.selectByIndex(3);
				
	}
	public void year(WebDriver d) {
		Select s1=new Select(expireyear);
		s1.selectByVisibleText("2027");
	}
	public void verificationpin(WebDriver d) {
		securitycode.sendKeys("982");
	}
	public void Addmycard(WebDriver d) {
		addmycard.click();
	}
	public CheckOUtandPaymentPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
}
