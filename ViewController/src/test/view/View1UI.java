package test.view;

import java.util.List;

import test.model.Empleado;
import test.model.Empleados;

public class View1UI {
    
    
    
    public View1UI() {
        super();
    }

    public String getWhatUp() {

        return "What up";
    }
    
    public List<Empleado> getMainListaenFrag() {
        
        return MainUI.getListaemp();
        
    }


    public String createEmployees() {
        // Add event code here...
        Empleados.crearListaInicialEmpleados(getMainListaenFrag());
        return null;
    }
    
    public String borrarTodosLosEmpleados(){
        
        getMainListaenFrag().clear();
        
        return null;
        }
    
}
