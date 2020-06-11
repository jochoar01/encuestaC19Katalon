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
import org.openqa.selenium.Keys as Keys


class stepLoginAlternativo {
	String ruta;
	@Given("Que puedo acceder a la pagina encuesta C19 EPM como miembro del Contratista Alternativo (.*)")
	def Que_puedo_acceder_a_la_pagina_encuesta_C19_EPM_como_miembro_del_Contratista(String idPrueba) {
		this.ruta ="Evidencias/"+idPrueba
		File carpeta = new File(".",ruta );
		carpeta.mkdir();
		WebUI.openBrowser("https://oidcb2c.b2clogin.com/oidcb2c.onmicrosoft.com/b2c_1_basesigninup/oauth2/v2.0/authorize?response_type=id_token&scope=openid%20profile&client_id=de254408-006f-4331-87fc-cf8d4283bfd2&redirect_uri=https%3A%2F%2Fapp-inf6004.azurewebsites.net%2Fapp-covid19%2Fencuesta%2Fauth&state=eyJpZCI6ImM2NDQ0NTkwLWIyM2UtNGUzMS05YjYzLTVkMDkwNTQ1OGRhNiIsInRzIjoxNTkxNjMwNjUwLCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=6f6158e1-54a1-40d1-8b1d-524cef817417&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=1.3.1&client-request-id=d62fef6e-a731-4a44-b21c-61d2c9bc10f9&response_mode=fragment")
		WebUI.maximizeWindow()
		WebUI.takeScreenshot(ruta+"/pantallaLogin.png")
	}

	@When("Escribo (.*) y (.*) como Contratista Alternativo")
	def como_miembro_Contratista(String usuario,String contraseña) {
		WebUI.sendKeys(findTestObject('Object Repository/loginAlternativo/inputUsername'), usuario)
		WebUI.sendKeys(findTestObject('Object Repository/loginAlternativo/inputUsername (1)'), contraseña)
		WebUI.takeScreenshot(ruta+"/UsuarioContraseña.png")
	}

	@Then("Hago click en boton inicio de sesion como Contratista Alternativo")
	def Hago_click_en_boton_inicio_de_sesion_como_Contratista() {
		WebUI.click(findTestObject('Object Repository/loginAlternativo/botonIniciarsesion'))
		WebUI.takeScreenshot(ruta+"/Iniciasesion.png")
	}

	@Then("Presiono Boton de diligenciar cuestionario")
	def clickBotonEncuesta() {
		WebUI.takeScreenshot(ruta+"/ClickDiligenciarEncuesta.png")
		WebUI.click(findTestObject('Object Repository/primerFlujoUsuarioPrimeraVez/DiligenciarEncuesta'))
	}

	@And("Selecciono checkbox tratamiento de datos (.*) y doy click en siguiente")
	def tratamientoDatos(String s_n) {
		if(s_n=="s"){
			WebUI.click(findTestObject('Object Repository/primerFlujoUsuarioPrimeraVez/1tratamientoDatos'))
			WebUI.takeScreenshot(ruta+"/SeleccionarTratamientoDeDatos.png")
		}

		WebUI.click(findTestObject('Object Repository/primerFlujoUsuarioPrimeraVez/2button_Siguiente'))
	}


	@And("Diligencio datos personales (.*) (.*) y doy click en siguiente")
	def datosPersonales(String numero_cedula, String celular) {





		if(numero_cedula!=""){
			WebUI.clearText(findTestObject('Object Repository/primerFlujoUsuarioPrimeraVez/5input__identificacion'))
			WebUI.sendKeys(findTestObject('Object Repository/primerFlujoUsuarioPrimeraVez/5input__identificacion'), numero_cedula)
		}



		if(celular!=""){
			WebUI.clearText(findTestObject('Object Repository/primerFlujoUsuarioPrimeraVez/8input_Celular7'))
			WebUI.sendKeys(findTestObject('Object Repository/primerFlujoUsuarioPrimeraVez/8input_Celular7'), celular)
		}

		WebUI.takeScreenshot(ruta+"/DiligenciarDatosPersonales.png")
		WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/datosPersonalesSiguiente"))
	}

