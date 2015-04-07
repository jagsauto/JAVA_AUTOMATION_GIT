package com.qtpselenium.util;

public class Constants {

	// CONFIG file
	public static String CONFIG_FILE_PATH = System.getProperty("user.dir")
			+ "\\src\\com\\qtpselenium\\config\\CONFIG.properties";

	// xpath for Login

	public static final String username = "//*[@id='email']";
	public static final String password = "//*[@id='pass']";

	// xpath for landing Page
	public static final String profileLink = "//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]";

	// xpath for profile Page
	public static final String friends = "//*[@id='fbTimelineHeadline']/div[2]/div/a[3]";

	// xpath for findfriend
	public static final String findFriendtextbox = "//*[@class='_6ph rfloat _ohf']/div/div/div//span/input";
	public static final String searchedfriendlink = "//*[@class='fbProfileBrowserListItem']/div/div[2]/div/div/a";
	
	// xapth for Top Menu
	
	public static final String droplist ="//*[@id='pageLoginAnchor']";
	public static final String Settings ="//*[@class='_54nf']/li[8]/a";
	public static final String homepage ="//a[@href='https://www.facebook.com/?ref=logo']";
											         

	
	// xpath for Account Settings
	public static final String passwordLink= "//*[@id='SettingsPage_Content']/ul/li[4]/a/span[1]";
	
	public static final String currentPwd="//*[@id='password_old']";
	public static final String newPwd="//*[@id='password_new']";
	public static final String confirmtPwd="//*[@id='password_confirm']";
	public static final String saveButton= "//*[@class='submit uiButton uiButtonConfirm']/input";
	public static final String cancelButton= "//*[@class='pam uiOverlayFooter uiBoxGray topborder']/a";
	
	
	
	// Xpath for SUN PROJECT
	//XPATH FOR PROMO CODE PAGE
	public static final String promoTextBox="//*[@id='promoCodeInput']";
	public static final String promoContinueButton="//*[@id='continueButton']";
	
	// Xpath for ACQ step 1 personal page
	public static final String acceptCookie="//*[@id='cookiePolicyCloseSelector']";
	public static final String firstName="//*[@id='firstName']";
	public static final String lastName="//*[@id='lastName']";
	public static final String email="//*[@id='email']";
	public static final String confirmEmail="//*[@id='confirmEmail']";
	public static final String createPwd="//*[@id='password']";
	public static final String confirmPwd="//*[@id='confirmPassword']";
	public static final String continuePaymentButton="//*[@id='accountCreationButton']";

	
	
	// xpath for payment page
	public static final String cardName="//*[@id='accountName']";
	public static final String cardNumber="//*[@id='cardNumber']";
	public static final String expiryDateMonth="//*[@id='cardExpDateMonth']";
	public static final String expiryDateYear="//*[@id='cardExpDateYear']";
	public static final String securityCode="//*[@id='cardCCV']";
	public static final String billingAddressLine1="//*[@id='billingaddress1']";
	public static final String billingTown="//*[@id='billingcity']";
	public static final String continueOrderSummaryButton="//*[@id='accountPopSubmit']";
	
	//xapth for payment processing logo
	//*[@id='accountPopulation_form']/div[3]/img
	
	//xpath for ACQ step 3 Summary page
	public static final String termsCondition="//*[@id='termsAndConditions']/label";
	public static final String getMeStartedButton="//*[@id='reviewOrderButton']";

	//xpath for thank you page
	public static final String sunIrishUrl="//*[@class='image-header']/header/p[2]/a";
	public static final String thanksPageTopNavBar ="//*[@id='bp-welcome']/a";
			//*[@id='main']/section/section/header/p[2]/a";
	public static final String sunMobileAppImage="//*[@id='main']/section/ul/li[1]/div/img";
	public static final String appStore="//*[@class='app-list']/li/a";
	


}
