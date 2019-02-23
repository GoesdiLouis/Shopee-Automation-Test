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

'set username for login'
username = 'please set the username and password in login test case'

'set password for login'
password = ''

'open browser'
WebUI.openBrowser('')

'navigate to Github'
WebUI.navigateToUrl('https://github.com/')

'maximize browser window'
WebUI.maximizeWindow()

'click on sign in button'
WebUI.click(findTestObject('Page_The worlds leading software de/a_Signin'))

'input username for login'
WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email addres'), username)

'input password for login'
WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_password'), password)

'click login button'
WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/Login Button'))

'verify login success'
WebUI.verifyElementPresent(findTestObject('Page_GitHub/summary_HeaderNav'), 10)

