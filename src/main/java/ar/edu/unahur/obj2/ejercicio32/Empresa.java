package ar.edu.unahur.obj2.ejercicio32;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {
    private String nombre;
    private String anyoFundacion;
    public List<Empleado> listaEmpleados = new ArrayList<>();

    public Empresa(String nombre, String anyoFundacion, List<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre) &&
                Objects.equals(anyoFundacion, empresa.anyoFundacion) &&
                Objects.equals(listaEmpleados, empresa.listaEmpleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anyoFundacion, listaEmpleados);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anyoFundacion='" + anyoFundacion + '\'' +
                ", listaEmpleados=" + listaEmpleados +
                '}';
    }
}
