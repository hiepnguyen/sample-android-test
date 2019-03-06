import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
Mobile.comment('Story: Verify correct alarm message')

Mobile.comment('Given that user has started an application')

'Get full directory\'s path of android application'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.comment('And he navigates the application to Activity form')
//Mobile.startApplication('D:\\Workspace\\TuringSpace\\KatalonSampleProjects\\SampleMobiTest.prj\\androidapp\\F8_v5.0.0_apkpure.com.apk', 
//    true)
//WebUI.waitForElementVisible(findTestObject('f8TextView-DAY2'), 10)
//
//wait.until(ExpectedConditions.visibilityOfElementLocated
//	(findTestObject('f8TextView-DAY2')));

'Wait until app control has class atribute with value android.widget.TextView'
//Mobile.waitForElementAttributeValue(findTestObject('f8Textview-DAY1'), 'class', 'android.widget.TextView', 20)

Mobile.tap(findTestObject('Removed/F8LandingTab-Schedule'), GlobalVariable.G_MediumTimeOut)
Mobile.tap(findTestObject('f8TextView-DAY2'), GlobalVariable.G_MediumTimeOut)

Mobile.tap(findTestObject('f8Textview-DAY1'), GlobalVariable.G_MediumTimeOut)

Mobile.tap(findTestObject('Removed/F8LandingTab-Demos'), GlobalVariable.G_MediumTimeOut)

Mobile.tap(findTestObject('Removed/F8LandingTab-MyF8'), GlobalVariable.G_MediumTimeOut)

//Mobile.tap(findTestObject('Removed/F8LandingTab-Information'), GlobalVariable.G_MediumTimeOut)

Mobile.tap(findTestObject('Removed/F8LandingTab-Videos'), GlobalVariable.G_MediumTimeOut)

Mobile.closeApplication()

