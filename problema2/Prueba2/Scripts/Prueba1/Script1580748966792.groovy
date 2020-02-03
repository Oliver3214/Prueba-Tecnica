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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.exception.StepErrorException as StepErrorException

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/prueba-Tecnica/problema1/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Escribe un textocon menos de 15 caracteres_nombre'), 
    'abcdefghijklmno')

WebUI.click(findTestObject('Object Repository/Page_Document/input'))

//Confirm the text is a Success message
		elementPresent=WebUI.waitForAlert(20)
		
	if (elementPresent==true) {
		
		alertText = WebUI.getAlertText()
		println(alertText.substring(alertText.lastIndexOf('.') + 1).length())
		try{
			assert alertText.substring(alertText.lastIndexOf('.') + 1).length() <= 14:"el dato se validara"
			println("el dato es valido")
		}catch(AssertionError e){
			println ("el dato es mayor a 15 caracteres" + StepErrorException)
			assert false
		}	
	}
	
WebUI.closeBrowser()


