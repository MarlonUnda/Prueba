/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import es.blackleg.libdam.identities.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Marloon
 */
public class Gerentes extends Trabajadores {
 
    private final ArrayList<Empleado> empleadosACargo;

    // Constructor
    public Gerentes(String nombre, int idEmpleado, int edad, String email, String telefono) {
        super(nombre, "Gerente", idEmpleado, edad, email, telefono);
        empleadosACargo = new ArrayList<>();
    }

    // Métodos get y set para encapsulación
    public ArrayList<Empleado> getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void agregarEmpleadoACargo(Empleado empleado) {
        empleadosACargo.add(empleado);
    }

    // Método para mostrar información del gerente
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Empleados a Cargo: " + empleadosACargo);
    }

    void agregarEmpleadoACargo(Programadores programador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarEmpleadoACargo(IlustradoresGraficos ilustrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}