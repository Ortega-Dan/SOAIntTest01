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

    public MainUI() {
        super();
        
        listaemp = new ArrayList<>();
        listaemp.add(new Empleado(431242, "Juan Perez", new Date(), 1000000));
        listasize = "";

    }

    public String getSaludo() {
        return saludo;
    }

    public void setListaemp(List<Empleado> listaemp) {
        this.listaemp = listaemp;
    }

    public List<Empleado> getListaemp() {
        return this.listaemp;
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
