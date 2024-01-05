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

System.setProperty('webdriver.chrome.driver', 'Data Files/chromedriver-win64/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

options.addArguments('start-maximized')

options.addArguments('force-device-scale-factor=1.2')

DesiredCapabilities capabilities = DesiredCapabilities.chrome()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver = new ChromeDriver(capabilities)

// Assuming you are using the Katalon Framework for the following lines
DriverFactory.changeWebDriver(driver)

//Open Browser
WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

//WebUI.openBrowser('https://caring-connections-qa.azurewebsites.net/')
WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign_Up'))

//enter first name and last name
WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_First_Last_Name'), 'Palak')

//enter zip code
WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '414141')

//enter emailID
WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Username'), 'luffy.pg1950@gmail.com')

//enter password
WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'Test@123')

//select role
WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_role_Senior'))

//click on signup button
WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign_Up'))

WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Expectations_From_Companion'), 
    0)

//Verify Text "Select the Button of your choice"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Select the button of your choice to create your profile'), 
    0)

//Verify Text "We are exicted"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_We are excited'), 0)

//Click on I want to type button
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'), 
    65)

//click on I wnt to type button
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'))

//enter you profie info
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Greetings, I\'m Palak, a seasoned explorer in the journey of life, joyfully celebrating my 58 years of existence. With a background in environmental science, I dedicated decades to understanding and preserving the natural world. Beyond scientific pursuits, I find solace in the rhythm of pottery, shaping clay into intricate forms, and the therapeutic art of cooking. In a companion, I seek someone who shares my passion for environmental conservation and has an appreciation for the creative blend of artistry and sustainable living. Health-wise, I\'ve faced challenges with asthma, but with careful management and regular breathing exercises, I continue to pursue my passions with vigor. Life has been a captivating adventure, and I look forward to molding new experiences with a like-minded soul who appreciates the beauty of nature and the creativity of the human spirit.')

//scroll to next btn
WebUI.scrollToElement(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'), 
    0)

//click on next btn
WebUI.click(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'))

//wait for category-view page to load
//WebUI.waitForPageLoad(180)
WebUI.delay(20)

WebUI.waitForElementNotPresent(findTestObject('WaitingPage/Waiting_Page/txt_1-2 minutes'), 180)

WebUI.waitForElementClickable(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Next'), 
    65)

//click on save and continue btn
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Next'))

//calender page
WebUI.waitForElementNotPresent(findTestObject('WaitingPage/Waiting_Page/Clock_categoryToCalender'), 10)

//WebUI.waitForElementClickable(findTestObject('null'),
//    10)
WebUI.scrollToElement(findTestObject('Calendar_page/Input_Start_Date'), 0)

WebUI.click(findTestObject('Calendar_page/Input_Start_Date'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/startDate/JanuaryStartDates/div_10'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/Input_Busy_Days'))

WebUI.click(findTestObject('Calendar_page/busyDates/JanuaryBusyDate/div_17'))

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/busyDates/JanuaryBusyDate/div_22'))

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/div_day_Column'))

WebUI.selectOptionByLabel(findTestObject('Calendar_page/Select_Available_From'), '01:30 PM', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Calendar_page/Select_Available_To'), '04:30 PM', false)

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/button_Next'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/button_SaveCalendarPage'))

//verify thankyou page
WebUI.verifyElementPresent(findTestObject('Object Repository/Thankyou_Page/Thankyou_Page_Objects/txt_h1_Thank you'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

