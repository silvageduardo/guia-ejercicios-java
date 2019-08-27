package ar.edu.unahur.obj2.ejercicio3;

public class Ticket {
    private String nombreProd;
    private double precioUnidad;
    private int cantidad;

    public Ticket(String nombreProd, double precioUnidad, int cantidad) {
        this.nombreProd = nombreProd;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;

    }

    public String getNombreProd() {
        return nombreProd;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

}
