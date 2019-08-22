package ar.edu.unahur.obj2.ejercicio2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        cargarEmpleados();
    }

    public static void cargarEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        String respuesta = "si";
        String mail;
        int dni;
        int sueldoBase;
        int max = 20;
        int cont = 0;
        Scanner dato = new Scanner(System.in);

        System.out.println(" ingrese nombre");
        String nombreEmpleado = dato.nextLine();
        System.out.println(" ingrese apellido");
        String apellidoEmpleado = dato.nextLine();
        System.out.println(" tipo de empleado");
        String tipoEmpleado = dato.nextLine();
        while (cont <= max && respuesta.equals("si")) {
            if (tipoEmpleado.equals("Administrativo")) {
                System.out.println(" ingrese dni");
                dni =dato.nextInt();
                System.out.println(" ingrese mail");
                mail= dato.nextLine();
                System.out.println("ingrese sueldo base:");
                sueldoBase = dato.nextInt();
                Administrativo admin = new Administrativo(dni,nombreEmpleado,apellidoEmpleado,mail,sueldoBase);

                System.out.println("ingrese horas mes:");
                admin.setHsMes(dato.nextInt()) ;
                System.out.println("ingrese horas extras:");
                admin.setHsExtra(dato.nextInt());
                empleados.add(admin);
                cont++;
            }

            System.out.println(" desea continuar ? ( 'si' para continuar,'no' para dejar de cargar empleados)");
            respuesta = dato.nextLine();

        }
    }
}



