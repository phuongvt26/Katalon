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

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

TestObject createDynamicTestObject(String xpath) {
	return new TestObject().addProperty("xpath", ConditionType.EQUALS, xpath)
}

//TestObject dynamicInput = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//input[@id='txt-username']']")
//WebUI.click(findTestObject(dynamicInput,), FailureHandling.STOP_ON_FAILURE)
//WebUI.setText(dynamicInput, "ThisIsNotAPassword")
WebUI.click(createDynamicTestObject("//input[@id='txt-username']"),FailureHandling.STOP_ON_FAILURE)
WebUI.setText(createDynamicTestObject("//input[@id='txt-username']"), GlobalVariable.username)
WebUI.click(createDynamicTestObject("//input[@id='txt-password']"),FailureHandling.STOP_ON_FAILURE)
WebUI.setText(createDynamicTestObject("//input[@id='txt-password']"), GlobalVariable.password)
WebUI.click(createDynamicTestObject("//button[@id='btn-login']"))
WebUI.closeBrowser()

