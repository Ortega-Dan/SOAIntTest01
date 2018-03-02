package test.view;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.nav.RichButton;

import test.lib.JSFUtil;
import test.lib.ADFUtil;

import test.model.BasicParamContainer;
import test.model.Empleado;

import test.service.FacadeEmpleados;

public class View1UI {


    private List<Empleado> listaemple;

    private String empleadoID;

    private BasicParamContainer primitparams;


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


    public String createEmployees() {
        
        this.listaemple.clear();
        
        // UNCOMMENT THIS...
        // FacadeEmpleados.fillEmpleados(this.listaemple);
        
        // AND COMMENT FROM HERE ....
        Empleado empleado1 = new Empleado(431242, "Juan Perez", new Date(), 1000000);
        this.listaemple.add(empleado1);

        Empleado empleado2 = new Empleado(5454354, "Carlos Suarez", new Date(), 2500000);
        this.listaemple.add(empleado2);

        Empleado empleado3 = new Empleado(8767665, "Jhon Martin", new Date(), 3500000);
        this.listaemple.add(empleado3);

        Empleado empleado4 = new Empleado(65463445, "Patricia Teheran", new Date(), 4000000);
        this.listaemple.add(empleado4);
        // ... TO HERE !
        
        return null;
        
    }

    public String borrarTodosLosEmpleados() {

        this.listaemple.clear();

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
        
        this.borrarEmpleado(Integer.parseInt(this.empleadoID));
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


    public void disparadorDeEvento(ActionEvent actionEvent) {
        // Add event code here...
        
        ADFUtil.dispararContextualEvent("onUpdateRefreshEventBinding", actionEvent);
        
    }
}
