package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");


		ChromeDriver driver=new ChromeDriver();
	
driver.get("https://www.redbus.in/");
driver.manage().window().maximize();
Thread.sleep(1000);

WebElement frmsource = driver.findElementById("src");
frmsource.sendKeys("chennai");
Thread.sleep(1000);
frmsource.sendKeys(Keys.TAB);
Thread.sleep(1000);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement frmsource1 = driver.findElementById("dest");
frmsource1.sendKeys("Bangalore");
Thread.sleep(1000);
frmsource.sendKeys(Keys.TAB);
Thread.sleep(1000);
driver.findElementByXPath("//label[@class='db text-trans-uc']").click();
Thread.sleep(1000);
driver.findElementByXPath("(//td[text()='12'])[2]").click();
driver.findElementByXPath("//button[text()='Search Buses']").click();
Thread.sleep(1000);
driver.findElementByXPath("(//div[text()='View Seats'])[1]").click();
Thread.sleep(1000);
WebElement count = driver.findElementByXPath("(//div[@class='seat-left m-top-30'])[1]");
String text1 = count.getText();
System.out.println(text1);

driver.close();
}

}