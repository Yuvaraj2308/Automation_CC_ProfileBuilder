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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.verifyElementPresent(findTestObject('Demographic Page/Text_Personal Information'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Demographic Page/My Information/Text_My Information'), 0, FailureHandling.STOP_ON_FAILURE)

String NAME = WebUI.getAttribute(findTestObject('Demographic Page/My Information/Input_Name'), 'value')

CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('Name', NAME, name)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__MobileNumber'), '9876543210')

WebUI.setText(findTestObject('Demographic Page/My Information/Input__BirthYear'), '1956')

String EMAIL = WebUI.getAttribute(findTestObject('Demographic Page/My Information/Input_Email'), 'value')

CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('Email', EMAIL, email)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Address1'), '8888 Pin Oak Drive NY')

WebUI.setText(findTestObject('Demographic Page/My Information/Input_Address2'), '8888 Pin Oak Drive NY')

WebUI.selectOptionByLabel(findTestObject('Demographic Page/My Information/Select_State'), 'Texas', false)

WebUI.selectOptionByLabel(findTestObject('Demographic Page/My Information/Select_City'), 'Houston', false)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Zipcode'), '414141')

//----------------------------------------------------------------------------------------------------------
//Driving information
WebUI.verifyElementPresent(findTestObject('Demographic Page/Driving inormation/Text_Driving_Information'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Demographic Page/Driving inormation/Input__DLNumber'), '190000001')

TestObject yourObject = findTestObject('Demographic Page/Driving inormation/Input__DLExpireDate')

//-------------------------------------------------------------------------------------------


// Specify the Test Object
TestObject yourObject = new TestObject("Demographic Page/Driving inormation/Input__DLExpireDate")

// Get the location of the object
Point objectLocation = WebUI.getElementLocation(yourObject)

// Get the size of the object
Dimension objectSize = WebUI.getElementSize(yourObject)

// Calculate the rightmost coordinates
int rightX = objectLocation.x + objectSize.width
int centerY = objectLocation.y + objectSize.height / 2

// Click on the rightmost side of the object
WebUI.clickOffset(yourObject, new Point(rightX, centerY))


//WebUI.click(findTestObject('Demographic Page/Driving inormation/Input__DLExpireDate'))



