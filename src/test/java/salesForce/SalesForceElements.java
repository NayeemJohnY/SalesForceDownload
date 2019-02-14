package salesForce;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SalesForceElements {
 WebDriver driver;
 
 @FindBy(how=How.CSS, using ="input[name='USER']")
 WebElement username;
 
 
 @FindBy(how=How.CSS, using ="input[name='PASSWORD']")
 WebElement password;
 
 @FindBy(how=How.CSS, using ="input[value='Login']")
 WebElement login;
 
 @FindBy(how=How.CSS, using ="#phSearchInput")
 WebElement search;
 
 @FindBy(how=How.CSS, using ="#phSearchButton")
 WebElement searchBtn;
 
 @FindBy(how=How.XPATH, using ="//input[@name='viewAll']")
	WebElement viewAll;
 @FindBy(how=How.XPATH, using ="//a[text()='View file']")
	List <WebElement> allDocs;
 
}
