package ar.edu.unahur.obj2.ejercicio2;

import java.security.PublicKey;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String mail;
    private int sueldoBase;

    public Empleado( int dni,String nombre,String apellido,String mail,int sueldoBase){

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail =mail;
        this.sueldoBase = sueldoBase;
    }

    public int getDni(){
        return dni;
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getMail() {
        return mail;
    }


    public int getSueldoBase() {
        return sueldoBase;
    }

}
