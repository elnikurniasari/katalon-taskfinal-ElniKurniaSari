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

WebUI.click(findTestObject('Web Testing/Checkout/Address/Add address/button_Add New Address'))

WebUI.setText(findTestObject('Web Testing/Checkout/Address/Add address/input_Country'), Country)

WebUI.setText(findTestObject('Web Testing/Checkout/Address/Add address/input_Name'), Name)

WebUI.setText(findTestObject('Web Testing/Checkout/Address/Add address/input_Phone Number'), Phone_Number)

WebUI.setText(findTestObject('Web Testing/Checkout/Address/Add address/input_ZIP Code'), ZIP_Code)

WebUI.setText(findTestObject('Web Testing/Checkout/Address/Add address/input_Address'), Address)

WebUI.setText(findTestObject('Web Testing/Checkout/Address/Add address/input_City'), City)

WebUI.setText(findTestObject('Web Testing/Checkout/Address/Add address/input_State'), State)

WebUI.click(findTestObject('Web Testing/Checkout/Address/Add address/Button_Submit Address'))

