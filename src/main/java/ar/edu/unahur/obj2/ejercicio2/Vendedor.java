package ar.edu.unahur.obj2.ejercicio2;

public class Vendedor extends Empleado {
    private double porcentajeComision;
    private int totalVentas;

    public Vendedor (int dni,String nombre,String apellido,String mail,int sueldoBase){
        super( dni, nombre, apellido, mail, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;

    }


    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }
}
