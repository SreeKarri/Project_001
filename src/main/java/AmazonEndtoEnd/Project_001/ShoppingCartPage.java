package AmazonEndtoEnd.Project_001;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {
	public static WebDriver d;
	
	
	 @FindBy(id="quantity")
	WebElement addingquantity;
  
 
  
 
  
 public void updatingitemquantity_removing(WebDriver d) {
	 Select s=new Select(addingquantity);
     s.selectByIndex(3);
     s.selectByIndex(0);
  }
 
	
  
  
  
  
  public ShoppingCartPage(WebDriver d) {
		PageFactory.initElements(d, this);
  
  
  }
  
}
