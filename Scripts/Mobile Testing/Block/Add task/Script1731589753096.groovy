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

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.ImageButton - Add Button'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.EditText - Task title'), Title_task, 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.EditText - Task'), Task, 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.view.View - 14'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.Button - OK Date'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.EditText - Set Time'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.Button - OK Time'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.Spinner - Dropdown'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.CheckedTextView - Kategory Personal'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/Add Task/android.widget.TextView - Buton save'), 0)

