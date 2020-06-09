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



class LoginContratistaSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Que puedo acceder a la pagina encuesta C19 EPM como miembro del Contratista")
	def Que_puedo_acceder_a_la_pagina_encuesta_C19_EPM_como_miembro_del_Contratista() {
		WebUI.openBrowser("https://app-inf6004.azurewebsites.net/app-covid19/encuesta/auth")
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/LogInContratistaRepository/BotonContratista'))
	}

	@When("Escribo (.*) y (.*) como Contratista")
	def como_miembro_Contratista(String usuario,String contraseña) {
		WebUI.sendKeys(findTestObject('Object Repository/LogInContratistaRepository/inputNombreUsuarioContratista'), usuario)
		WebUI.sendKeys(findTestObject('Object Repository/LogInContratistaRepository/inputPasswordContratista'), contraseña)
	}

	@Then("Hago click en boton inicio de sesion como Contratista")
	def Hago_click_en_boton_inicio_de_sesion_como_Contratista() {
		WebUI.click(findTestObject('Object Repository/LogInContratistaRepository/botonIniciarSesion'))
	}
}