package edu.mx.uttt.sintaxisjava;

import javax.swing.JOptionPane;

public class TestEstudiante {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        System.out.println(e1.mostrarInformacion());

        Estudiante e2 = new Estudiante("Pamfilo",23,5);
        System.out.println(e2.mostrarInformacion());

        e1.setNombre("Diego");
        e1.setEdad(18);
        e1.setCantidadCalificaciones(5);

        e1.agregarCalificacion();
        JOptionPane.showMessageDialog(null, e1.mostrarInformacion());
    }
}
