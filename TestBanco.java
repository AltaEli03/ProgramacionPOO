package edu.mx.uttt.sintaxisjava;
import javax.swing.JOptionPane;

public class TestBanco {
    public static void main(String[] args) {
     //Primer objeto
     Banco bancoCli1 = new Banco();
     JOptionPane.showMessageDialog(null, bancoCli1.imprimirDatos());

     //Segundo objeto
     Banco bancoCli2 = new Banco("Cristiano" , "Ronaldo" , "Perez");
     JOptionPane.showMessageDialog(null, bancoCli2.imprimirDatos());

     //Cambiar los valores del Objeto bancoCli1
     bancoCli1.setNombre("Juan Gabriel");
     bancoCli1.setApellidoPaterno("Castillo");
     bancoCli1.setApellidoMaterno("Nieves");
     if (bancoCli1.depositar(100)) {
        JOptionPane.showMessageDialog(null,"El deposito fue exitoso");
     } else {
        JOptionPane.showMessageDialog(null,"El deposito no fue exitoso");
     }

     bancoCli1.setNumeroCuenta("123456");
     JOptionPane.showMessageDialog(null, bancoCli1.imprimirDatos());

    }
}
