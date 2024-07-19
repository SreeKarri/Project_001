package AmazonEndtoEnd.Project_001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public static WebDriver d;

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement AccountandList;
	@FindBy(xpath = "//span[.='Sign in']")
	WebElement siginbutton;
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchfield;
   @FindBy(id="nav-cart-text-container")
   WebElement cart;
	
   @FindBy(xpath="//span[.='Returns']")
   WebElement returnsandorders;
   
	@FindBy(xpath="//span[.='Manage Profiles']")
	  WebElement manageprofile;
	
	
	  
	  @FindBy(xpath="//a[.='View']")
	  WebElement view;
	  @FindBy(xpath="//div[.='Preferred department']")
	  WebElement selectdep;
	  @FindBy(xpath="//button[.='Edit']")
	  WebElement edit1;
	  @FindBy(xpath="//button[.='Men']")
	  WebElement men;
	  @FindBy(xpath=("(//input[@class='a-button-input'])[4]"))
	  WebElement submit;
	  @FindBy(xpath="//button[@id='radix-5']")
	  WebElement selage;
	  @FindBy(xpath="//button[.='Edit']")
	  WebElement edit2;
	  @FindBy(xpath="//div[@class='options-list six-column-grid']")
	  WebElement selectone;
	 
	  @FindBy(xpath="//span[@class='a-button a-button-normal a-button-primary button']")
	  WebElement submit2;
	 @FindBy(id="twotabsearchtextbox")
     WebElement product;
	public void Accandlist(WebDriver d) throws InterruptedException {
		Thread.sleep(2000);
		Actions a1 = new Actions(d);
		a1.moveToElement(AccountandList).perform();

	}

	public void signin(WebDriver d) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		siginbutton.click();
	}

	public void SearchingforShoe(WebDriver d) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		searchfield.sendKeys("shoe" + (Keys.ENTER));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	public void cart(WebDriver d) {
		Actions a2=new Actions(d);
		a2.moveToElement(cart).perform();
		cart.click();
	}
	public void manageorders(WebDriver d) {
		returnsandorders.click();
	}

	public void manageprofile(WebDriver d) {
		manageprofile.click();
		
}
	public void view(WebDriver d) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Actions a=new Actions(d);
		a.moveToElement(view).perform();
		view.click();
	}
			
			public void perferredep(WebDriver d) {
			Actions a2=new Actions(d);
			a2.moveToElement(selectdep).perform();
				selectdep.click();
	}
			public void Edit1(WebDriver d) {
				edit1.click();
			}
			public void selmen(WebDriver d)  {
				
				men.click();
			}
			public void savedit(WebDriver d) throws InterruptedException  {
				Thread.sleep(500);
				submit.click();
			}
			public void agegroup(WebDriver d) throws InterruptedException {
				Thread.sleep(500);
				Actions a3=new Actions(d);
				a3.moveToElement(selage).perform();
				selage.click();
	}
			public void Edit2(WebDriver d) {
				edit2.click();
				
				
			}
			public void selagegroup(WebDriver d) {
				
				Select s=new Select(selectone);
				s.deselectByVisibleText("18-20");
				
			}
			public void saved(WebDriver d) throws InterruptedException {
				Thread.sleep(500);
				submit2.click();
			}
			public void productsearching(WebDriver d) {
				
				product.sendKeys("Shoe");
				product.sendKeys(Keys.ENTER);
			}
		
		public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);

	}
}