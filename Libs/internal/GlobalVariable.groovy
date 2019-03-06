package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object G_MediumTimeOut
     
    /**
     * <p></p>
     */
    public static Object G_LongTimeOut
     
    /**
     * <p></p>
     */
    public static Object G_Screenshot
     
    /**
     * <p></p>
     */
    public static Object G_device_Height
     
    /**
     * <p></p>
     */
    public static Object G_device_Width
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['G_Timeout' : 10, 'G_NotificationMessage' : 'Your message has been sent. View message', 'G_AndroidApp' : 'androidapp/com.facebook.f8_2018-05-01.apk', 'G_ShortTimeOut' : 10, 'G_MediumTimeOut' : 20, 'G_LongTimeOut' : 40, 'G_Screenshot' : 'screenshot', 'G_device_Height' : '', 'G_device_Width' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        G_Timeout = selectedVariables["G_Timeout"]
        G_NotificationMessage = selectedVariables["G_NotificationMessage"]
        G_AndroidApp = selectedVariables["G_AndroidApp"]
        G_ShortTimeOut = selectedVariables["G_ShortTimeOut"]
        G_MediumTimeOut = selectedVariables["G_MediumTimeOut"]
        G_LongTimeOut = selectedVariables["G_LongTimeOut"]
        G_Screenshot = selectedVariables["G_Screenshot"]
        G_device_Height = selectedVariables["G_device_Height"]
        G_device_Width = selectedVariables["G_device_Width"]
        
    }
}
