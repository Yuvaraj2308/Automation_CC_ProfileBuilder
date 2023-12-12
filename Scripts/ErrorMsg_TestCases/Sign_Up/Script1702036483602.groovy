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

WebUI.openBrowser('https://caring-connections-qa.azurewebsites.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign_Up'))

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/Text_Get_Started'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_First_Last_Name'), 'Palak Gupta')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '4646')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Username'), 'pgpalak.gupta17gmail.com')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'test123')

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign_Up'))

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/ErrorMsg_ZipCode_Atleast_5_digit'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/ErrorMsg_Invalid_email_address'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/ErrorMsg_Pwd_must_contain_one_uppercase_letter'), 0, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/ErrorMsg_At_least_one_must_be_selected'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '1234567891')

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/ErrorMsg_ZipCode_less_than_9_digit'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '464646')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Username'), 'pgpalak.gupta18@gmail.com')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'Test123')

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/ErrorMsg_Pwd_must_be_8_characters_long'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'Test1234')

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_Up_Page/ErrorMsg_Pwd_must_contain_one_specialSymbol'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'Test@123')

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_role_Senior'))

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign_Up'))

