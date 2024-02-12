package edu.mx.uttt.sintaxisjava;

public class TestVuelo {
    public static void main(String[] args) {
        // Objeto
        Vuelo v1 = new Vuelo();
        Vuelo v2 = new Vuelo("12345", "CDMX", "Montevideo", 100, 0);
        System.out.println(v1.mostrarInformacion());
        System.out.println(v2.mostrarInformacion());

        v1.setOrigen("Monterrey");
        v1.setDestino("CDMX");
        v1.setCapacidad(100);
        v1.setCodigoVuelo("XCDFR12");

        v1.reservarAsiento();
        v1.reservarAsiento();
        v1.reservarAsiento();
        v1.reservarAsiento();
        v1.reservarAsiento();
        v1.reservarAsiento();
        v1.reservarAsiento();
        v1.reservarAsiento();
        v1.reservarAsiento();

        System.out.println(v1.getPasajerosReservados());

        v2.setCapacidad(10);
        v2.reservarAsiento();
        System.out.println(v2.getPasajerosReservados());
    }
}
