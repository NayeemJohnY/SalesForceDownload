package salesForce;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.BrowserLibrary;




public class SalesForceDownload {
	WebDriver driver;
	SalesForceElements salesForceEle;
	
	@BeforeTest
	public void browserSetup()
	{
		driver=BrowserLibrary.Browser("chrome");
		
	}
	@Test
	public void Test() throws InterruptedException, AWTException, IOException {
		driver.get("url");
		driver.manage().window().maximize();
		salesForceEle=PageFactory.initElements(driver, SalesForceElements.class);
		salesForceEle.username.sendKeys("useranme");
		salesForceEle.password.sendKeys("password@1702m");
		salesForceEle.login.click();
		salesForceEle.search.sendKeys("03690126");
		salesForceEle.searchBtn.click();
		String caseNo="03690126";
		driver.findElement(By.xpath("//a[contains(text(),'"+caseNo+"')]")).click();
		WebDriverWait wait= new WebDriverWait(driver,10);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='viewAll']")));
		salesForceEle.viewAll.click();
		
		for (WebElement a:salesForceEle.allDocs)
		{
			a.click();
		}
	}
}
