@tag
Feature: Feature de Muestra

  @tag1
  Scenario Outline: Login Como Contratista
    Given Que puedo acceder a la pagina encuesta C19 EPM como miembro del Contratista Alternativo <idPrueba>
    When Escribo <Usuario> y <Contraseña> como Contratista Alternativo
    Then Hago click en boton inicio de sesion como Contratista Alternativo
    And click en el boton editar <pantallaAeditar>

    Examples: 
      | idPrueba               | Usuario             | Contraseña     | Tratamiento_s_n | numero_cedula | celular    | mayor65 | diabetes | Hipertensin | renalCrnica | epocAsma | hipotiroidismo | consumoEsteroides | cancer | obesidad | desnutricin | otrasEnfermedadesInmunosupresoras | fuma | embarazo | ningunaAnterioreEstadoSalud | conviveCon | mayor65F | diabetesF | HipertensinF | renalCrnicaF | epocAsmaF | hipotiroidismoF | consumoEsteroidesF | cancerF | obesidadF | desnutricinF | otrasEnfermedadesInmunosupresorasF | fumaF | embarazoF | ningunaAnterioreEstadoSaludF | Casa/Sede | CantidadTurnos | Turno-DiurnoTardeA | SedeA | Turno-DiurnoTardeB | SedeB | temperatura | tos | dolorCabeza | dolorGarganta | MucosidadNasal | dificultadesRespiratorias | dificultadOler | ningunaSintomas | contactoAlguienSintomas | viajeInternacional | trabajadorSalud | ningunaviaje | tieneEstres | dolorEspalda | gastroIntestinal | dolorCabeza | transtornoSueno | relacionesFamiliares | cansancioTedio | angustiaPreocupacion | estresadoAnsioso | ningunaviaje |
      | PruebasEncuestaCovid19 | jochoar01@gmail.com | Marzode2019+++ | s               |    1128269848 | 3042804396 | s       | s        | s           | s           | s        | s              | s                 | s      | s        | s           | s                                 | s    | s        | n                           | s          | s        | s         | s            | s            | s         | s               | s                  | s       | s         | s            | s                                  | s     | s         | n                            | sede      |              2 | Tarde              | epm   | Diurno             | epm   | s           | s   | s           | s             | s              | s                         | s              | n               | s                       | s                  | s               | n            | s           | s            | s                | s           | s               | s                    | s              | s                    | s                | n            |
