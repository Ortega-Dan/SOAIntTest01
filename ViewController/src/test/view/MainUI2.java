package test.view;

import java.util.List;

import test.lib.JSFUtil;

import test.model.BasicParamContainer;
import test.model.Empleado;

public class MainUI2 {
    
    private List<Empleado> listaemp2;
    private BasicParamContainer paramCont2;
    
    public MainUI2() {
        super();
        
        this.listaemp2 = (List<Empleado>) JSFUtil.resolveExpression("#{pageFlowScope.Main.listaemp}");
        this.paramCont2 = new BasicParamContainer();
        this.paramCont2.setMostrarcontroles(false);
        
    }


    public void setListaemp2(List<Empleado> listaemp2) {
        this.listaemp2 = listaemp2;
    }

    public List<Empleado> getListaemp2() {
        return listaemp2;
    }

    public void setParamCont2(BasicParamContainer paramCont2) {
        this.paramCont2 = paramCont2;
    }

    public BasicParamContainer getParamCont2() {
        return paramCont2;
    }


}
