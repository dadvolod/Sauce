package SuperMaven;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GmailLoginTC {
	

	@Test
	public void Login() throws InterruptedException, MalformedURLException
	{
		
		DesiredCapabilities dc = new DesiredCapabilities().firefox();
		
		dc.setCapability("version", "37");
		dc.setCapability("platform", "Windows 10");
		WebDriver driver = new RemoteWebDriver(
		new URL("http://dadvolod:075ff0da-658d-49b7-be26-c32d4fed94d1@ondemand.saucelabs.com:80/wd/hub"), dc);

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
//		ExtentReports reports = new ExtentReports("/Users/dmitriyadvolodkin/Documents/Google/test-output/Automatio Test/NewTest.html", true);
//		ExtentTest test = reports.startTest("Gmail Login", "User logs into gmail");
//
//		
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/dmitriyadvolodkin/Documents/Google/Drivers/chromedriver");
//		WebDriver driver= new ChromeDriver();
//		driver.get("http://google.com");
//		test.log(LogStatus.PASS, "Opened google website");
//		
//		GooglePage gh=new GooglePage(driver);
//		gh.GmailLink().click();
//		test.log(LogStatus.PASS, "Clicked on gmail link");
//		
//		GmailLoginPage gl=new GmailLoginPage(driver);
//		gl.Signin().click();
//		test.log(LogStatus.PASS, "Clicked on gmail sign in link");
//		
//		GmailEmailInputPage ge = new GmailEmailInputPage(driver);
//		ge.EmailInput().sendKeys("dadvolodkin@governmentcio.com");
//		ge.NextButton().click();
//		test.log(LogStatus.PASS, "Entered gmail username");
//		
//		GmailPasswordInputPage gp = new GmailPasswordInputPage(driver);
//		Thread.sleep(4000);
//		gp.PasswordInput().sendKeys("slimshady56");
//		test.log(LogStatus.PASS, "Entered gmail password");
//		
//		gp.NextButton().click();
//		test.log(LogStatus.PASS, "Signed into Gmail!!!!");
//		
//		test.addScreenCapture("/Users/dmitriyadvolodkin/Documents/new.png");
//
//		reports.flush();
		
		
	}

}
