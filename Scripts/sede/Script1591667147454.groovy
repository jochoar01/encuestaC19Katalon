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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app-inf6004.azurewebsites.net/app-covid19/')

WebUI.setText(findTestObject('Object Repository/nueva/input_Email Address_Username or email address'), 'juan.ochoa@ceiba.com.co')

WebUI.setEncryptedText(findTestObject('Object Repository/nueva/input_Forgot your password_Password'), 'i2GEJ9wOT+K86PH/Lf0BtA==')

WebUI.click(findTestObject('Object Repository/nueva/input_Forgot your password_rememberMe'))

WebUI.click(findTestObject('Object Repository/nueva/td_concat(id(  panel_left  ))_panel_left'))

WebUI.click(findTestObject('Object Repository/nueva/input_Forgot your password_rememberMe'))

WebUI.click(findTestObject('Object Repository/nueva/button_Sign in'))

WebUI.click(findTestObject('Object Repository/nueva/label_Acepto que he ledo y entendido la pol_4f2a5c'))



WebUI.click(findTestObject('Object Repository/nueva/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/nueva/button_Siguiente_1'))

WebUI.click(findTestObject('Object Repository/nueva/span_Embarazo_epm-radio-checkbox__show epm-_f6e54f'))

WebUI.click(findTestObject('Object Repository/nueva/span_Si_epm-radio-checkbox__show epm-radio-_222ebe'))

WebUI.click(findTestObject('Object Repository/nueva/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/nueva/button_Siguiente_1'))

