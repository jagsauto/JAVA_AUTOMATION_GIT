package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.carwale.pages.landingPage;

public class TestcarwaleLandingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.carwale.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		landingPage lp = PageFactory.initElements(driver, landingPage.class);
		lp.mn.gotonewcars();
		lp.mn.gotosellcars();
		//landingPage lp = new landingPage();
		lp.GetPriceQuote("BMW","1 Series");
	}

}
