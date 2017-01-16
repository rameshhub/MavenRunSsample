package RunTest.MavenRun;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends InheritanceOne {
	
	Actions ac;

	@Test(priority = 1)

	public void m2() {
		
		//login functionality 

		driverForFireFox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driverForFireFox.manage().window().maximize();
		driverForFireFox.get("https://qa.workshare.com");
		driverForFireFox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverForFireFox.findElement(By.id("signup-content-form-email")).sendKeys("testingbasics500@gmail.com");
		driverForFireFox.findElement(By.id("signup-content-form-email-btn-continue")).click();
		driverForFireFox.findElement(By.id("signup-content-form-password")).sendKeys("Second@123");
		driverForFireFox.findElement(By.id("signup-content-form-password-signin")).click();

	}
	
	
	

	@Test(enabled= false)

	public void createFolder()  {
		
		//driverForFireFox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//navigation to Folders page

		
		
		 ac = new Actions(driverForFireFox);

		WebElement el = driverForFireFox.findElement(By.xpath("//div[@class='files-header-action-wrapper']/div[1]/a[2]"));
		
		ac.moveToElement(el).click().perform();
		
		
		driverForFireFox.findElement(By.xpath(".//*[@id='folder-edit-name-input']")).sendKeys("NewCenturyBegain");

	    driverForFireFox.findElement(By.id("folder-edit-name-input-ok")).click();
		
		//comment
	

	}
	
	
	
	
	
	@Test(priority=2)
	public void waitForPageLoaded() {
		
		//waiting for the page load
		
		driverForFireFox.findElement(By.id("app-sidebar-item-folders-link")).click();
		
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
        	
                    public Boolean apply(WebDriver driverForFireFox) {
                        return ((JavascriptExecutor) driverForFireFox).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driverForFireFox, 30);
            
            wait.until(expectation);
            
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

	
	@Test(priority =3)
	public void shareFolder(){
		
		ac= new Actions(driverForFireFox);
		
		ac.moveToElement(driverForFireFox.findElement(By.xpath("//div[@id='files-item-list']/section[2]"))).click().perform();
		
		ac.moveToElement(driverForFireFox.findElement(By.xpath("//*[@id='filesandfolders-link-members']"))).click().perform();
		
		ac.moveToElement(driverForFireFox.findElement(By.xpath("//*[@id='members-add-dropdown-btn']"))).click().perform();
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}