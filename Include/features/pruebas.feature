@tag
Feature: Feature de Muestra

  @tag1
  Scenario Outline: Login Como Contratista
    Given Que puedo acceder a la pagina encuesta C19 EPM como miembro del Contratista Alternativo <idPrueba>
    When Escribo <Usuario> y <Contraseña> como Contratista Alternativo

    Examples: 
      | idPrueba     | Usuario                 | Contraseña     | Tratamiento_s_n | numero_cedula | celular    | mayor65 | diabetes | Hipertensin | renalCrnica | epocAsma | hipotiroidismo | consumoEsteroides | cancer | obesidad | desnutricin | otrasEnfermedadesInmunosupresoras | fuma | embarazo | ningunaAnterioreEstadoSalud | conviveCon | Casa/Sede | CantidadTurnos | Turno-DiurnoTardeA | SedeA | Turno-DiurnoTardeB | SedeB | temperatura | tos | dolorCabeza | dolorGarganta | MucosidadNasal | dificultadesRespiratorias | dificultadOler | ningunaSintomas | contactoAlguienSintomas | viajeInternacional | trabajadorSalud | ningunaviaje | tieneEstres | dolorEspalda | gastroIntestinal | dolorCabeza | transtornoSueno | relacionesFamiliares | cansancioTedio | angustiaPreocupacion | estresadoAnsioso | ningunaEstres |
      | pruebaFlujo1 | juan.ochoa@ceiba.com.co | Marzode2019+++ | s               |    1128269848 | 3042804396 | s       | s        | s           | s           | s        | s              | s                 | s      | s        | s           | s                                 | s    | s        | n                           | n          | Sede      |              2 | Diurno             | EPM   | Tarde              | EPM   | s           | s   | s           | s             | s              | s                         | s              | s               | s                       | s                  | s               | s            | s           | n            | n                | n           | n               | n                    | n              | n                    | s                | n             |
      | pruebaFlujo2 | juan.ochoa@ceiba.com.co | Marzode2019+++ | s               |    1128269848 | 3042804396 | s       | s        | s           | s           | s        | s              | s                 | s      | s        | s           | s                                 | s    | s        | n                           | n          | Sede      |              2 | Diurno             | EPM   | Tarde              | EPM   | s           | s   | s           | s             | s              | s                         | s              | s               | s                       | s                  | s               | s            | s           | n            | n                | n           | n               | n                    | n              | n                    | s                | n             |
