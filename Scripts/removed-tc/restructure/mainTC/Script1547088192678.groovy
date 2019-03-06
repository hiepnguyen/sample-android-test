import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.comment('Given that user has started an application')

def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

def screenshotPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_Screenshot, RunConfiguration.getProjectDir())

'start app from folder which defined in global variable - the common keyword will start appium server as default port then need to close application after test completed '
Mobile.startApplication(appPath, false)

'Navigate to Schedule Tab'
Mobile.tap(findTestObject('Removed/F8LandingTab-Schedule'), GlobalVariable.G_MediumTimeOut)

WebUI.callTestCase(findTestCase('removed-tc/restructure/sub1'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('removed-tc/restructure/sub2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()