package test.model;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleados {


    public Empleados() {

    }



    public static void crearListaInicialEmpleados(List<Empleado> listaempleados) {
        

        Empleado empleado1 = new Empleado(431242, "Juan Perez", new Date(), 1000000);
        listaempleados.add(empleado1);

        Empleado empleado2 = new Empleado(5454354, "Carlos Suarez", new Date(), 2500000);
        listaempleados.add(empleado2);
        
        Empleado empleado3 = new Empleado(8767665, "Jhon Martin", new Date(), 3500000);
        listaempleados.add(empleado3);
        
        Empleado empleado4 = new Empleado(65463445, "Patricia Teheran", new Date(), 4000000);
        listaempleados.add(empleado4);
        
    }


}
