import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

import internal.GlobalVariable as GlobalVariable

Mobile.comment('Given that user has innstalled an application')

'Get full directory\'s path of android application'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())
def screenshotPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_Screenshot, RunConfiguration.getProjectDir())


'start app from folder which defined in global variable - the common keyword will start appium server as default port then need to close application after test completed '
Mobile.startApplication(appPath, false)

'Navigate to My F8 Tab'
Mobile.tap(findTestObject('Removed/F8LandingTab-MyF8'), GlobalVariable.G_LongTimeOut)

'Wait for display message'
Mobile.tap(findTestObject('MyF8/txtLoginto'), GlobalVariable.G_LongTimeOut*2)

'Get displayed message on the dialog'
message = Mobile.getText(findTestObject('MyF8/txtLoginto'),	GlobalVariable.G_LongTimeOut)

'Verify if displayed message is correct'
println "MyF8 Notice"+message
Mobile.verifyEqual(message, 'Log in to customize your schedule.')
'Take screenshot of current device screen'
Mobile.takeScreenshot("${screenshotPath}\\MyF8.png")

'Navigate to Information Tab'
Mobile.tap(findTestObject('Removed/F8LandingTab-Information'), GlobalVariable.G_LongTimeOut)
'Wait for display message'
Mobile.tap(findTestObject('Info/txtWelcome'), GlobalVariable.G_LongTimeOut*2)
'Get displayed message on the dialog'
message = Mobile.getText(findTestObject('Info/txtWelcome'),	GlobalVariable.G_LongTimeOut)
'Verify if displayed message is correct'
println "Information Notice"+message
Mobile.verifyEqual(message, 'Welcome to the Facebook Developer Conference')
'Take screenshot of current device screen'
Mobile.takeScreenshot("${screenshotPath}\\Info.png")