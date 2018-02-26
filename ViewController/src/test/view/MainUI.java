package test.view;

import java.util.ArrayList;
import java.util.List;

import test.model.Empleado;
import test.model.Empleados;

public class MainUI {

    private static final String saludo = "Bienvenido a este programa, acá inicializamos una lista.";

    private static List<Empleado> listaemp;
    private String listasize;

    public MainUI() {
        super();

        listaemp = new ArrayList<>();
        listasize = "";

    }

    public String getSaludo() {
        return saludo;
    }

    public static void setListaemp(List<Empleado> listaemp) {
        MainUI.listaemp = listaemp;
    }

    public static List<Empleado> getListaemp() {
        return listaemp;
    }

    public String getlistaSize() {

        this.listasize = "" + listaemp.size();

        return this.listasize;

    }


    public String testoHere() {
        // Add event code here...
        
        // Empleados.crearListaInicialEmpleados(listaemp);
        
        return null;
    }
}
