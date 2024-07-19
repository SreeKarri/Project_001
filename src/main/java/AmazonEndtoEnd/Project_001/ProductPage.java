package AmazonEndtoEnd.Project_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class ProductPage {
	public static WebDriver d;
	@FindBy(name="dropdown_selected_size_name")
	WebElement selsize;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	  WebElement addtocart;
	@FindBy(xpath="(//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay'])[1]")
	WebElement price;
	@FindBy(xpath="//div[@id='averageCustomerReviews']")
	WebElement reviews;
	@FindBy(xpath="//h3[normalize-space()='About this item']")
	WebElement prodiscription;
	public void selectingsize(WebDriver d) {
		Select s=new Select(selsize);
		s.selectByVisibleText("10");
	}
	public void addingitems(WebDriver d) {
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			  Actions a1=new Actions(d);
			  a1.moveToElement(addtocart).perform();
			  addtocart.sendKeys(Keys.ENTER);
	}
	

	public void displayingprice(WebDriver d) {
		
		System.out.println(price.isDisplayed());
		Reporter.log("displaying price");
	}
	public void displayreviews(WebDriver d) {
		Actions a=new Actions(d);
		a.moveToElement(reviews).perform();
		System.out.println(reviews.isDisplayed());
		Reporter.log("displaying Reviews");
	}
	
	
	public void discription(WebDriver d) throws InterruptedException {
		Thread.sleep(2000);
		prodiscription.isDisplayed();
		System.out.println(prodiscription.isDisplayed());
		Reporter.log("displaying productdesscription");
	}
	
	
	
	
	
	
	
	public ProductPage(WebDriver d) {
		PageFactory.initElements(d, this);
}
}