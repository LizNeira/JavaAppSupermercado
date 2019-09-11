
package javaappsupermercado;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CrearArchivoDeArrayList {
    
private ObjectOutputStream archSalida;
    private String nomArch;

   
    public CrearArchivoDeArrayList(String nomArch) {
        this.nomArch = nomArch;
    }

    public void abrirArchivo() {
        try {
            archSalida = new ObjectOutputStream(new FileOutputStream(nomArch));
        } // fin de try
        catch (IOException e) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void grabarArrayList(ArrayList al) {
        try {

            archSalida.writeObject(al); // graba
        } catch (IOException e) {
            System.err.println("Error al escribir en elarchivo.");
        } catch (NoSuchElementException e) {
            System.err.println("Entrada inválida, otra vez");

        }

    }

    public void cerrarArchivo() {
        try {
            if (archSalida != null) {
                archSalida.close();
            }
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo.");
            //System.exit(1);
        }
    }
}
