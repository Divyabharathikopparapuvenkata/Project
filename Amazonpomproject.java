package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pom.productproject;

public class Amazonpomproject {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			productproject search;
			
//			System.setProperty("webdriver.chrome.driver","/home/divikv219gmail/ChromeDriver/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			search = new productproject(driver);
			
			search.Search();
			search.Method();
			search.Mobilespage();

			

			}

	}