	@And("Diligencio encuesta estado de Salud (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)")
	def datosEncuestaEstadoSalud(String mayor65,
			String diabetes,
			String Hipertensin,
			String renalCrnica,
			String epocAsma,
			String hipotiroidismo,
			String consumoEsteroides,
			String cancer,
			String obesidad,
			String desnutricin,
			String otrasEnfermedadesInmunosupresoras,
			String fuma,
			String embarazo,
			String ningunaAnterioreEstadoSalud) {


		if(mayor65=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ser mayor de 65 aos"))
		}

		if(diabetes=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Diabetes"))
		}

		if(Hipertensin=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Hipertensin arterial"))
		}

		if(renalCrnica=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Enfermedad renal crnica"))
		}

		if(epocAsma=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/EPOC o Asma"))
		}

		if(hipotiroidismo=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Hipotiroidismo"))
		}

		if(consumoEsteroides=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Consumo de esteroides"))
		}

		WebUI.takeScreenshot(ruta+"/SeleccionaTodasLasOpciones1.png")

		if(cancer=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Cancer"))
		}



		if(obesidad=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Obesidad"))
		}

		if(desnutricin=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Desnutricin"))
		}

		if(otrasEnfermedadesInmunosupresoras=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Otras enfermedades inmunosupresoras"))
		}

		if(fuma=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Fuma"))
		}

		if(embarazo=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Embarazo"))
		}
		WebUI.takeScreenshot(ruta+"/SeleccionaTodasLasOpciones2.png")

		if(ningunaAnterioreEstadoSalud=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ninguna de las anteriores (Estado de Salud)"))
			WebUI.takeScreenshot(ruta+"/SeleccionaNinguna de las anteriores.png")
		}
	}




	@And("Estado de Salud de familiar (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) y doy click en siguiente")
	def datosEncuestaEstadoSaludFamiliar(String conviveCon,
			String mayor65,
			String diabetes,
			String Hipertensin,
			String renalCrnica,
			String epocAsma,
			String hipotiroidismo,
			String consumoEsteroides,
			String cancer,
			String obesidad,
			String desnutricin,
			String otrasEnfermedadesInmunosupresoras,
			String fuma,
			String embarazo,
			String ningunaAnterioreEstadoSalud) {

		if(conviveCon=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Convive con personas que tengan alguno de los anteriores factores de riesgo(SI)"))


			if(mayor65=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ser mayor de 65 aos (Familiar)"))
			}

			if(diabetes=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Diabetes (Familiar)"))
			}

			if(Hipertensin=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Hipertensin arterial(Familiar)"))
			}

			if(renalCrnica=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Enfermedad renal crnica(Familiar)"))
			}

			if(epocAsma=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/EPOC o Asma(Familiar)"))
			}

			if(hipotiroidismo=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Hipotiroidismo(Familiar)"))
			}

			if(consumoEsteroides=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Consumo de esteroides(Familiar)"))
			}

			WebUI.takeScreenshot(ruta+"/SeleccionaTodasLasOpcionesFamiliar1.png")

			if(cancer=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Cancer(Familiar)"))
			}



			if(obesidad=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Obesidad(Familiar)"))
			}

			if(desnutricin=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Desnutricin(Familiar)"))
			}

			if(otrasEnfermedadesInmunosupresoras=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Otras enfermedades inmunosupresoras(Familia)"))//////////////////////////////////////////////////
			}

			if(fuma=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Fuma(Familiar)"))
			}

			if(embarazo=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Embarazo(Familia)"))
			}
			WebUI.takeScreenshot(ruta+"/SeleccionaTodasLasOpciones2.png")

			if(ningunaAnterioreEstadoSalud=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ninguna de las anteriores (Estado de Salud)(Familiar)"))
				WebUI.takeScreenshot(ruta+"/SeleccionaNinguna de las anteriores(Familia).png")
			}
		}else{

			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Convive con personas que tengan alguno de los anteriores factores de riesgo(NO)"))
		}



		WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Siguiente_button_Siguiente"))
	}

	@And("Selecciono ubicacion laboral (.*) si estoy en Sede (.*) (.*) (.*) (.*) (.*) y click en siguiente")
	def datosEncuestaEstadoSaludFamiliar(String ubicacion, String cantidadTurnos, String turnoA, String sedeA, String turnoB, String sedeB ) {

		if(ubicacion=="Casa"){

			WebUI.click(findTestObject("Object Repository/sedes/Siguiente"))
			WebUI.takeScreenshot(ruta+"/Trabaja desde la casa.png")
		}else{


			WebUI.click(findTestObject("Object Repository/sedes/sede"))


			if (cantidadTurnos=="2") {
				WebUI.selectOptionByValue(findTestObject("Object Repository/sedes/SeleccionarNumeroDeTurnos"), cantidadTurnos, false)
				WebUI.selectOptionByValue(findTestObject("Object Repository/sedes/seleccionarTurno"), turnoA, false)
				WebUI.selectOptionByValue(findTestObject("Object Repository/sedes/seleccionarTurno2"), turnoB, false)
				WebUI.sendKeys(findTestObject("Object Repository/sedes/inputSedes"), sedeA)
				WebUI.sendKeys(findTestObject("Object Repository/sedes/inputSedes"), Keys.chord(Keys.ENTER))
				WebUI.sendKeys(findTestObject("Object Repository/sedes/inputSedes2"), sedeB)
				WebUI.sendKeys(findTestObject("Object Repository/sedes/inputSedes2"), Keys.chord(Keys.ENTER))
				WebUI.takeScreenshot(ruta+"/Horario Mixto.png")
				WebUI.click(findTestObject("Object Repository/nueva/button_SiguienteSede"))
			}else{
				WebUI.selectOptionByValue(findTestObject("Object Repository/sedes/seleccionarTurno"), turnoA, false)
				WebUI.sendKeys(findTestObject("Object Repository/sedes/inputSedes"), sedeA)
				WebUI.sendKeys(findTestObject("Object Repository/sedes/inputSedes"), Keys.chord(Keys.ENTER))
				WebUI.takeScreenshot(ruta+"/Un solo horario.png")
				WebUI.click(findTestObject("Object Repository/nueva/button_SiguienteSede"))
			}
		}
	}

