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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

import internal.GlobalVariable as GlobalVariable
def screenshotPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_Screenshot, RunConfiguration.getProjectDir())

'Navigate to Demo Tab'
Mobile.tap(findTestObject('Removed/F8LandingTab-Demos'), GlobalVariable.G_LongTimeOut)

'Wait for display message'
Mobile.tap(findTestObject('Demos/txtComingSoon'), GlobalVariable.G_LongTimeOut*2)

'Get displayed message on the dialog'
def message = Mobile.getText(findTestObject('Demos/txtComingSoon'),	GlobalVariable.G_LongTimeOut)

'Verify if displayed message is correct'
println "Demo Notice"+message
Mobile.verifyEqual(message, 'Coming soon.')

'Take screenshot of current device screen'
Mobile.takeScreenshot("${screenshotPath}\\Demos.png")

'Navigate to Videos Tab'
Mobile.tap(findTestObject('Removed/F8LandingTab-Videos'), GlobalVariable.G_LongTimeOut)

'Wait for display message'
Mobile.tap(findTestObject('Videos/txtComingSoon'), GlobalVariable.G_LongTimeOut*2)

'Get displayed message on the dialog'
message = Mobile.getText(findTestObject('Videos/txtComingSoon'), GlobalVariable.G_LongTimeOut)

'Verify if displayed message is correct'
println "Videos Notice"+message
Mobile.verifyEqual(message, 'Coming soon.')

'Take screenshot of current device screen'
Mobile.takeScreenshot("${screenshotPath}\\Videos.png")

Mobile.closeApplication()