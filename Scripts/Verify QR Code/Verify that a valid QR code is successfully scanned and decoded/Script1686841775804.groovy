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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://m28dev.github.io/qrdecoder/')

WebUI.uploadFile(findTestObject('VERIFY QR CODE/input_QR code image_qrcode'), 'C:\\Users\\Lenovo\\Downloads\\chart (1).png')

WebUI.click(findTestObject('VERIFY QR CODE/button_Submit'))

WebUI.click(findTestObject('VERIFY QR CODE/textarea_Decoded_decoded'))

WebUI.waitForAlert(5)

WebUI.verifyMatch('MECARD:N:nicho;ORG:pt abc;TEL:08781839201;URL:nicho.com;EMAIL:nicho@mail.com;ADR:tangerang tangerang;NOTE:employee;;', 
    'MECARD:N:nicho;ORG:pt abc;TEL:08781839201;URL:nicho.com;EMAIL:nicho@mail.com;ADR:tangerang tangerang;NOTE:employee;;', 
    false)

