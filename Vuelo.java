package edu.mx.uttt.sintaxisjava;

public class Vuelo {
    // Variables de instancia
    private String codigoVuelo;
    private String origen;
    private String destino;
    private int capacidad;
    private int pasajerosReservados;

    // Constructores

    public Vuelo() {
        capacidad = 60;
    }

    public Vuelo(String codigoVuelo, String origen, String destino, int capacidad, int pasajerosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidad = capacidad;
        this.origen = origen;
        this.destino = destino;
        this.pasajerosReservados = pasajerosReservados;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPasajerosReservados() {
        return pasajerosReservados;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad <= 0 ? 60 : capacidad;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String mostrarInformacion() {
        return "Codigo de vuelo: " + codigoVuelo + "\nOrigen: " + origen + "\nDestino: " + destino +
                "\nCapacidad: " + capacidad + "\nPasajeros reservados: " + pasajerosReservados;
    }

    public void reservarAsiento() {
        if (pasajerosReservados < capacidad) {
            pasajerosReservados++;
            System.out.println("Se reservo el asiento");
        } else {
            System.out.println("No se reservo el asiento");
        }
    }

}
