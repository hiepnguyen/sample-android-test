import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling as FailureHandling

def screenshotPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_Screenshot, RunConfiguration.getProjectDir())
'start app from folder which defined in global variable - the common keyword will start appium server as default port then need to close application after test completed '

'Tab to DAY2'
Mobile.tap(findTestObject('General/Swipe/Schedule/f8TextView-DAY2'), GlobalVariable.G_MediumTimeOut)

'Take screenshot of DAY2 before swipe on the screen'
Mobile.takeScreenshot("${screenshotPath}\\ScreenOfDAY2.png")

'Swipe to DAY1 - prepare start possition and end position'
int startY = GlobalVariable.G_device_Height / 2
int endY = startY
int startX = GlobalVariable.G_device_Width * 0.05
int endX = GlobalVariable.G_device_Width * 0.95

'SWIPE RIGHT FOR DAY1'
println "Swipe from right to left"+ startX + ","+ startY+","+ endX+","+ endY
Mobile.tapAtPosition(startX, startY)

Mobile.swipe(startX, startY, endX, endY)
Mobile.swipe(startX, startY, endX, endY)
Mobile.swipe(startX, startY, endX, endY)

'Take screenshot of DAY1'
Mobile.takeScreenshot("${screenshotPath}\\ScreenOfD1_afterSwipeFromD2.png")

'Get displayed message on the dialog'
def message = Mobile.getText(findTestObject('General/Swipe/Schedule/txtSwipeFor_At_Day1'),	GlobalVariable.G_LongTimeOut)

'verify the DAY1 is navigated, text SWIPE LEFT FOR PAGE 2'
Mobile.verifyEqual(message, 'SWIPE LEFT FOR DAY 2',FailureHandling.CONTINUE_ON_FAILURE)