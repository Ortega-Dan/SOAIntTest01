package test.view;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.event.DialogEvent.*;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import oracle.adf.view.rich.event.DialogEvent;

import test.lib.JSFUtil;
import test.lib.ADFUtil;

import test.model.BasicParamContainer;
import test.model.Empleado;

import test.service.FacadeEmpleados;


public class View1UI {


    private List<Empleado> listaemple;

    private String empleadoID;

    private BasicParamContainer primitparams;
    private boolean usarSOAP;


    public View1UI() {
        super();
        this.empleadoID = "00000";
        this.listaemple = (List<Empleado>) JSFUtil.resolveExpression("#{pageFlowScope.ListaEmpleados}");
        this.primitparams = (BasicParamContainer) JSFUtil.resolveExpression("#{pageFlowScope.ObjPrimitParam}");
    }

    public void setListaemple(List<Empleado> listaemple) {
        this.listaemple = listaemple;
    }

    public List<Empleado> getListaemple() {
        return listaemple;
    }

    public void setEmpleadoID(String empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getEmpleadoID() {
        return empleadoID;
    }

    public String getWhatUp() {

        return "Este es el fragmento:  ";
    }


    public void setUsarSOAP(boolean usarSOAP) {
        this.usarSOAP = usarSOAP;
    }

    public boolean isUsarSOAP() {
        return usarSOAP;
    }


    public String createEmployees() {

        this.listaemple.clear();

        String howwas = "Exitoso";

        if (this.usarSOAP) {

            howwas = FacadeEmpleados.fillEmpleados(this.listaemple, howwas);
        } else {

            Empleado empleado1 = new Empleado(431242, "Juan Perez", new Date(), 432);
            this.listaemple.add(empleado1);

            Empleado empleado2 = new Empleado(5454354, "Carlos Suarez", new Date(), 54);
            this.listaemple.add(empleado2);

            Empleado empleado3 = new Empleado(8767665, "Jhon Martin", new Date(), 654);
            this.listaemple.add(empleado3);

            Empleado empleado4 = new Empleado(65463445, "Patricia Teheran", new Date(), 564);
            this.listaemple.add(empleado4);

            Empleado empleado5 = new Empleado(2039824, "Mike Wazowski", new Date(), 8789);
            this.listaemple.add(empleado5);
        }

        if (!howwas.equals("Exitoso")) {
            JSFUtil.addErrorMessage("El error que recibimos es: \n" + howwas);
        } else {
            ADFUtil.dispararContextualEvent("onUpdateRefreshEventBinding", this.listaemple.size());
        }

        return null;

    }

    public String borrarTodosLosEmpleados() {

        this.listaemple.clear();

        ADFUtil.dispararContextualEvent("onUpdateRefreshEventBinding", this.listaemple.size());

        return null;
    }


    public String borrarDesdeButton(ActionEvent event) {
        // Add event code here...


        RichButton buttonClicked = (RichButton) event.getComponent();

        int id = (Integer) buttonClicked.getAttributes().get("test");

        this.borrarEmpleado(id);

        return null;
    }


    public String borrarConID() {

        try {
            this.borrarEmpleado(Integer.parseInt(this.empleadoID));
        } catch (Exception e) {
            //System.out.println("Error al intentar borrar un empleado sin id: " + e.getMessage());
        }

        return null;
    }

    public void borrarEmpleado(int id) {

        Iterator itera = this.listaemple.iterator();

        while (itera.hasNext()) {

            Empleado emplo = (Empleado) itera.next();
            if (emplo.getId() == id) {
                this.listaemple.remove(emplo);
                break;
            }

        }

        ADFUtil.dispararContextualEvent("onUpdateRefreshEventBinding", this.listaemple.size());

    }


    public void setPrimitparams(BasicParamContainer primitparams) {
        this.primitparams = primitparams;
    }

    public BasicParamContainer getPrimitparams() {
        return primitparams;
    }


    public boolean isShouldIshow() {
        return this.primitparams.isMostrarcontroles();
    }

    public void closedDialog(DialogEvent dialogEvent) {
        // Add event code here...

        Outcome out = dialogEvent.getOutcome();

        if (out == Outcome.yes) {
            JSFUtil.addFacesInformationMessage("Se hizo click en Sí!!!");
        } else {
            JSFUtil.addFacesInformationMessage("Se hizo click en Nó!!!");
        }

    }
}
