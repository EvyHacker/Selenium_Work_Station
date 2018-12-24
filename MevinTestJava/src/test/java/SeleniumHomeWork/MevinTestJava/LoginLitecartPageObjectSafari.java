package SeleniumHomeWork.MevinTestJava;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginLitecartPageObjectSafari {
	
	private WebDriver driver;
	
	
	@Before
	public void setUp() {
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://ipropopka.fios-router.home/litecart/public_html/admin/login.php");
		LoginLitecart.testLogin(driver).sendKeys("admin");
		LoginLitecart.testPassword(driver).sendKeys("admin");
		Thread.sleep(3000);
		LoginLitecart.clickOnLoginButton(driver);

	}
}
