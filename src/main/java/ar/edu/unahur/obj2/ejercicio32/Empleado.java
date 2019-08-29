package ar.edu.unahur.obj2.ejercicio32;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String fechaContrato;

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", fechaContrato='" + fechaContrato + '\'' +
                '}';
    }

    public Empleado(String nombre, String apellido, String fechaNacimiento, String fechaContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) &&
                Objects.equals(apellido, empleado.apellido) &&
                Objects.equals(fechaNacimiento, empleado.fechaNacimiento) &&
                Objects.equals(fechaContrato, empleado.fechaContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, fechaNacimiento, fechaContrato);
    }


}
