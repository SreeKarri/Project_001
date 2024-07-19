package AmazonEndtoEnd.Project_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	public static WebDriver d;
	
	@FindBy(id="a-autoid-78-announce")
	WebElement viewitem;
	
	@FindBy(linkText="Write a product review")
	WebElement review;
	@FindBy(xpath="//button[@class='ryp__star__button']")
	WebElement starratig;
	@FindBy(xpath="//button[@class='ryp__star__button']")
	WebElement starratig2;
	@FindBy(xpath="//button[@class='ryp__star__button']")
	WebElement starratig3;
	
	public void ViewsItems(WebDriver d) {
		Actions a=new Actions(d);
		a.moveToElement(viewitem).perform();
		viewitem.click();
	}
	
	public void productreview(WebDriver d) {
		review.click();
       }
	public void overallratig(WebDriver d) {
		starratig.click();
		
		
	}

	/*
	 * public void overallratig2(WebDriver d) { starratig2.click(); } public void
	 * overallratig3(WebDriver d) { starratig3.click(); }
	 */
	public OrderPage(WebDriver d) {
		PageFactory.initElements(d, this);

	}
	
	
}
