import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'access gist page'
WebUI.callTestCase(findTestCase('Access Page/Access Gist Page'), [:], FailureHandling.STOP_ON_FAILURE)

'input gist description'
WebUI.setText(findTestObject('Page_Create a new Gist/gist_Description'), 'gist description')

'input gist filename'
WebUI.setText(findTestObject('Page_Create a new Gist/gist_filename'), 'mandatory.c')

'select all gist code'
WebUI.sendKeys(findTestObject('Page_Create a new Gist/gist_code'), Keys.chord(Keys.CONTROL, 'a'))

'empty gist code'
WebUI.sendKeys(findTestObject('Page_Create a new Gist/gist_code'), Keys.chord(Keys.DELETE))

'verify create public gist button is disabled'
WebUI.verifyElementNotClickable(findTestObject('Page_Create a new Gist/button_Create public gist'))

'verify create secret gist button is disabled'
WebUI.verifyElementNotClickable(findTestObject('Page_Create a new Gist/button_Create secret gist'))

