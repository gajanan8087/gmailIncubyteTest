package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilMethod.waitMethods;

public class stepsPage {
	
	WebDriver sDriver;
	public waitMethods waitExplict;
	
	public stepsPage(WebDriver driver){
		sDriver = driver;
		waitExplict = new waitMethods(driver);
		PageFactory.initElements(sDriver,this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailID;
	
	@FindBy (xpath= "//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy (xpath= "//input[@type='password']")
	WebElement password;
	
	@FindBy (xpath= "//div[text()='Compose']")
	WebElement composeButton;
	
	@FindBy (xpath= "//input[@id=':b6']")
	WebElement toMailID;
	
	@FindBy (xpath= "//div[@class='aL8']")
	WebElement cnfMail;
	
	@FindBy (xpath= "//input[@name='subjectbox']")
	WebElement subject;
	
	@FindBy (xpath= "//div[@aria-label='Message Body']")
	WebElement emailBody;
	
	@FindBy (xpath= "//div[text()='Send']")
	WebElement sendButton;
	
	public void enter_emailID(String email) {
		emailID.sendKeys(email);
	}
	
	public void clickNextbutton() {
	    waitExplict.waitUntilElementVisiable(nextButton);
		nextButton.click();
	}
	
	public void enter_Password(String pwd) {
		waitExplict.waitUntilElementVisiable(password);
		password.sendKeys(pwd);
	}
	
	public void click_OnComposeButton() {
		waitExplict.waitUntilElementVisiable(composeButton);
		composeButton.click();
	}
	
	public void enter_toMailID(String ToMailID){
		waitExplict.waitUntilElementVisiable(toMailID);
		toMailID.sendKeys(ToMailID);
	}
	
	public void click_OnConfMail() {
		waitExplict.waitUntilElementVisiable(cnfMail);
		cnfMail.click();
	}
	
	public void enter_Subject(String subj) {
		subject.sendKeys(subj);
	}
	
	public void enter_emailBody(String emailmsg) {
		emailBody.sendKeys("emailmsg");
	}
	
	public void click_sendButton() {
		sendButton.click();
	}

}
