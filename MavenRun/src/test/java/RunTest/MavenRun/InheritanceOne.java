package RunTest.MavenRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class InheritanceOne {

	WebDriver driverForFireFox;

	@BeforeTest

	public void m1() {

		driverForFireFox = new FirefoxDriver();

	}

}
