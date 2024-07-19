package AmazonEndtoEnd.Project_001;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

public class Browser_Launch_Quit_Methods implements ITestListener{
	public static WebDriver d;

	@BeforeMethod
	@Parameters("browser")
	public void LL(String nameofbrowser) {
		if (nameofbrowser.equals("Chrome")) {
			d = new ChromeDriver();
		}

		if (nameofbrowser.equals("edge")) {
			d = new EdgeDriver();
		}
		/*
		 * if (nameofbrowser.equals("Firefox")) { d = new FirefoxDriver(); }
		 */
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
  @AfterMethod public void logout() { 
	  
	  WebElement AccountandList =d.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")); 
	  Actions a=new Actions(d);
	  a.moveToElement(AccountandList).perform() ;
	  WebElement signout =d.findElement(By.xpath("//span[.='Sign Out']"));
	  signout.click();
   }

  public void onTestSuccess(ITestResult result) {
	
		ITestListener.super.onTestSuccess(result);
		
		 TakesScreenshot a1 =(TakesScreenshot) d;
	        File source =a1.getScreenshotAs(OutputType.FILE);
	        File destination =new File("C:\\Users\\kash9\\OneDrive\\Desktop\\Git\\Selenium-programs\\SeleniumProject\\photos\\Passed Tc\\"+Math.random()+".jpg");
	        try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	        Reporter.log("Tc passed sucessfully");
}
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		TakesScreenshot a2=(TakesScreenshot) d;
		File source1=a2.getScreenshotAs(OutputType.FILE);
		File destination1 =new File("C:\\Users\\kash9\\OneDrive\\Desktop\\Git\\Selenium-programs\\SeleniumProject\\photos\\Failed TC\\" + Math.random()+".jpg");
		
		try {
			FileHandler.copy(source1, destination1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Reporter.log("Tc passed FAILED");
	
}
}