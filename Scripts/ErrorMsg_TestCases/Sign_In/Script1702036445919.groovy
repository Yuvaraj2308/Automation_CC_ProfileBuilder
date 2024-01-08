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

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_WelcomeBack'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Guidance_for_starting'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Shared_Purpose'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Shared_Purpose_description'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Impact'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Impact_description'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Inclusive'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Inclusive_description'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Aligned Values'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/Text_Aligned_Values_description'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Read_Now'))

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_close_Read_Now'))

WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Username'), 'luffy.pg17gmail.com')

WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Password'), 'Test123')

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/ErrorMsg_Invalid_email_address'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/ErrorMsg_Pwd_must_be_8_characters_long'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Username'), 'luffy.pg17@gmail.com')

WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Password'), 'Test@1234')

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Login_Pages/Sign_In_Page/ErrorMsg_Invalid_login_credentials'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Password'), 'Test@123')

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign In'))

