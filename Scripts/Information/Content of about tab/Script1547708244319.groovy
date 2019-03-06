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

'Navigate to Information Tab'
Mobile.tap(findTestObject('General/Mobile manipulator/Tap/Independence item/F8LandingTab-Information'), GlobalVariable.G_LongTimeOut)

'Wait for display message'
Mobile.tap(findTestObject('Information/lblInformation'), GlobalVariable.G_LongTimeOut * 2)

'Get displayed message on the dialog'
message = Mobile.getText(findTestObject('Information/txtWelcome'), GlobalVariable.G_LongTimeOut*3)

'Verify if displayed message is correct'
println('Information Notice' + message)

Mobile.verifyEqual(message, 'Welcome to the Facebook Developer Conference',FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot of current device screen'
Mobile.takeScreenshot("$screenshotPath\\Info.png")

