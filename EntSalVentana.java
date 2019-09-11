package javaappsupermercado;

import javax.swing.JOptionPane;

public class EntSalVentana implements InterfaceES {

    public String leerCadena(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarCadena(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int leerDatoEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
   
    public float leerDatoReal(String mensaje){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    
    public long leerDatoLong(String mensaje){
        return Long.parseLong(JOptionPane.showInputDialog(mensaje));
    }
    
    public char leerDatoChar(String mensaje){
        return leerCadena(mensaje).charAt(0);
    }
}

    

