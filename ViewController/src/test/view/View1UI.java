package test.view;

import java.util.List;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import test.model.Empleado;
import test.model.Empleados;

public class View1UI {

    private String empleadoID;

    public View1UI() {
        super();
        this.empleadoID = "Ingrese ID";
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

    public List<Empleado> getMainListaenFrag() {

        return MainUI.getListaemp();

    }


    public String createEmployees() {
        // Add event code here...
        Empleados.crearListaInicialEmpleados(getMainListaenFrag());
        return null;
    }

    public String borrarTodosLosEmpleados() {

        getMainListaenFrag().clear();

        return null;
    }


    public String deleteEmployee() {
        // Add event code here...
        
        Empleados.borrarEmpleado(getMainListaenFrag(), Integer.parseInt(this.empleadoID));

        return null;
    }


}
