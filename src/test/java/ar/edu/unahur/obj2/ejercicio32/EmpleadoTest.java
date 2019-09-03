package ar.edu.unahur.obj2.ejercicio32;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class EmpleadoTest {
    private Empresa claro;
    private Empresa movistar;
    private Empleado jorge;
    private Empleado raul;
    private List<Empresa> listaEmpresas = new ArrayList<>();

    public List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    @BeforeMethod
    public void setUp() {
        jorge = new Empleado("jorge","gonzales","10/10/1990","10/10/2010");
        raul = new Empleado("raul","gonzales","10/10/1990","10/10/2010");
        claro = new Empresa("Claro","1980", new ArrayList<>());
        movistar = new Empresa("Movistar","1980", new ArrayList<>());


    }

    @Test
    public void testAgregarEmpleado() {
        claro.listaEmpleados.add(jorge);
        assertTrue(claro.listaEmpleados.contains(jorge));
    }

    @Test
    public void testListadoEmpresas(){
        listaEmpresas.add(claro);
        listaEmpresas.add(movistar);
        List<Empresa> listaEmpresas = new ArrayList<>();
        listaEmpresas.add(claro);
        listaEmpresas.add(movistar);


        assertEquals(getListaEmpresas(),listaEmpresas);


    }

     @Test
    public void testListadoEmpresaYEmpleados(){
         listaEmpresas.add(claro);
         listaEmpresas.add(movistar);
         claro.listaEmpleados.add(jorge);
         movistar.listaEmpleados.add(raul);
         List<Empleado> empleados = new ArrayList<>();
         empleados.add(jorge);

         assertEquals(claro.getListaEmpleados(),empleados);

     }

}