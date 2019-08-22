package ar.edu.unahur.obj2.ejercicio2;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String mail;
    private int sueldoBase;

    public int getDni(){
        return dni;
    }
    public void setDni(int nuevoDni){
        this.dni= nuevoDni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String nuevoApellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String nuevoMail) {
        this.mail = mail;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int nuevoSueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
