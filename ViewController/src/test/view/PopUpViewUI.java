package test.view;

import test.lib.JSFUtil;

import test.model.Empleado;

public class PopUpViewUI {
    
    Empleado popupemplo;
    
    
    public PopUpViewUI() {
        super();
        
        this.popupemplo = (Empleado) JSFUtil.resolveExpression("#{pageFlowScope.popUpEmpleado}");
        
    }


    public void setPopupemplo(Empleado popupemplo) {
        this.popupemplo = popupemplo;
    }

    public Empleado getPopupemplo() {
        return popupemplo;
    }

}
