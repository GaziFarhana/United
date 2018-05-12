package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
		
public static String PrintTitle(WebDriver driver)	{
	String value=driver.getTitle();
	return value;
	
}
public static WebElement FindELe(WebDriver driver, String xpath) {
	WebElement Ele=driver.findElement(By.xpath(xpath));
	return Ele;
}
public static String readproperties(String key) throws IOException {

	File f1=new File("/Users/gazifarhana/eclipse-workspace1/United/Locator.Properties");
	FileInputStream fis=new FileInputStream (f1);
	Properties prop=new Properties();
	prop.load(fis);
	String locatr=prop.getProperty(key);
	return locatr;

	}


}
