package test.view;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.nav.RichButton;

import test.lib.JSFUtil;

import test.model.BasicParamContainer;
import test.model.Empleado;

import test.service.FacetEmpleados;

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
        // Add event code here...
        
        this.listaemple.clear();
        
        FacetEmpleados.fillEmpleados(this.listaemple);

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

}
