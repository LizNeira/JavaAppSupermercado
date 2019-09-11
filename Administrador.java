/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappsupermercado;


public class Administrador {
    
    private String nombre;
    private int codigo;
    private int clave;

    public Administrador() {
    }

    public Administrador(String nombre, int codigo, int clave) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCodigo:" + codigo + "\nClave: " + clave + '\n';
    }
 
    
}
