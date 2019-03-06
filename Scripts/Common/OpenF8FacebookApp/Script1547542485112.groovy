import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil

import internal.GlobalVariable as GlobalVariable




def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

'start app from folder which defined in global variable - the common keyword will start appium server as default port then need to close application after test completed '
Mobile.startApplication(appPath, false)

