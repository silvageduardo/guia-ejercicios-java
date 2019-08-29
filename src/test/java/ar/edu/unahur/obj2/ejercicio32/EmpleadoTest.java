package ar.edu.unahur.obj2.ejercicio32;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        assertEquals(getListaEmpresas(),"[Empresa{nombre='Claro', anyoFundacion='1980', listaEmpleados=[]}, " +
                                             "Empresa{nombre='Movistar', anyoFundacion='1980', listaEmpleados=[]}]");


    }

     @Test
    public void testListadoEmpresaYEmpleados(){
         listaEmpresas.add(claro);
         listaEmpresas.add(movistar);
         claro.listaEmpleados.add(jorge);
         movistar.listaEmpleados.add(raul);
         assertEquals(listaEmpresas.stream().map(e -> e.getNombre() + e.getListaEmpleados()).collect(Collectors.toList()),
                 "[Claro[Empleado{nombre='jorge', apellido='gonzales', fechaNacimiento='10/10/1990', fechaContrato='10/10/2010'}]," +
                         " Movistar[Empleado{nombre='raul', apellido='gonzales', fechaNacimiento='10/10/1990', fechaContrato='10/10/2010'}]]");


     }

}