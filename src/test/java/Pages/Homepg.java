package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Homepg extends Lib{

public static void origin(WebDriver driver) throws IOException, InterruptedException	{
WebElement origin= FindELe(driver, readproperties("origin"));
origin.sendKeys("IAD");
Thread.sleep(2000);	
}	
	
public static void IADairport (WebDriver driver) throws IOException, InterruptedException {
	WebElement iad= FindELe(driver, readproperties("IAD"));
	iad.click();
	Thread.sleep(2000);	

}
public static void Destination (WebDriver driver) throws IOException, InterruptedException {
	WebElement desti= FindELe(driver, readproperties("destination"));
	desti.sendKeys("BOS");
	Thread.sleep(2000);	
}
public static void BOSairport (WebDriver driver) throws IOException, InterruptedException {
	WebElement bos= FindELe(driver, readproperties("BOS"));
	bos.click();
	Thread.sleep(2000);	
}

public static void Depart (WebDriver driver) throws IOException, InterruptedException {
	WebElement depart= FindELe(driver, readproperties("depart"));
	depart.sendKeys("05/15/2018");
	Thread.sleep(2000);	
}
public static void Return (WebDriver driver) throws IOException, InterruptedException {
	WebElement retur = FindELe(driver, readproperties("return"));
	retur.sendKeys("05/15/2018");
	Thread.sleep(2000);	

}
public static void Search (WebDriver driver) throws IOException, InterruptedException {
	WebElement Searchticket = FindELe(driver, readproperties("search"));
	Searchticket.click();
	Thread.sleep(2000);	

}
}
