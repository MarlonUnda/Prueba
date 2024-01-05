/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author Marloon
 */
public class Examen {
        public static void main(String[] args) {
        // Crear un programador
        Programadores programador = new Programadores("Marlon Programador", 111, 55, "unda_2@email.com", "0986102936");
        programador.agregarHabilidad("Java");
        programador.agregarHabilidad("Python");

        
        IlustradoresGraficos ilustrador = new IlustradoresGraficos("Jose Ilustrador", 222, 20, "jose123@email.com", "0923401918");
        ilustrador.agregarHabilidad("Diseño digital");
        ilustrador.agregarHabilidad("Ilustración tradicional");

        
        Gerentes gerente = new Gerentes("Manuel Gerente", 223, 35, "Manuel@email.com", "0992104617");
        gerente.agregarEmpleadoACargo(programador);
        gerente.agregarEmpleadoACargo(ilustrador);

        Editores editor = new Editores("Pedro Editor", 224, 68, "Pedro@email.com", "0974162016", true);

     
        System.out.println("Información del Programador:");
        programador.mostrarInformacion();

        System.out.println("\nInformación del Ilustrador Gráfico:");
        ilustrador.mostrarInformacion();

        System.out.println("\nInformación del Gerente:");
        gerente.mostrarInformacion();

        System.out.println("\nInformación del Editor:");
        editor.mostrarInformacion();
    }
}