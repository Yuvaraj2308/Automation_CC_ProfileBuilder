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

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/link_Forgot_password'))

WebUI.verifyElementPresent(findTestObject('Login_Pages/Forgot_Password_Page/Text_Forgot password'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login_Pages/Forgot_Password_Page/button_Send_email'))

WebUI.setText(findTestObject('Login_Pages/Forgot_Password_Page/Input_Username'), 'luffy.pg17gmail.com')

WebUI.click(findTestObject('Login_Pages/Forgot_Password_Page/button_Send_email'))

WebUI.verifyElementPresent(findTestObject('Login_Pages/Forgot_Password_Page/ErrorMsg_Invalid_email_address'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Forgot_Password_Page/Input_Username'), 'luffy.pg17@gmail.com')

WebUI.click(findTestObject('Login_Pages/Forgot_Password_Page/button_Send_email'))

WebUI.verifyElementPresent(findTestObject('Login_Pages/Forgot_Password_Page/Text_Check Your Email'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Pages/Forgot_Password_Page/Text_Please_check_email'), 0, FailureHandling.STOP_ON_FAILURE)

