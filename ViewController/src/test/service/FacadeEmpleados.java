package test.service;

import java.util.List;

import test.model.Empleado;

import com.soaint.informacioncliente.ClienteType;
import com.soaint.informacioncliente.InformacionClientePort;
import com.soaint.informacioncliente.ListaCLienteType;
import com.soaint.informacioncliente.ServicioInformacionCliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class FacadeEmpleados {

    public FacadeEmpleados() {
        super();
    }


    public static String fillEmpleados(List<Empleado> listaallenar, String result) {

        

        try {

            ServicioInformacionCliente servicio = new ServicioInformacionCliente();
            InformacionClientePort port = servicio.getInformacionCliente();

            ClienteType rq = new ClienteType();

            rq.setNumeroIdentificacion(44);

            ListaCLienteType rs = port.consultarClientes(rq);

            //// Now do it ..

            List<ClienteType> lista = new ArrayList<>();
            lista = rs.getListadoClientes();


            Iterator itera = lista.iterator();

            while (itera.hasNext()) {

                ClienteType usuenserv = (ClienteType) itera.next();

                Empleado emplo =
                    new Empleado(usuenserv.getNumeroIdentificacion(),
                                 usuenserv.getNombres() + " " + usuenserv.getApellidos(),
                                 usuenserv.getFechaRegistro().toGregorianCalendar().getTime(), usuenserv.getEdad());
                listaallenar.add(emplo);

            }

        } catch (Exception e) {

            result = e.getMessage();
            
        }


        return result;
    }


}
