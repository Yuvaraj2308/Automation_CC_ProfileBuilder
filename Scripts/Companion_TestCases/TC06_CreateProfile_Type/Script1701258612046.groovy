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

WebUI.callTestCase(findTestCase('Common_TestCases/Companion_SignUp'), [('username') : UserName, ('zipcode') : ZipCode, ('email') : Email
        , ('password') : Password], FailureHandling.STOP_ON_FAILURE)

//------------------------------------------------
//Verify point-3 "Expectations from Companion"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Expectations_From_Senior'), 
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
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), Profile)

//scroll to next btn
WebUI.scrollToElement(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'), 
    0)

//click on next btn
WebUI.click(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'))

//wait for category-view page to load
//WebUI.waitForPageLoad(180)
WebUI.delay(45)

//Capture and print data of Education Category
String Education = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Educational_Info'), 
    'value')

//String EducationNew = 'I\'m Palak, a retired literature professor with a PhD from the University of Mumbai.'
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('EDUCATION', Education, EducationNew)

//Capture and print data of Hobbies Category
String Hobbies = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Hobbies'), 
    'value')

//String HobbiesNew = 'I\'ve dedicated over 35 years to teaching and now spend my retirement immersed in classic novels and poetry. I have a passion for painting and photography.'
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('HOBBIES', Hobbies, HobbiesNew)

//Capture and print data of Expectation Category
String Expectations = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_expectation'), 
    'value')

//String ExpectationsNew = 'I value companions who are creative, thoughtful. We could discuss a novel or paint together.'
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('EXPECTATIONS', Expectations, ExpectationsNew)

//Capture and print data of Other Category
String Others = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Health'), 
    'value')

//String OtherNew = 'on a personal note, i manage hypertension with a balanced diet and regular yoga, but that doesn\'t stop me from embracing every moment of life!  '
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('OTHERS', Others, OtherNew)

WebUI.waitForElementClickable(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Next'), 
    65)

//click on save and continue btn
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Next'))

//verify thankyou page
WebUI.verifyElementPresent(findTestObject('Object Repository/Thankyou_Page/Thankyou_Page_Objects/txt_h1_Thank you'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

