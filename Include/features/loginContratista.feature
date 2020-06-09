@tag
Feature: Feature de Muestra

  @tag1
  Scenario Outline: Login Como Contratista
    Given Que puedo acceder a la pagina encuesta C19 EPM como miembro del Contratista
    When Escribo <Usuario> y <Contraseña> como Contratista
    Then Hago click en boton inicio de sesion como Contratista

    Examples: 
      | Usuario                 | Contraseña     |
      | juan.ochoa@ceiba.com.co | Marzode2019+++ |
