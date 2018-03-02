package test.view;

import java.util.ArrayList;
import java.util.List;

import test.lib.JSFUtil;

import test.model.BasicParamContainer;
import test.model.Empleado;

public class MainUI {

    private static final String saludo = "Bienvenido a este programa, acá inicializamos una lista. Esta es la pagina.";

    private List<Empleado> listaemp;
    private String listasize;
    private BasicParamContainer paramCont;

    public MainUI() {
        super();
        
        this.listaemp = new ArrayList<>();
        this.listasize = "";
        this.paramCont = new BasicParamContainer();
        this.paramCont.setMostrarcontroles(true);
        

    }


    public void setParamCont(BasicParamContainer paramCont) {
        this.paramCont = paramCont;
    }

    public BasicParamContainer getParamCont() {
        return paramCont;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setListasize(String listasize) {
        this.listasize = listasize;
    }
    
    public String getlistaSize() {

        this.listasize = "" + listaemp.size();

        return this.listasize;

    }

    public void setCheckMark(boolean checkMark) {
        this.paramCont.setMostrarcontroles(checkMark);
        
    }

    public boolean getCheckMark() {
        return this.paramCont.isMostrarcontroles();
    }

    public void setListaemp(List<Empleado> listaemp) {
        this.listaemp = listaemp;
    }

    public List<Empleado> getListaemp() {
        return this.listaemp;
    }

    public String testoHere() {

        return null;
    }

    void recibirEvento(Object carga) {
        
        JSFUtil.refreshComponent(JSFUtil.findComponentInRoot("ot3"));
        
    }
}
