
package javaappsupermercado;


public class PruebaSupermercado {

    
    public static void main(String[] args) {
        
        InterfaceES modo = new EntSalVentana();

        char resp = modo.leerDatoChar("Ingrese modo de visualización:(v)ventana/(c)consola");
        if (resp == 'c') {
            modo = new EntSalConsola();
        }
        
        Supermercado superMercado = new Supermercado(modo);
        superMercado.menu();
    }
       
    
    
}
