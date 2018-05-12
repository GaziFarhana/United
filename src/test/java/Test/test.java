package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FlightSearch;
import Pages.Homepg;

public class test {
public static WebDriver driver;

@Before
public void initialize() {

	System.out.println("this is before class annotation!!!!!");
	System.getProperty("webdriver,chrome,driver", 
			"/Users/gazifarhana/eclipse-workspace1/United/chromedriver");

	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.united.com/ual/en/us/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@org.junit.Test

public void testtt() throws InterruptedException, IOException {

	System.out.println("test!!!!!!!!");

	Homepg.origin(driver);
	Homepg.IADairport(driver);
	Homepg.Destination(driver);
	Homepg.BOSairport(driver);
	Homepg.Depart(driver);
	Homepg.Return(driver);
	Homepg.Search(driver);
	FlightSearch.searchByPrice(driver);
	FlightSearch.update(driver);
	FlightSearch.TicketPrice(driver);
	FlightSearch.detail(driver);
	FlightSearch.printdetail(driver);
	
	
}


@After
public void teardown() {
	System.out.println("this is after class annotation!!!");
	System.out.println("test finished!!!!!");
	driver.manage().deleteAllCookies();
	driver.close();

}



}

