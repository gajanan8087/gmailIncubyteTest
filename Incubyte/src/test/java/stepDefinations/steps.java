package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.stepsPage;

public class steps {
	
	public static WebDriver driver;
	public stepsPage stp;
	
	@When("User launch the browser")
	public void user_launch_the_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Incubyte\\chromedriver.exe");
		driver= new ChromeDriver();
		stp =new stepsPage(driver);
	}

	@Given("User enter the URL as {string}")
	public void user_enter_the_url_as(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Given("User enter emailID as {string}")
	public void user_enter_email_id_as(String email) {
		stp.enter_emailID(email);
	}

	@Given("User click on Next button")
	public void user_click_on_next_button() {
		stp.clickNextbutton();
	}

	@Given("user enter password as {string}")
	public void user_enter_password_as(String string) {
		stp.enter_Password(string);
	}
	
	@Then("User click on compose option")
	public void user_click_on_compose_option() {
		stp.click_OnComposeButton();
	}

	@Then("User enter emaiID in TO section as {string}")
	public void user_enter_emai_id_in_to_section_as(String TOmailID) {
		stp.enter_toMailID(TOmailID);
	}

	@Then("User confirm the entered emailID")
	public void user_confirm_the_entered_email_id() {
		stp.click_OnConfMail();
	}

	@Then("User enter the subject of mail as {string}")
	public void user_enter_the_subject_of_mail_as(String mailSubject) {
		stp.enter_Subject(mailSubject);
	}

	@Then("User enter the mail body as {string}")
	public void user_enter_the_mail_body_as(String emailmsg) {
		stp.enter_emailBody(emailmsg);
	}

	@Then("User click on send button")
	public void user_click_on_send_button() {
		stp.click_sendButton();
	}



}
