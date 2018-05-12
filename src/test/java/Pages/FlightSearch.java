package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class FlightSearch extends Lib{


public static void searchByPrice(WebDriver driver) throws IOException, InterruptedException {	
WebElement price=FindELe(driver,readproperties("price"));
price.click();
Thread.sleep(2000);	
	
	
	
}
public static void update(WebDriver driver) throws IOException, InterruptedException {	
WebElement update=FindELe(driver,readproperties("update"));
update.click();
Thread.sleep(2000);	
	
}
public static void TicketPrice(WebDriver driver) throws IOException, InterruptedException {	
WebElement firstclass=FindELe(driver,readproperties("first"));
String value=firstclass.getText();
System.out.println("here is the ticket price for First Class  "+value);


}
public static void detail(WebDriver driver) throws IOException, InterruptedException {	
WebElement detail=FindELe(driver,readproperties("detail"));
detail.click();
Thread.sleep(2000);	
	
}
public static void printdetail(WebDriver driver) throws IOException, InterruptedException {	
WebElement print=FindELe(driver,readproperties("flight"));
String value=print.getText();
System.out.println(value);


}


}
