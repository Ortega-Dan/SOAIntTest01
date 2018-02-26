package test.view;

import java.util.List;

import test.model.Empleado;

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
    

}
