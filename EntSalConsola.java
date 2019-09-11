package javaappsupermercado;

import java.util.Scanner;

public class EntSalConsola implements InterfaceES {

    private Scanner a = new Scanner(System.in);

    public String leerCadena(String mensaje) {
        System.out.println(mensaje);
        return a.nextLine();
    }

    public void mostrarCadena(String mensaje) {
        System.out.println(mensaje);
    }

    public int leerDatoEntero(String mensaje) {
        System.out.println(mensaje);
        return a.nextInt();
    }

    public float leerDatoReal(String mensaje) {
        System.out.println(mensaje);
        return a.nextInt();
    }

    public long leerDatoLong(String mensaje) {
        System.out.println(mensaje);
        return a.nextInt();
    }

    public char leerDatoChar(String mensaje) {

        return leerCadena(mensaje).charAt(0);
    }

}
