@tag
Feature: Feature de Muestra

  @tag1
  Scenario Outline: Login Como Grupo EPM
    Given Que puedo acceder a la pagina encuesta C19 EPM como miembro del grupo EPM
    When Escribo <Usuario> y <Contraseña> como miembro grupo EPM
    Then Hago click en boton inicio de sesion

    Examples: 
      | Usuario                     | Contraseña      |
      | jcabezac@contratista.epm.co | mj**N98i3x+jUfm |
   
