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

WebUI.callTestCase(findTestCase('Web Testing/TC02 Login/TC02-01 Succcess login with valid email and password'), [('Email') : 'elnik234@gmail.com'
        , ('Password') : 'Pw8KcgeYuc4=', ('Text') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web Testing/Register/Navbar_Account'))

WebUI.click(findTestObject('Web Testing/Checkout/Address/Add address/Navbar_Sub Menu Orders Payment'))

WebUI.click(findTestObject('Web Testing/Checkout/Payment/Navbar_Sub Menu Payment Options'))

WebUI.callTestCase(findTestCase('Web Testing/Blocks/Add CC or Debit'), [('Name') : Name, ('Card_Number') : Card_Number, ('Month') : Month
        , ('Expired_Year') : Expired_year], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Web Testing/Checkout/Payment/detail_Name CC'))

WebUI.verifyElementVisible(findTestObject('Web Testing/Checkout/Payment/detail_Card Number'))
