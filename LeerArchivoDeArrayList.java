
package javaappsupermercado;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class LeerArchivoDeArrayList {

    private ObjectInputStream archEntrada;
    private String nomArch;

    public LeerArchivoDeArrayList(String nomArch) {
        this.nomArch = nomArch;
    }

    public void abrirArchivo() {
        try {
            archEntrada = new ObjectInputStream(
                    new FileInputStream(nomArch));
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public ArrayList leerArrayList() {
        ArrayList al = null;
        try {
            al = (ArrayList) archEntrada.readObject();
            return al;

        } catch (EOFException e) {
            System.err.println("Error EOF");

        } catch (ClassNotFoundException e) {
            System.err.println("No se pudo crear el objeto.");
        } catch (IOException e) {
            System.err.println("Error al leer del archivo.");
        }

        return null;

    }

    public void cerrarArchivo() {
        try {
            if (archEntrada != null) {
                archEntrada.close();
            }
            //System.exit(0);   Sale de la aplicacion
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo.");
            //System.exit(1);
        }
    }

}
