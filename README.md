# SOAIntTestBackWards

POP UP SHOW FROM METHOD: http://www.awasthiashish.com/2012/11/popup-component-in-oracle-adf.html

Progressive project


This link helped a lot with the Contextual Events
https://docs.oracle.com/cd/E26098_01/web.1112/e16182/contextual_events.htm#ADFFD22683

and all the instructions from here:

<INICIO>

listener en page definicion del Fragmento que genera el evento JAVAX.FACES.EVENT.aCTIONlISTENER

then from structure pull Event to the eventbinding



-- EventType = ActionEvent



Creas también una clase para procesar los eventos.... (Procesar evento) con un metodo que procesará el evento que recive un Objeto como carga o payload ... y luego generas un datacontrol de dicha clase...



dentro del metodo que generará el evento, generas un JSFUTIL QUE resolverá el la ruta del managebean destino, y como eso resuelve a un objeto lo casteas a la clase del mismo managebean...



luego ese objeto puede llamar un metodo en el managebean destino, al cual también puede pasar el payload.. ()



y en la pagina destino desde bindings agregas un methodAction  que usa el datacontrol creado, seleccionas el metodo y no tocas el value de los parametros ...



Luego en la pagina en la que tienes los 2 fragmentos en regiones distintas ... le das clickderecho al root de la estructura (pagInicialPageDef) para crear un nuevo mapeo y defines el producer y consumer ...  y en parametro vas a ADF binding Y SELECCIONAS EL PAYLOAD...



Luego en la pagina emisora, generas un  valuechangelistener sobre el componente a generar el evento y usas dentro de ese evento ADFuTIL"dispararContextualEvent" ("*stringdentrodecomillasquedicequeeventbindingdisparo*", ValueChangeEvent.getNewVlue)



y en el managebean destino:
 jsfutil.REFRESHCOMOPONEN(jsfutil.findComponentinroot("id del componente que quieres actualizar"))
ó
 generas una alerta ... JSFUTIL addFaces ErrorMessage..


<FIN>