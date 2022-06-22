package com.pom;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productproject {
static WebDriver driver;

public productproject(WebDriver driver) {
this.driver= driver;
}

//Locator desc
static By data=By.id("twotabsearchtextbox");
static By search=By.id("nav-search-submit-button");
static By bestseller=By.xpath("(//a[text()='Best Sellers'])[1]");
static By mobiles=By.xpath("(//a[text()='Mobiles'])[1]");
static By fashion=By.xpath("(//a[text()='Fashion'])[1]");
static By ten=By.xpath("//span[contains(text(),'10%')] ");
static By back=By.xpath("(//span[text()='Any Discount'])[1]");
static By twentyfive=By.xpath("//span[contains(text(),'25% ')] ");
static By back25=By.xpath(" (//span[text()='Any Discount'])[1]");
static By thirtyfive=By.xpath("//span[contains(text(),'35% ')] ");

static By back35=By.xpath(" (//span[text()='Any Discount'])[1]");

static String URL = "https://www.amazon.in/";
//
//login

public void Search() throws InterruptedException  {

driver.get(URL);
Thread.sleep(3000);
driver.findElement(data).sendKeys("Dell laptops");
driver.findElement(search).click();
JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("scroll(0,800)");
List<WebElement> lstDiv = driver.findElements(By.xpath("//div[contains(@class,'s-card-container')]"));
//for(WebElement parentDiv:lstDiv)
for (WebElement parentDiv:lstDiv) {
	List<WebElement> listlinks = parentDiv.findElements(By.xpath(".//a[contains(@class,'s-underline-link-text')]"));
	List<WebElement> pricelinks=parentDiv.findElements(By.xpath(".//span[contains(@class,'a-price-whole')]"));
	if(listlinks.size()>0 )
	{
	System.out.println(pricelinks.get(0).getText());
	System.out.println(listlinks.get(0).getText() );	
	}
	
}
	

}

public void Method() throws InterruptedException {
	driver.get(URL);
	Thread.sleep(3000);
	driver.findElement(bestseller).click();
	driver.findElement(mobiles).click();
	driver.findElement(fashion).click();
	
	
}
public void Mobilespage() throws InterruptedException {
	driver.get(URL);
	Thread.sleep(3000);
	driver.findElement(mobiles).click();
	driver .findElement(ten).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	js3.executeScript("scroll(0,800)");
	Thread.sleep(2000);
	driver.findElement(back).click();

	driver.findElement(twentyfive).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js3.executeScript("scroll(0,800)");
	Thread.sleep(2000);

	driver.findElement(back25).click();

	driver.findElement(thirtyfive).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("scroll(0,800)");
	Thread.sleep(2000);

	driver.findElement(back35).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("scroll(0,800)");
	Thread.sleep(2000);
	
}

}