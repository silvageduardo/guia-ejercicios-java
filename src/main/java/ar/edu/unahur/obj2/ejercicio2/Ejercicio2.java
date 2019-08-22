package ar.edu.unahur.obj2.ejercicio2;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        cargarEmpleados();
    }

    public static void cargarEmpleados() {
        List<Empleado> empleados;
        String respuesta = "si";
        String mail;
        int max = 20;
        int cont = 0;
        Scanner dato = new Scanner(System.in);

        System.out.println(" ingrese nombre");
        String nombreEmpleado = dato.nextLine();
        System.out.println(" ingrese apellido");
        String apellidoEmpleado = dato.nextLine();
        System.out.println(" tipo de empleado");
        String tipoEmpleado = dato.nextLine();
        while (cont <= 20 && respuesta.equals("si")) {
            if (tipoEmpleado.equals("Administrativo")) {
                Administrativo admin = new Administrativo();
                admin.setNombre(nombreEmpleado);
                admin.setApellido(apellidoEmpleado);
                System.out.println(" ingrese dni");
                admin.setDni(dato.nextInt());
                System.out.println(" ingrese mail");
                admin.setMail(dato.nextLine());
                System.out.println("ingrese horas mes:");
                admin.setHsMes(dato.nextInt()) ;
                System.out.println("ingrese horas extras:");
                admin.setHsExtra(dato.nextInt());
                System.out.println("ingrese sueldo base:");
                admin.setSueldoBase(dato.nextInt()) ;
                empleados.add(admin);
                cont++;

            }

            System.out.println(" desea continuar ? ( 'si' para continuar,'no' para dejar de cargar empleados)");
            respuesta = dato.nextLine();

        }
    }
}



