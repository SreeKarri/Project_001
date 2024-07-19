package AmazonEndtoEnd.Project_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultPage {
	public static WebDriver d;
	
	
	@FindBy(id="s-result-sort-select")
	WebElement sortby;
	
    	
	@FindBy(xpath="(//span[@class='rush-component'])[7]")
	WebElement shoe7;
	@FindBy(xpath=("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[7]"))
	WebElement sortbygender1;
	@FindBy(xpath=("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[8]"))
	WebElement sortbygender2;
	@FindBy(xpath=("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[12]"))
	WebElement brand;
	@FindBy(xpath=("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[10]"))
	WebElement gender3;
	public void sortingbypriceandRating(WebDriver d) throws InterruptedException   {
	Select s=new Select(sortby);
	s.selectByVisibleText("Price: High to Low");
	Thread.sleep(1000);
	s.selectByVisibleText("Avg. Customer Review");
	}
	public void Filterbygender(WebDriver d) {
		sortbygender1.click();
	}
	public void Filterbygender2(WebDriver d) {
		sortbygender2.click();
	}
	public void FilterbyBrand(WebDriver d) {
		brand.click();
	}
	public void Filterbygender3(WebDriver d) {
		gender3.click();
	}
	
	public void product7(WebDriver d) throws InterruptedException{
		Thread.sleep(2000);
		Actions a3=new Actions(d);
		a3.moveToElement(shoe7).perform();
		Thread.sleep(2000);
		shoe7.click();
	}
	
	

	public SearchResultPage(WebDriver d) {
		PageFactory.initElements(d, this);
}
}