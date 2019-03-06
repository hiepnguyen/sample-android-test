import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.comment('Given that user has started an application')

def screenshotPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_Screenshot, RunConfiguration.getProjectDir())

'Navigate to Demo Tab'
Mobile.tap(findTestObject('General/Mobile manipulator/Tap/Independence item/F8LandingTab-Demos'), GlobalVariable.G_LongTimeOut)
'Wait for display message'
Mobile.tap(findTestObject('Demos/lblDemos'), GlobalVariable.G_LongTimeOut*2)
'Get displayed message on the dialog'
def message = Mobile.getText(findTestObject('Demos/txtComingSoon'),	GlobalVariable.G_LongTimeOut)
'Verify if displayed message is correct'
println "Demo Notice"+message
Mobile.verifyEqual(message, 'Coming soon.',FailureHandling.CONTINUE_ON_FAILURE)
'Take screenshot of current device screen'
Mobile.takeScreenshot("${screenshotPath}\\Demos.png")