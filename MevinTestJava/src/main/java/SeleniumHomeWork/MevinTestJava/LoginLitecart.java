package SeleniumHomeWork.MevinTestJava;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLitecart {
	public static WebElement element = null;

	public WebDriver driver;

	@Test

	public static WebElement testLogin(WebDriver driver) {
		element = driver.findElement(By.name("username"));
		return element;

	}

	public static WebElement testPassword(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}

	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.name("login"));
		return element;
	}

	public static void clickOnLoginButton(WebDriver driver) {
		element = loginButton(driver);
		element.click();

	}

}
