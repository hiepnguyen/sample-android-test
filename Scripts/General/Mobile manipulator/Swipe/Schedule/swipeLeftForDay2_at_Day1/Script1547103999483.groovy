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

//android.widget.TextView
//[0]: No Day 2 matches
//[1]: SWIPE RIGHT FOR DAY 1
//
//android.widget.TextView
//[0]:No Day 1 matches
//[1]:SWIPE LEFT FOR DAY 2
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil
import internal.GlobalVariable as GlobalVariable

def screenshotPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_Screenshot, RunConfiguration.getProjectDir())
'start app from folder which defined in global variable - the common keyword will start appium server as default port then need to close application after test completed '

'Tab to navigate to DAY1 tab'
Mobile.tap(findTestObject('General/Swipe/Schedule/f8TextView-DAY1'), GlobalVariable.G_MediumTimeOut)

'Take screenshot of DAY1'
Mobile.takeScreenshot("${screenshotPath}\\ScreenOfDAY1.png")

'Swipe to DAY1 - prepare start position and end position'
int startY = GlobalVariable.G_device_Height / 2
int endY = startY
int startX = GlobalVariable.G_device_Width * 0.95
int endX = GlobalVariable.G_device_Width * 0.05

'SWIPE RIGHT FOR DAY1'
println "Swipe from left to right"+ startX + ","+ startY+","+ endX+","+ endY
Mobile.tapAtPosition(startX, startY)
Mobile.swipe(startX, startY, endX, endY)
Mobile.swipe(startX, startY, endX, endY)
Mobile.swipe(startX, startY, endX, endY)

'Take screenshot of DAY2 after swipe on the screen'
Mobile.takeScreenshot("${screenshotPath}\\ScreenOfD2_afterSwipeFromD1.png")

'Get displayed message on the dialog'
def message = Mobile.getText(findTestObject('General/Swipe/Schedule/txtSwipeFor_At_Day2'),	GlobalVariable.G_LongTimeOut)

'verify the DAY2 is navigated, text SWIPE RIGHT FOR DAY1'
Mobile.verifyEqual(message, 'SWIPE RIGHT FOR DAY 1',FailureHandling.CONTINUE_ON_FAILURE)

//'Take screenshot of DAY2'
//Mobile.takeScreenshot("${screenshotPath}\\ScreenOfDAY2_afterSwipe.png")

