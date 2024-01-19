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

//check heading Personal Information
WebUI.verifyElementPresent(findTestObject('Demographic Page/Text_Personal Information'), 0, FailureHandling.STOP_ON_FAILURE)

//My Information Section
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

//Emergency Contact section
//WebUI.verifyElementPresent(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Text_Emergency_Contact'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyName'), 'Shri')

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Select_EC_Relation'), 'Family', false)

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyAddress'), '8888 pin oak drive NY')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input_Address Line 2 (Optional)_emergencyAddress2'), 
    '8888 pin oak drive NY')

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Select_EC_State'), 'California', 
    false)

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/SelectEC_City'), 'Fresno', false)

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyZipcode'), '111111')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyMobileNumber'), '12345678909')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input_Other No_emergencyOtherNumber'), '12345098769')