	@And ("Diligencio datos estado de salud (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) y click en siguiente")
	def datosSintomas(String  temperatura,
			String tos,
			String dolorCabeza,
			String dolorGarganta,
			String MucosidadNasal,
			String dificultadesRespiratorias,
			String dificultadOler,
			String ningunaSintomas,
			String contactoAlguienSintomas,
			String viajeInternacional,
			String trabajadorSalud,
			String ningunaviaje ) {

		if(  temperatura=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Temperatura de 38 grados o ms (Fiebre)"))
		}

		if(  tos=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Tos o estornudos frecuentas"))
		}
		if(  dolorCabeza=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Dolor de cabeza"))
		}
		if(  dolorGarganta=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Dolor de garganta o al tragar"))
		}
		if(  MucosidadNasal=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Mucosidad nasal"))
		}
		if(  dificultadesRespiratorias=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Dificultades respiratorias"))
		}

		WebUI.takeScreenshot(ruta+"/Sintomas 1.png")
		if(  dificultadOler=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Dificultad para oler o degustar los alimentos"))
		}
		if(  ningunaSintomas=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ninguna de las anteriores (Estado de Salud)"))
		}
		if(  contactoAlguienSintomas=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ha estado en contacto con alguien que ha tenido los sntomas anteriores"))
		}
		if(  viajeInternacional=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Hizo un viaje internacional en los ltimos 30 das"))
		}
		if(  trabajadorSalud=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Es trabajador de la salud o convive con un trabajador de la salud"))
		}

		if(  ningunaviaje=="s"){
			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ninguna de las anteriores(En los ltimos das)"))
		}

		WebUI.takeScreenshot(ruta+"/Sintomas 2.png")

		WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/sintomasSiguiente"))
	}


	@And ("Diligencio salud mental (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) click en siguiente y consentimiento informado")
	def datosMental(String tieneEstres,
			String dolorEspalda,
			String gastroIntestinal,
			String dolorCabeza,
			String transtornoSueno,
			String relacionesFamiliares,
			String cansancioTedio,
			String angustiaPreocupacion,
			String estresadoAnsioso,
			String ningunaEstres ) {


		if(tieneEstres=="n"){

			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/siguiente Estres"))
		}else{

			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ha presentado algn nivel de estrsSi"))

			if(  dolorEspalda=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Dolores en el cuello espalda o tensin muscular"))
			}
			if(  gastroIntestinal=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Problemas gastrointestinales lceras ppticas acidez"))
			}
			if(  dolorCabeza=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Dolor de cabeza(Estres)"))
			}
			if(  transtornoSueno=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Transtorno del sueo como somnolencia durante el da o desvelo en la noche"))
			}
			if(  relacionesFamiliares=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Dificultades en las relaciones familiares"))
			}
			if(  cansancioTedio=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Cansancio tedio o desgano"))
			}
			if(  angustiaPreocupacion=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Sentimientos de angustia, preocupación o tristeza"))
			}
			if(  estresadoAnsioso=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Considera que ha estado estresado ansioso triste  preocupado"))
			}
			if(  ningunaEstres=="s"){
				WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Ninguna de las anteriores(Estres)"))
			}
			WebUI.takeScreenshot(ruta+"/Sintomas estres 1.png")

			WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/siguiente Estres"))
		}

		WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Doy consentimiento informado"))

		WebUI.takeScreenshot(ruta+"/Consentimiento informado.png")
		WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Enviar todo"))

		WebUI.takeScreenshot(ruta+"/Encuesta Exitosa.png")
	}

	@Then("Click en consentimiento informado")
	def clickConsentimientoInformado() {

		WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Doy consentimiento informado"))

		WebUI.takeScreenshot(ruta+"/Consentimiento informado.png")
		WebUI.click(findTestObject("Object Repository/primerFlujoUsuarioPrimeraVez/Enviar todo"))

		WebUI.takeScreenshot(ruta+"/Encuesta Exitosa.png")
	}
	
	
	
	
	@Then("click en el boton editar (.*)")
	public void click_en_el_boton_editar_pantallaAeditar() {
		// Write code here that turns the phrase above into concrete actions
	
	}
	
}




































