package loginEDUBank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class verifyLogin {
	WebDriver driver;
	String url = "http://10.82.180.36/Common/Login.aspx";
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
		driver.findElement(By.name("ctl00$body$txtUserID")).sendKeys("donhere");
		driver.findElement(By.name("ctl00$body$txtPassword")).sendKeys("don@123");
		driver.findElement(By.name("ctl00$body$btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log Out")).click();
	}


}
