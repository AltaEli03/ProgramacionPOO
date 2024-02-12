package edu.mx.uttt.sintaxisjava;

import javax.swing.JOptionPane;

public class Estudiante {
    // Variables de instancia
    public String nombre;
    public int edad;
    public double calificacionAcumulada;
    public int cantidadCalificaciones;

    // Constructores
    public Estudiante() {

    }

    public Estudiante(String nombre, int edad,  int cantidadCalificaciones) {
        this.nombre = nombre;
        this.setEdad(edad);
        this.setCantidadCalificaciones(cantidadCalificaciones);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getCalificacionAcumulada() {
        return calificacionAcumulada;
    }

    public int getCantidadCalificaciones() {
        return cantidadCalificaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 15 && edad <= 50) {
            this.edad = edad;
        } else {
            this.edad = 15;
        }
    }

    public void setCantidadCalificaciones(int cantidadCalificaciones) {
        if (cantidadCalificaciones > 0) {
            this.cantidadCalificaciones = cantidadCalificaciones;
        } else {
            this.cantidadCalificaciones = 1;
        }
    }

    public void agregarCalificacion() {
        for (int i = 1; i <= cantidadCalificaciones; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + i));
            if (calificacion > 0.0) {
                calificacionAcumulada += calificacion;
            } else {
                System.out.println("La calificacion no es valida");
            }
        }
    }

    public double calcularPromedio() {
        if (calificacionAcumulada != 0.0 || cantidadCalificaciones != 0.0) {
            return calificacionAcumulada / cantidadCalificaciones;
        } else {
            return 0.0;
        }

    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCalificacion acumulada: " + calificacionAcumulada
                + "\nCantidad de calificaciones: " + cantidadCalificaciones + "\nPromedio: " + calcularPromedio();
    }

}
