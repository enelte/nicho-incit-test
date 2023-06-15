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
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://zxing.appspot.com/generator/')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Name_gwt-TextBox required'), 'nicho')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Company_gwt-TextBox'), 'pt abc')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Title_gwt-TextBox'), 'employee')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Phone number_gwt-TextBox'), '08781839201')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Email_gwt-TextBox'), 'nicho@mail.com')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Address_gwt-TextBox'), 'tangerang')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Address 2_gwt-TextBox'), 'tangerang')

WebUI.setText(findTestObject('Object Repository/QR CODE GENERATOR/input_Website_gwt-TextBox'), 'nicho.com')

WebUI.click(findTestObject('Object Repository/QR CODE GENERATOR/button_Generate'))

WebUI.verifyElementPresent(findTestObject('QR CODE GENERATOR/img_Generate_gwt-Image'), 0)

