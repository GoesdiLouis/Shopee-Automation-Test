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

'filename to be deleted'
gistFilename = 'Edited Filename.c'

'access gist page'
WebUI.callTestCase(findTestCase('Access Page/Access Gist Page'), [:], FailureHandling.STOP_ON_FAILURE)

'see list of all gist'
WebUI.click(findTestObject('Page_Create a new Gist/a_See all of your gists'))

'verify access list of all gist page success'
WebUI.verifyElementPresent(findTestObject('Page_gists/All_gists_Link'), 5)

'create a modified object with given gilename'
fileName = WebUI.modifyObjectProperty(findTestObject('Page_gists/strong_hello world.c'), 'text', 'equals', gistFilename, true)

'click the created object'
WebUI.click(fileName)

'verify delete button is present'
WebUI.waitForElementPresent(findTestObject('Page_hello world.c/button_Delete'), 5)

'click on delete button'
WebUI.click(findTestObject('Page_hello world.c/button_Delete'))

'accept delete'
WebUI.acceptAlert()

