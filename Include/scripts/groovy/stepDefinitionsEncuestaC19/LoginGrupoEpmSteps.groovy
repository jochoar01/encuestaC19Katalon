package stepDefinitionsEncuestaC19
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginGrupoEpmSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Que puedo acceder a la pagina encuesta C19 EPM como miembro del grupo EPM")
	def Que_puedo_acceder_a_la_pagina_encuesta_C19_EPM() {	
		java.util.Date fecha = new Date();
		String nombreArchivo =fecha.getCalendarDate()
		File carpeta = new File(".", nombreArchivo);
		carpeta.mkdir();
		WebUI.openBrowser("https://app-inf6004.azurewebsites.net/app-covid19/encuesta/auth")
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/LoginGrupoEpmRepository/BotonTipoEmpleado'))
		WebUI.takeScreenshot("1_PantallaInicial.jpg")
	}

	@When("Escribo (.*) y (.*) como miembro grupo EPM")
	def como_miembro_grupo_EPM(String usuario,String contraseña) {
		WebUI.sendKeys( findTestObject('Object Repository/LoginGrupoEpmRepository/inputNombreUsuarioGrupoEpm')      , usuario)
		WebUI.click(findTestObject('Object Repository/LoginGrupoEpmRepository/botonNextGrupoEPM'))
		WebUI.sendKeys(findTestObject('Object Repository/LoginGrupoEpmRepository/inputPasswordGrupoEpm'), contraseña)
		WebUI.takeScreenshot("2_Insertar_Usuario_Y_Contraseña.jpg")
	}

	@Then("Hago click en boton inicio de sesion")
	def Hago_click_en_boton_inicio_de_sesion() {
		WebUI.click(findTestObject('Object Repository/LoginGrupoEpmRepository/botonInicioSession'))
		WebUI.takeScreenshot("3_Iniciar_sesion")
	}
}