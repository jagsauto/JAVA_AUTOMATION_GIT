package com.learning.cucumber.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebConnector
{
	public Properties OR =null;
	public Properties CONFIG =null;
	public WebDriver driver = null;
	public static WebConnector wb=null;
	public WebDriver mozilla=null;
	public WebDriver chrome=null;
	public WebDriver IE=null;
	private WebConnector()
	{
		
		if(OR==null)
		{
			
			try
			{
				//init OR
				OR= new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\learning\\cucumber\\config\\OR.properties");
				OR.load(fs);
				
				//init CONFIG to corresponding env
				CONFIG= new Properties();
				System.out.println("Config path: "+ System.getProperty("user.dir")+"\\src\\test\\java\\com\\learning\\cucumber\\config\\"+OR.getProperty("TestEnv")+"_Config.properties");
				
				fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\learning\\cucumber\\config\\"+OR.getProperty("TestEnv")+"_Config.properties");
				CONFIG.load(fs);
				//System.out.println(OR.getProperty("LoginUserName"));
				//System.out.println(CONFIG.getProperty("loginUrl"));

				
			}catch (Exception e)
			{
				System.out.println("Error occured in init properties");
			}
		}
		
	}
	
	//*********************** Singleton Function to create object of WebConnector class**********
	
	public static WebConnector getInstance()
	{
		if(wb==null)
		wb= new WebConnector();
				
		return wb;
	}
	
	//**************************** Application Independent Function******************************************
	
	public void openbrowser(String browserType)
	{
		if(browserType.equals("Mozilla") && mozilla==null)
		{
			driver = new FirefoxDriver();
			mozilla=driver;
			
		}else if (browserType.equals("Mozilla") && mozilla!=null)
		{
			driver = mozilla;
			
		}
		else if(browserType.equals("Chrome")&& chrome==null)
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Chrome//chromedriver.exe");
			driver= new ChromeDriver();
			chrome=driver;
		}else if(browserType.equals("Chrome")&& chrome!=null)
		{
			
			driver= chrome;
			
		}
		else if(browserType.equals("IE")&& IE==null)
		{
			System.out.println("init IE");
		}
		
		// maximise the browser window
		driver.manage().window().maximize();
		// Implicit wait- default timeout to check for an element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void click(String object)
	{
		// we need to read the xpath from OR properties 
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		
	}
	
	public void type(String objectxpath, String typeText)
	{
		
		driver.findElement(By.xpath(OR.getProperty(objectxpath))).sendKeys(typeText);
	}
	// navigate to the page
	public void navigate(String url)
	{
		// we are taking config .get prop so that we can read the value from the properties file
		driver.get(CONFIG.getProperty(url));
	}
	public void select(String objectxpath, String typeText)
	{
		driver.findElement(By.xpath(OR.getProperty(objectxpath))).sendKeys(typeText);

	}
	
	public Boolean isElementPresent(String objectXpath)
	{
		try
		{
			// we are taking config .get prop so that we can read the value from the properties file

			if(driver.findElements(By.xpath(OR.getProperty(objectXpath))).size()!=0)
				return true;
			else return false;
		}catch(Throwable t)
		{
			System.out.println(objectXpath+" Xapth does not exisit");
			return false;
		}
		
		
	}
	
	
	
	

}
