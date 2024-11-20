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

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Login'), [('Email') : 'elnik234@gmail.com', ('Password') : 'Pw8KcgeYuc4='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Add product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web Testing/Shopping cart/Button_Checkout'))

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Add Address'), [('Country') : 'Indonesia', ('Name') : 'Elni', ('Phone_Number') : '08985664367'
        , ('ZIP_Code') : '4362', ('Address') : 'Jl. ABCDElni No.100', ('City') : 'Jakarta Selatan', ('State') : 'Indonesia'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Choose address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Choose delivery speed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Add CC or Debit'), [('Name') : 'Elni', ('Card_Number') : '1234567890123456'
        , ('Month') : '5', ('Expired_Year') : '2080'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web Testing/Checkout/Payment/Radio_CC or Debit'))

WebUI.click(findTestObject('Web Testing/Checkout/Payment/button_navigate_next Continue'))

WebUI.verifyElementVisible(findTestObject('Web Testing/Checkout/Payment/detail_Card ending'))

WebUI.verifyElementVisible(findTestObject('Web Testing/Checkout/Payment/detail_Card Holder'))

WebUI.click(findTestObject('Web Testing/Checkout/Payment/button_Place your order and pay'))

WebUI.verifyElementVisible(findTestObject('Web Testing/Checkout/Payment/h1_Thank you for your purchase'))

