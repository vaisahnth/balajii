package com.mava;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class base {
	
	public static WebDriver driver;
	
	public static void launchbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASILAKUMAR\\eclipse-workspace\\mava\\chrome\\chome1\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
				{	
				System.setProperty("webdriver.gecko.driver","C:\\Users\\MASILAKUMAR\\eclipse-workspace\\mava\\chrome\\chromedriver.exe");
		driver = new FirefoxDriver();
		
				}}
		
		public static void geturl(String typeurl)
		{
		driver.get(typeurl);
		}
		
		public static void closewindow() {
			
			driver.close();
		}
		
	public static void title() {
		String titleurl = driver.getTitle();	
        System.out.println(titleurl);
		}
	 //or
	public static  void title2() {
		
		driver.getTitle();
	}
	
	public static void printscreen(String destination) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MASILAKUMAR\\eclipse-workspace\\mava\\screenshot\\"+destination+".png");
		FileUtils.copyFile(screenshotAs, dest);
		}
      public static void sendvalues(WebElement element, String value) {
    	  
    	 element.sendKeys(value);
		}	
	    public static void password(WebElement element , String typepass) {
	    	
	    	element.sendKeys(typepass);
	    	}
	    public static void quits() {
	    	driver.quit();
			

		}
	    public static  void clickonelement(WebElement element) {
	    element.click();
	    	
	    
	    }
	    public static void max() {
	    	driver.manage().window().maximize();
	      
	    

		}
	    
	    public static  void slow(int value) throws InterruptedException {
	
	     Thread.sleep(value);    	
		}
	    public static void navigateto(String url) {
			
	    	driver.navigate().to(url);   
		    
		}
	    public static void navigateback() {
			driver.navigate().back();

		}
	    public static void forward() {
	    	driver.navigate().forward();
	    
	    }
	    public static void refresh() {
			// TODO Auto-generated method stub
            driver.navigate().refresh();
		}
	    
	    public static void dropdown(WebElement element , int data ,String type) {
	    
	    Select s= new Select(element);
	    if(type.equalsIgnoreCase(type))
	    s.selectByIndex(data);
	    
	    
}
}

