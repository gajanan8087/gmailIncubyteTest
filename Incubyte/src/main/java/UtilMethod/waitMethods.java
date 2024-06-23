package UtilMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitMethods {

	public WebDriver wDriver;
	
	public waitMethods(WebDriver driver) {
		wDriver =driver;
	}
	
	public void waitUntilElementVisiable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(wDriver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
