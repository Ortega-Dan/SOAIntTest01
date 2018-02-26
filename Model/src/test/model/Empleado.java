package test.model;

import java.util.Date;


public class Empleado {

    private int id;
    private String nombre;
    private Date fechaingreso;
    private int salario;


    public Empleado() {
        
    }


    public Empleado(int id, String nombre, Date fechaingreso, int salario) {
        
        this.id = id;
        this.nombre = nombre;
        this.fechaingreso =  fechaingreso;
        this.salario = salario;

    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }


}
