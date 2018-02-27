package test.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import test.model.BasicParamContainer;
import test.model.Empleado;
import test.model.Empleados;

public class MainUI {

    private static final String saludo = "Bienvenido a este programa, acá inicializamos una lista. Esta es la pagina.";

    private List<Empleado> listaemp;
    private String listasize;
    private boolean checkMark;
    private BasicParamContainer paramCont;

    public MainUI() {
        super();
        
        this.listaemp = new ArrayList<>();
        this.listasize = "";
        this.checkMark = true;
        this.paramCont = new BasicParamContainer();
        this.paramCont.setBooleano1(this.checkMark);
        

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
        this.paramCont.setBooleano1(checkMark);
        this.checkMark = checkMark;
    }

    public boolean getCheckMark() {
        return checkMark;
    }

    public void setListaemp(List<Empleado> listaemp) {
        this.listaemp = listaemp;
    }

    public List<Empleado> getListaemp() {
        return this.listaemp;
    }

    public String testoHere() {
        // Add event code here...
        // Empleados.crearListaInicialEmpleados(listaemp);
        
        return null;
    }
}
