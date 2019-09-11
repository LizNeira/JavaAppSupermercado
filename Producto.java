package javaappsupermercado;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Producto implements Serializable{

    private int codigo;
    private String descripcion;
    private int cantStock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, int cantStock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantStock = cantStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nDescripcion: " + descripcion + "\nCant Stock: " + cantStock + '\n';
    }

    
}
