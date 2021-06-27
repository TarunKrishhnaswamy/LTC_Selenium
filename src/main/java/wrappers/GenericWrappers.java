package wrappers;


import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
   public RemoteWebDriver driver;
   public static Properties prop;
   public String surl;
   public GenericWrappers(){
	   Properties configprop = new Properties();
	   
	   try {
		configprop.load(new FileInputStream(new File("./src/test/java/config.properties")));
		surl = configprop.getProperty("URL");
		
	} catch (InvalidPropertiesFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   public void loadObjects(){
	   
	  prop = new Properties();
	  try {
		prop.load(new FileInputStream(new File("./src/test/java/object.properties")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   public void unloadObjects(){
	   prop = null;
   }
   
   public void invokeApp(String browser){
	   invokeApp(browser,surl);
   }
   
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if (browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();			
			}else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
				 driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("InternetExplorer")){
				System.setProperty("", "");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			//System.out.println("The "+browser+" got loaded and the url'"+url+"' is launched");
			reportStep("The "+browser+" got loaded and the url'"+url+"' is launched", "pass");
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.err.println("The url did not got loaded due to 'TimeoutException'");
			reportStep("The url did not got loaded due to 'TimeoutException'", "fail");
		}catch (WebDriverException e){
			//System.err.println("The browser got closed due to unexpected error");
			reportStep("The browser got closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("Element "+idValue+" is found and value "+data+" has been entered");
			reportStep("Element "+idValue+" is found and value "+data+" has been entered", "pass");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element "+idValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+idValue);
			reportStep("System is not able to perform action on the element "+idValue, "fail");
			//e.printStackTrace();
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+idValue);
			reportStep("System is unable to find the element "+idValue, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
		
		
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("Element "+nameValue+" is found and value "+data+" has been entered");
			reportStep("Element "+nameValue+" is found and value "+data+" has been entered", "pass");
		} catch (ElementNotVisibleException e) {
			reportStep("The element "+nameValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+nameValue, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+nameValue, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("Element "+xpathValue+" is found and value "+data+" has been entered");
			reportStep("Element "+xpathValue+" is found and value "+data+" has been entered", "pass");
		} catch (ElementNotVisibleException e) {
			reportStep("The element "+xpathValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathValue);
			reportStep("System is not able to perform action on the element "+xpathValue, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathValue);
			reportStep("System is unable to find the element "+xpathValue, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String s = driver.getTitle();
			//System.out.println("Title:"+title);
			reportStep("Title:"+title, "pass");
			if (s.equals(title))
				//System.out.println("Title is displayed as expected. Title:"+s);
				reportStep("Title is displayed as expected. Title:"+s, "pass");
			else
				//System.err.println("Title is NOT displayed as expected. Title displayed in screen:"+s+" Title Exepected:"+title);
				reportStep("Title is NOT displayed as expected. Title displayed in screen:"+s+" Title Exepected:"+title, "fail");
		} catch (NoSuchWindowException e) {
			//System.err.println("User is not able find window with the given title "+title);
			reportStep("User is not able find window with the given title "+title, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String s =driver.findElementById(id).getText();
			//System.out.println("");
			reportStep("Element "+id+" contains text "+s, "pass");
			if (s.equals(text))
				//System.out.println("Text for element "+id+" is displayed as expected. Text displayed:"+s);
				reportStep("Text for element "+id+" is displayed as expected. Text displayed:"+s, "pass");
			else
				//System.err.println("Text for element "+id+" NOT displayed as expected. Text displayed:"+s+" Text Expected:"+text);
				reportStep("Text for element "+id+" NOT displayed as expected. Text displayed:"+s+" Text Expected:"+text, "fail");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+id+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+id);
			reportStep("System is not able to perform action on the element "+id, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+id);
			reportStep("System is unable to find the element "+id, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		
		try {
			String s = driver.findElementByXPath(xpath).getText();
			if (s.equals(text))
				//System.out.println("Text for element "+xpath+" is displayed as expected. Text displayed:"+s);
				reportStep("Text for element "+xpath+" is displayed as expected. Text displayed:"+s, "pass");
			else
				//System.err.println("Text for element "+xpath+" NOT displayed as expected. Text displayed:"+s+" Text Expected:"+text);
				reportStep("Text for element "+xpath+" NOT displayed as expected. Text displayed:"+s+" Text Expected:"+text, "fail");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+xpath+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpath);
			reportStep("System is not able to perform action on the element "+xpath, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpath);
			reportStep("System is unable to find the element "+xpath, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		
		try {
			String s = driver.findElementByXPath(xpath).getText();
			if (s.contains(text))
				//System.out.println("Element conatins the text"+text+" as expected.");
				reportStep("Element conatins the text"+text+" as expected.", "pass");
			else
				//System.err.println("Element does NOT contain the text"+text+" as expected");
				reportStep("Element does NOT contain the text"+text+" as expected", "fail");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+xpath+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpath);
			reportStep("System is not able to perform action on the element "+xpath, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpath);
			reportStep("System is unable to find the element "+xpath, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			reportStep("Element "+id+" is clicked", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+id+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+id);
			reportStep("System is not able to perform action on the element "+id, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+id);
			reportStep("System is unable to find the element "+id, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void clickByClassName(String classVal) {
		
		try {
			driver.findElementByClassName(classVal).click();
			reportStep("Element "+classVal+" is clicked", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+classVal+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+classVal);
			reportStep("System is not able to perform action on the element "+classVal, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+classVal);
			reportStep("System is unable to find the element "+classVal, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			reportStep("Element "+name+" is clicked", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+name+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+name);
			reportStep("System is not able to perform action on the element "+name, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+name);
			reportStep("System is unable to find the element "+name, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			reportStep("Element "+name+" is clicked", "pass");
		} catch (ElementNotVisibleException e) {
			reportStep("The element "+name+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+name);
			reportStep("System is not able to perform action on the element "+name, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+name);
			reportStep("System is unable to find the element "+name, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			reportStep("Element "+name+" is clicked", "pass");
		} catch (ElementNotVisibleException e) {
			reportStep("The element "+name+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+name);
			reportStep("System is not able to perform action on the element "+name, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+name);
			reportStep("System is unable to find the element "+name, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			reportStep("Element "+xpathVal+" is clicked", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+xpathVal+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+xpathVal, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+xpathVal, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			reportStep("Element "+xpathVal+" is clicked", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+xpathVal+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+xpathVal, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+xpathVal, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String s= null;
			try {
				 s = driver.findElementById(idVal).getText();
				//System.out.println("Text:"+s);
				 reportStep("Text:"+s, "pass");
			}catch (ElementNotVisibleException e) {
				reportStep("The element "+idVal+" is not visible", "fail");
			}catch (ElementNotInteractableException e) {
				//System.err.println("System is not able to perform action on the element "+xpathVal);
				reportStep("System is not able to perform action on the element "+idVal, "fail");
			}catch (NoSuchElementException e) {
				//System.err.println("System is unable to find the element "+xpathVal);
				reportStep("System is unable to find the element "+idVal, "fail");
			}catch (WebDriverException e) {
				//System.err.println("Browser is getting closed due to unexpected error");
				reportStep("Browser is getting closed due to unexpected error", "fail");
			}/*finally {
				takeSnap();
			}*/
			return s;
	}

	public String getTextByXpath(String xpathVal) {
		
		String s= null;
		try {
			 s = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("Text:"+s);
			 reportStep("Text:"+s, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+xpathVal+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+xpathVal, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+xpathVal, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		return s;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(id);
			Select s = new Select(element);
			s.selectByVisibleText(value);
			reportStep("Value "+value+" is selected for element "+id, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+id+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+id, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+id, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(id);
			Select s = new Select(element);
			s.selectByIndex(value);
			reportStep("Value "+value+" is selected for element "+id, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+id+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+id, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+id, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}
	
public void selectValueById(String id, String value) {
	try {
		WebElement element = driver.findElementById(id);
		Select s = new Select(element);
		s.selectByValue(value);
		reportStep("Value "+value+" is selected for element "+id, "pass");
	}catch (ElementNotVisibleException e) {
		reportStep("The element "+id+" is not visible", "fail");
	}catch (ElementNotInteractableException e) {
		//System.err.println("System is not able to perform action on the element "+xpathVal);
		reportStep("System is not able to perform action on the element "+id, "fail");
	}catch (NoSuchElementException e) {
		//System.err.println("System is unable to find the element "+xpathVal);
		reportStep("System is unable to find the element "+id, "fail");
	}catch (WebDriverException e) {
		//System.err.println("Browser is getting closed due to unexpected error");
		reportStep("Browser is getting closed due to unexpected error", "fail");
	}/*finally {
		takeSnap();
	}*/
		
	}


	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			String currwin = driver.getWindowHandle();
			//System.out.println("sessionID for the present window:"+currwin);
			reportStep("sessionID for the present window:"+currwin, "pass");
			Set<String> allwin = driver.getWindowHandles();
			//System.out.println("SessionIDs of the windows currently open"+allwin);
			reportStep("SessionIDs of the windows currently open"+allwin, "pass");
			for(String onewin:allwin){
				driver.switchTo().window(onewin);
				//System.out.println("User is switching to parent window");
				reportStep("User is switching to parent window", "pass");
				break;
			}
		}catch(NoSuchWindowException e){
			//System.err.println("System is not able to find any window as such");
			reportStep("System is not able to find any window as such", "fail");
		}
		catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			String currwin = driver.getWindowHandle();
			//System.out.println("sessionID for the present window:"+currwin);
			reportStep("sessionID for the present window:"+currwin, "pass");
			Set<String> allwin = driver.getWindowHandles();
			//System.out.println("SessionIDs of the windows currently open"+allwin);
			reportStep("SessionIDs of the windows currently open"+allwin, "pass");
			for(String onewin:allwin){
				driver.switchTo().window(onewin);
				//System.out.println("User is switching to window with sessionID:"+onewin);
				reportStep("User is switching to window with sessionID:"+onewin, "pass");
				
			}
			//System.out.println("User has switched to last window");
			reportStep("User has switched to last window", "pass");
		}catch(NoSuchWindowException e){
			//System.err.println("System is not able to find any window as such");
			reportStep("System is not able to find any window as such", "fail");
		}
		catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void acceptAlert() {
		
		try {
			driver.switchTo().alert().accept();
			reportStep("System has switched to an Alert.And has clicked on OK button", "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("System is not able to find any alert");
			reportStep("System is not able to find any alert", "fail");
		}catch (WebDriverException e) {
		//	System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			reportStep("System has switched to an Alert.And has dismissed the Alert", "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("System is not able to find any alert");
			reportStep("System is not able to find any alert", "fail");
		}catch (WebDriverException e) {
		//	System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String s= null;
		try {
			s= driver.switchTo().alert().getText();
			//System.out.println("The text is displayed as:"+s);
			reportStep("The text is displayed as:"+s, "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("System is not able to find any alert");
			reportStep("System is not able to find any alert", "fail");
		}catch (WebDriverException e) {
		//	System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}
		return s;
	}
	//int i=1;
	public long TakeSnap() {
		long number = 100000l;
		try {
			  
			 number = (long) Math.floor(Math.random()*100000+100000l);
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/"+number+".jpeg");
			FileUtils.copyFile(temp, dest);
			
			
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
		return number;
	}

	public void closeBrowser() {
		try {
			driver.close();
			//System.out.println("The active browser is closed successully.");
			//reportStep("The active browser is closed successully.", "pass");
			reportStep( "The active browser is closed successfully.","pass", true);
		} catch (WebDriverException e) {
			//System.err.println("The application got crashed for unknown error.");
			//reportStep("The application got crashed for unknown error.", "fail");
		} 
		
	}

	public void closeAllBrowsers() {
		try {
			if (driver != null) {
				driver.quit();
				//System.out.println("All the browsers are closed successully.");
				//reportStep("All the browsers are closed successully.", "pass");
			reportStep( "All the browsers are closed successfully.","pass", true);
			}
		}catch (WebDriverException e) {
			//System.err.println("The application got crashed for unknown error.");
			reportStep("The application got crashed for unknown error.", "fail");
		} 
	}

	public void KeysTabById(String idValue) {
		try {
			driver.findElementById(idValue).sendKeys(Keys.TAB);
			reportStep("Tab key is pressed", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+idValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+idValue, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+idValue, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/	
		
	}

	public void ThreadSleep(long milisecs) {
		try {
			Thread.sleep(milisecs);
			reportStep("Application is in Explicit wait", "pass");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void KeysArrowDownById(String id) {
		try {
			driver.findElementById(id).sendKeys(Keys.ARROW_DOWN);
			reportStep("Arrow Down key is pressed", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+id+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+id, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+id, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/	
		
	}

	public void KeysEnterById(String id) {
		try {
			driver.findElementById(id).sendKeys(Keys.ENTER);
			reportStep("Enter key is pressed", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+id+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+id, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+id, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/	
		
	}

	public void MousehoverByXpath(String element) {
		try {
			WebElement ele = driver.findElementByXPath(element);
			Actions act =  new Actions(driver);
			act.moveToElement(ele).build().perform();
			reportStep("Mouse Hover Action is performed for element "+element, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+element+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+xpathVal);
			reportStep("System is not able to perform action on the element "+element, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+xpathVal);
			reportStep("System is unable to find the element "+element, "fail");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/	
		
	}

	public void selectVisibleTextByName(String name,String value) {
		try {
			WebElement element = driver.findElementByName(name);
			Select s = new Select(element);
			s.selectByVisibleText(value);
			reportStep("Value "+value+" is selected for element"+name, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("The element "+name+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			
			reportStep("System is not able to perform action on the element "+name, "fail");
		}catch (NoSuchElementException e) {
			
			reportStep("System is unable to find the element "+name, "fail");
		}catch (WebDriverException e) {
			
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/	
		
	}

	public void KeysTabByName(String nameValue) {
		try {
			driver.findElementByName(nameValue).sendKeys(Keys.TAB);
			reportStep("TAb key is pressed", "pass");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+nameValue, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+nameValue, "fail");
		}catch (WebDriverException e) {
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/	
		
	}

	public void selectValueByName(String name, String value) {
		try {
			WebElement element = driver.findElementByName(name);
			Select s = new Select(element);
			s.selectByValue(value);
			reportStep("Value "+value+" is selected for element "+name, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("Element"+name+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+name, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+name, "fail");
		}catch (ElementNotSelectableException e) {
			//System.err.println("System is unable to select the element "+nameValue);
			reportStep("System is unable to select the element "+name, "fail");
		}catch (WebDriverException e) {
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}	*/	
		
	}

	public void KeysTabByXpath(String xapthValue) {
		try {
			driver.findElementByXPath(xapthValue).sendKeys(Keys.TAB);
			reportStep("Tab key is pressed", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("Element"+xapthValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+xapthValue, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+xapthValue, "fail");
		}catch (WebDriverException e) {
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}	
		*/
	}

	public void selectVisibleTextByXpath(String xpath, String value) {
		try {
			WebElement element = driver.findElementByXPath(xpath);
			Select s = new Select(element);
			s.selectByVisibleText(value);
			reportStep("Value "+value+" is selected for element "+xpath, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("Element"+xpath+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+xpath, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+xpath, "fail");
		}catch (ElementNotSelectableException e) {
			//System.err.println("System is unable to select the element "+xpath);
			reportStep("System is unable to select the element "+xpath, "fail");
		}catch (WebDriverException e) {
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}	*/		
		
	}

	public String GetAttributeByXpath(String xpath, String Attribute) {
		String s= null;
		try {
			 s = driver.findElementByXPath(xpath).getAttribute(Attribute);
			//System.out.println("Text:"+s);
			 reportStep("The attribute value for the element "+xpath+" is "+s, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("Element"+xpath+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+xpath, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+xpath, "fail");
		}catch (WebDriverException e) {
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}	*/
		return s;
		
		
	}

	public void KeysEnterbyXpath(String xapthValue) {
		try {
			driver.findElementByXPath(xapthValue).sendKeys(Keys.ENTER);
			reportStep("Enter Key is pressed", "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("Element"+xapthValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+xapthValue, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+xapthValue, "fail");
		}catch (ElementNotSelectableException e) {
			//System.err.println("System is unable to select the element "+xapthValue);
			reportStep("System is unable to select the element "+xapthValue, "pass");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}	*/	
		
	}

	public void selectIndexByName(String name, int Index) {
		try {
			WebElement element = driver.findElementByName(name);
			Select s = new Select(element);
			s.selectByIndex(Index);
			reportStep("Index "+Index+" is selected for element "+name, "pass");
		}catch (ElementNotVisibleException e) {
			reportStep("Element"+name+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("System is not able to perform action on the element "+nameValue);
			reportStep("System is not able to perform action on the element "+name, "fail");
		}catch (NoSuchElementException e) {
			//System.err.println("System is unable to find the element "+nameValue);
			reportStep("System is unable to find the element "+name, "fail");
		}catch (ElementNotSelectableException e) {
			//System.err.println("System is unable to select the element "+xapthValue);
			reportStep("System is unable to select the element "+name, "pass");
		}catch (WebDriverException e) {
			//System.err.println("Browser is getting closed due to unexpected error");
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}	*/	
		
	}

	public void UploadPhotobyId(String path, String id) {
		
		try {
			Clipboard obj = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection obj1 = new StringSelection(path);
			obj.setContents(obj1, null);
			driver.findElementById(id).click();
			ThreadSleep(2000);
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			ThreadSleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			//System.out.println("Photo in path "+path + " has been uploaded.");
			reportStep("Photo in path "+path + " has been uploaded.", "pass");
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			reportStep("Element"+id+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			
			reportStep("System is not able to perform action on the element "+id, "fail");
		}catch (NoSuchElementException e) {
			
			reportStep("System is unable to find the element "+id, "fail");
		}catch (WebDriverException e) {
			reportStep("Browser is getting closed due to unexpected error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
		
	}

	
	

	

	

	
	
}
