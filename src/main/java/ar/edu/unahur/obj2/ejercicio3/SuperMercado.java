package ar.edu.unahur.obj2.ejercicio3;

import ar.edu.unahur.obj2.ejercicio2.Administrativo;

import java.util.Scanner;

public class SuperMercado {
    private String nombre;
    private double precio;
    private int cantidad;

    public static void main(String[] args) {


    }

    public Ticket generarTicket(String nombre, double precio, int cantidad ){

        Scanner dato = new Scanner(System.in);
        System.out.println(" ingrese nombre");
         nombre = dato.nextLine();
        System.out.println(" ingrese precio");
         precio = dato.nextDouble();
        System.out.println(" tipo de empleado");
         cantidad = dato.nextInt();
        String respuesta = "si";
        while (respuesta.equals("si")) {
            Ticket nuevoticket = new Ticket(nombre,precio,cantidad);

             LineaTicket.agregarTicket(nuevoticket);
            }


    }



}
