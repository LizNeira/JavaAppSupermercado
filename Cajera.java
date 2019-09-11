package javaappsupermercado;



public class Cajera{

    private String nombre;
    private int nroDeCajera;
    private int clave;

    public Cajera(String nombre, int nroDeCajera, int Clave) {
        this.nombre = nombre;
        this.nroDeCajera = nroDeCajera;
        this.clave = Clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroDeCajera() {
        return nroDeCajera;
    }

    public int getClave() {
        return clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroDeCajera(int nroDeCajera) {
        this.nroDeCajera = nroDeCajera;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Cajera() {
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNro De Cajera: " + nroDeCajera + '\n';
    }

   
  
}
