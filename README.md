# SOAIntTestBackWards

POP UP SHOW FROM METHOD: http://www.awasthiashish.com/2012/11/popup-component-in-oracle-adf.html

Progressive project


This link helped a lot with the Contextual Events
https://docs.oracle.com/cd/E26098_01/web.1112/e16182/contextual_events.htm#ADFFD22683

and all the instructions from here:

<INICIO>

1) nuevo eventBinding desde los bindings en page definicion del Fragmento que genera el evento. El listener es de tipo "javax.faces.event.ActionListener" (ignore quotes) [change the name only from the source code, it only needs to be changed there, and if not done so, jdeveloper will hang]

2) then from structure right-click the EventBinding (whatever the name you gave it in the previous step [better if you name it "*Something*Binding"]) and add a "Events" *inserting inside* to the eventbinding..
..then add an Event inside the event binding.. give it the name you want, and add an attribute to it called "eventType" with value "Action Event" like this: eventType="Action Event"

(if you want more events: add a new "EventBinding" tag (with its respective "eventS" tag and the corresponding "evenT") for each event you want to have)

3) then from the structure right-click the root of the structure and add only one "EventS" tag!! and then as many "evenT" tags inside it... as many as you have as EventBindings in the previous step!!! and the "evenT" tags will be exactly as the ones inside the eventBindings ..



4) Creas también una clase para procesar los eventos.... (ProcesarEvento puede ser) con un metodo estatico (puede retornar void) que procesará el evento, este metodo recive un Objeto como carga o payload (preserva el nombre que le pones a ese objeto en la definición de parametros) ... y luego generas un datacontrol de dicha clase... (right-click the class-file and click on "Create Data Control")



5) dentro del metodo que generará el evento, generas un JSFUTIL QUE resolverá la ruta del managebean destino (la ruta en EXPRESSION LANGUAGE), y como eso resuelve a un objeto lo casteas a la clase del mismo managebean... 

luego ese objeto puede llamar un metodo en el managebean destino, al cual también puede pasar el payload.. ()



6) y en la pagina destino desde bindings agregas un methodAction  que usa el datacontrol creado, seleccionas el metodo y no tocas el value de los parametros ...



7) Luego en el pageDefinition de la pagina en la que tienes los 2 fragmentos en regiones distintas (o de la misma pag destino si es un evento de fragmento a vista contenedora) ... le das clickderecho al root de la estructura ("pagContenedora"PageDef) para crear un nuevo mapeo, y dentro de ese mismo mapeo agregas un event (con el mismo nombre de evenT que tiene el definido en el pageDef del generador del evento [no estoy seguro que esto sea fundamental]) haces click en el mapeo (el papá del event) y en la seccion/ventana de propiedades vas arriba al lapiz de editar, en donde defines el producer(ruta del eventBinding definido en taskflow origen) y consumer (metodo desde datacontrols de la clase del EventHandler) ...  y en parametro vas a ADF binding Y SELECCIONAS EL PAYLOAD... (data.payload)



8) Luego en la pagina emisora, generas un  valuechangelistener o actionListener sobre el componente a generar el evento y usas dentro de ese evento ADFuTIL"dispararContextualEvent" ("*stringdentrodecomillasquedicequeeventBindingdisparo*", ValueChangeEvent.getNewValue) ....
.... (en vez de ValueChangeEvent.getNewValue puedes poner algun otro objeto/valor que quieres pasar como Payload)



9) y en el metodo del managebean destino (que fue llamado por el metodoDelEventHandler) puedes usar:
 jsfutil.REFRESHCOMOPONEN(jsfutil.findComponentinroot("id del componente que quieres actualizar"))
ó
 Y aparte puedes generar una alerta (como JSFUTIL addFacesErrorMessage/infoMessage ...) haciendo uso del Objeto que recibes como Payload ... a fin de demostrar que el objeto si está pasando desde el origen


<FIN>
