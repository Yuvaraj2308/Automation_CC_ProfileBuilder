import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import javax.sound.sampled.AudioInputStream as AudioInputStream
import javax.sound.sampled.AudioSystem as AudioSystem
import javax.sound.sampled.Clip as Clip
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
//
//System.setProperty('webdriver.chrome.driver', 'Data Files/chromedriver-win64/chromedriver.exe')
//
//ChromeOptions options = new ChromeOptions()
//
//options.addArguments('start-maximized')
//
////Set preferences to allow microphone access
////options.setExperimentalOption("prefs",
////	new HashMap<String, Object>() {{
////		put("profile.default_content_setting_values.media_stream_mic", 1);
////	}}
////);
//// Set preferences to allow microphone access
//DesiredCapabilities capabilities = DesiredCapabilities.chrome()
//
//capabilities.setCapability(ChromeOptions.CAPABILITY, options)
//
//WebDriver driver = new ChromeDriver(capabilities)
//
//// Assuming you are using the Katalon Framework for the following lines
//DriverFactory.changeWebDriver(driver)

//Open Browser
//WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

WebUI.openBrowser('https://caring-connections-qa.azurewebsites.net/')

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/link_Forgot_password'))

WebUI.delay(2)

WebUI.setText(findTestObject('Login_Pages/Forgot_Password_Page/Input_Username'), 'pgpalakgupta17@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('Login_Pages/Forgot_Password_Page/button_Send_email'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Forgot_Password_Page/Text_Please_check_email'), 
    0)

WebUI.delay(2)

WebUI.closeBrowser()

