package javaappsupermercado;

import java.io.Serializable;

public class Venta implements Serializable {

    private int codigo;
    private int cantVendida;
    private int nroDeCajera;

    public Venta(int codigo, int cantVendida, int nroDeCajera) {
        this.codigo = codigo;
        this.cantVendida = cantVendida;
        this.nroDeCajera = nroDeCajera;
    }

    public Venta() {
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantVendida() {
        return cantVendida;
    }

    public int getNroDeCajera() {
        return nroDeCajera;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }

    public void setNroDeCajera(int nroDeCajera) {
        this.nroDeCajera = nroDeCajera;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nCant Vendida: " + cantVendida + "\nNro De Cajera: " + nroDeCajera + '\n';
    }
    

}
