package ar.edu.unahur.obj2.ejercicio2;

public class Administrativo extends Empleado{
    private int hsExtra;
    private int hsMes;

    public Administrativo( int dni,String nombre,String apellido,String mail,int sueldoBase){
        super(dni, nombre, apellido, mail, sueldoBase);
        this.hsExtra= hsExtra;
        this.hsMes = hsMes;
    }

    public int getHsExtra() {
        return hsExtra;
    }

    public void setHsExtra(int hsExtra) {
        this.hsExtra = hsExtra;
    }

    public int getHsMes() {
        return hsMes;
    }

    public void setHsMes(int hsMes) {
        this.hsMes = hsMes;
    }
}

