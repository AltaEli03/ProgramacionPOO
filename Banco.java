package edu.mx.uttt.sintaxisjava;

public class Banco {
    //Variables de instancia
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroCuenta;
    private double saldo;
    
    //Constructores
    
    public Banco(){

    }

    public Banco(String nomb, String apellido1,String apellido2) {
        nombre = nomb;
        apellidoPaterno = apellido1;
        apellidoMaterno = apellido2;
    
    }

    public void setNombre (String nombre1) {
        nombre = nombre1;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    
    }

    public boolean depositar(double cantidad){
        boolean resp = true;
        if (cantidad > 0.0){
            saldo+= cantidad;
        } else {
            resp = false;
        }
        return resp;
    }

    public boolean retirar(double cantidad) {
        boolean resp = true;
        if (cantidad <= saldo ) {
            saldo -= cantidad;
        } else {
            resp = false;
        }
        return resp;
    }

    public String imprimirDatos (){
        String datos = "Datos del cilente\n" + "Numero Cuenta: " + numeroCuenta + "\nNombre: " + nombre + 
        "\nApellido Paterno: " + apellidoPaterno + "\nApellido Materno: " + apellidoMaterno + "\nSaldo: " + saldo;

        return datos;
    } 
}
