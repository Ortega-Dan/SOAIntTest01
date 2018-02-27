package test.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import test.model.Empleado;
import test.model.Empleados;

public class MainUI {

    private static final String saludo = "Bienvenido a este programa, acá inicializamos una lista. Esta es la pagina.";

    private List<Empleado> listaemp;
    private String listasize;
    private Boolean checkMark;

    public MainUI() {
        super();
        
        this.listaemp = new ArrayList<>();
        this.listasize = "";
        this.checkMark = Boolean.TRUE;
        

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

    public void setCheckMark(Boolean checkMark) {
        this.checkMark = checkMark;
    }

    public Boolean getCheckMark() {
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
