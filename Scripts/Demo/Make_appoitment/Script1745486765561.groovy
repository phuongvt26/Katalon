import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

//WebUI.openBrowser('')
ChromeOptions options = new ChromeOptions()
options.addArguments('--incognito')
options.addArguments('--disable-save-password-bubble' // Tắt bubble lưu mật khẩu
    )
options.addArguments('--disable-infobars' // Tắt dòng "Chrome is being controlled..."
    )
WebDriver driver = new ChromeDriver(options)
DriverFactory.changeWebDriver(driver)
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/input_Username_username'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/button_Login'))

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/#appointment')

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/td_7'))

WebUI.setText(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'ets')

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Demo_login_01/Page_CURA Healthcare Service/Make Appoitment/Page_CURA Healthcare Service/a_Go to Homepage'))

