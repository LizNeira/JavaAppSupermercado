package javaappsupermercado;

import java.util.ArrayList;

public class Supermercado {

    private ArrayList<Producto> conjProductos;
    private ArrayList<Venta> conjVentas;
    private InterfaceES modo;
    Cajera c1;
    Cajera c2;
    Cajera c3;
    Administrador adm;

    public Supermercado(InterfaceES m) {

        this.modo = m;
        conjProductos = new ArrayList();
        conjVentas = new ArrayList();
   

        char r = modo.leerDatoChar("¿El archivo de productos esta creado? s/n");
        if (r == 's') {
            leer("productos.ser", conjProductos);
            modo.mostrarCadena(conjProductos.toString());
        } else {
            leerProductosDesdeTeclado();
        }

        char r2 = modo.leerDatoChar("¿El archivo de ventas esta creado? s/n");
        if (r2 == 'n') {
            grabar("ventas.ser", conjVentas);
        } else {
            leer("ventas.ser", conjVentas);
            modo.mostrarCadena(conjVentas.toString());
        }

        Administrador adm = new Administrador(
                modo.leerCadena("Inicializar Administrador\nIngrese nombre"),
                modo.leerDatoEntero("Ingrese codigo"),
                modo.leerDatoEntero("Ingrese clave de cuatro digitos")
        );

        Cajera c1 = new Cajera(
                modo.leerCadena("Inicializar Cajeras\nIngrese nombre"),
                modo.leerDatoEntero("Ingrese codigo"),
                modo.leerDatoEntero("Ingrese clave de cuatro digitos")
        );
        Cajera c2 = new Cajera(
                modo.leerCadena("Cajeras\nIngrese nombre"),
                modo.leerDatoEntero("Ingrese codigo"),
                modo.leerDatoEntero("Ingrese clave de cuatro digitos")
        );
        Cajera c3 = new Cajera(
                modo.leerCadena("Cajeras\nIngrese nombre"),
                modo.leerDatoEntero("Ingrese codigo"),
                modo.leerDatoEntero("Ingrese clave de cuatro digitos")
        );
        modo.mostrarCadena("Cajeras" + c1.toString() + c2.toString() + c3.toString());
    }

    public void leerProductosDesdeTeclado() {
        char op = 's';
        while (op == 's') {
            Producto p = new Producto(
                    modo.leerDatoEntero("Ingrese Codigo"),
                    modo.leerCadena("Ingrese descripcion"),
                    modo.leerDatoEntero("Ingrese stock")
            );
            conjProductos.add(p);
            op = modo.leerDatoChar("Desea ingresar mas productos? s/n");
        }
        grabar("productos.ser", conjProductos);
        modo.mostrarCadena(conjProductos.toString());
    }

    public void grabar(String arch, ArrayList lista) {
        CrearArchivoDeArrayList archivo = new CrearArchivoDeArrayList(arch);
        archivo.abrirArchivo();
        archivo.grabarArrayList(lista);
        archivo.cerrarArchivo();
    }

    public ArrayList leer(String arch, ArrayList lista) {
        LeerArchivoDeArrayList archivo = new LeerArchivoDeArrayList(arch);
        archivo.abrirArchivo();
        lista = (ArrayList) archivo.leerArrayList();
        archivo.cerrarArchivo();
        return lista;
    }

    public int menuCajeras() {

        String msj = "Selecionar opcion\n"
                + "1 - Ingreso de ventas de productos\n"
                + "2 - Consulta de ventas realizadas \n"
                + "3 - Salir";

        int op = modo.leerDatoEntero(msj);
        return op;
    }

    public int menuProductos() {

        String msj = "Selecionar opcion\n"
                + "1 - Harina\n"
                + "2 - Azucar\n"
                + "3 - Arroz\n"
                + "4 - Leche\n"
                + "5 - Yerba\n"
                + "6 - Terminar la Venta";
        int op = modo.leerDatoEntero(msj);
        return op;
    }

    public ArrayList venta(ArrayList a, int codProd, int cantidad, int cajera) {
        Venta v = new Venta(codProd, cantidad, cajera);
        a.add(v);
        return a;
    }

    public void menu() {
        String men = "Selecionar Usuario\n"
                + "1 - Cajera 1\n"
                + "2 - Cajera 2\n"
                + "3 - Cajera 3\n"
                + "4 - Administrador\n"
                + "5 - Salir";
        int op = modo.leerDatoEntero(men);
        while (op > 0 && op < 5) {
            switch (op) {
                case 1: //cajera 1
                    int cla1 = modo.leerDatoEntero("Ingrese su clave de cuatro digitos");
                    while (cla1!= c1.getClave()) {
                        cla1 = modo.leerDatoEntero("Clave incorrecta.\n Reintente!");
                    }
                    modo.mostrarCadena("Cajera: " + c1.toString());
                    int cod = c1.getNroDeCajera();
                    int caj1 = menuCajeras();
                    while (caj1 > 0 && caj1 < 3) {
                        int cant = 0;
                        int p = 0;
                        switch (caj1) {
                            case 1: //ingresar ventas
                                p = menuProductos();
                                while (p > 0 && p < 6) {
                                    switch (p) {
                                        case 1:
                                            cant = modo.leerDatoEntero("Ingrese Cantidad");
                                            while (cant > conjProductos.get(p).getCantStock()) {
                                                cant = modo.leerDatoEntero("Stock Insuficiente\n Ingrese Cantidad Menor");
                                            }

                                            venta(conjVentas, p, cant, cod);
                                            cant = conjProductos.get(p).getCantStock() - cant;
                                            conjProductos.get(p).setCantStock(cant);
                                            grabar("productos.ser", conjProductos);
                                            break;
                                        case 2:
                                            cant = modo.leerDatoEntero("Ingrese Cantidad");
                                            while (cant > conjProductos.get(p).getCantStock()) {
                                                cant = modo.leerDatoEntero("Stock Insuficiente\n Ingrese Cantidad Menor");
                                            }

                                            venta(conjVentas, p, cant, cod);
                                            cant = conjProductos.get(p).getCantStock() - cant;
                                            conjProductos.get(p).setCantStock(cant);
                                            grabar("productos.ser", conjProductos);
                                            break;
                                        case 3:
                                            cant = modo.leerDatoEntero("Ingrese Cantidad");
                                            while (cant > conjProductos.get(p).getCantStock()) {
                                                cant = modo.leerDatoEntero("Stock Insuficiente\n Ingrese Cantidad Menor");
                                            }

                                            venta(conjVentas, p, cant, cod);
                                            cant = conjProductos.get(p).getCantStock() - cant;
                                            conjProductos.get(p).setCantStock(cant);
                                            grabar("productos.ser", conjProductos);
                                            break;
                                        case 4:
                                            cant = modo.leerDatoEntero("Ingrese Cantidad");
                                            while (cant > conjProductos.get(p).getCantStock()) {
                                                cant = modo.leerDatoEntero("Stock Insuficiente\n Ingrese Cantidad Menor");
                                            }

                                            venta(conjVentas, p, cant, cod);
                                            cant = conjProductos.get(p).getCantStock() - cant;
                                            conjProductos.get(p).setCantStock(cant);
                                            grabar("productos.ser", conjProductos);
                                            break;
                                        case 5:
                                            cant = modo.leerDatoEntero("Ingrese Cantidad");
                                            while (cant > conjProductos.get(p).getCantStock()) {
                                                cant = modo.leerDatoEntero("Stock Insuficiente\n Ingrese Cantidad Menor");
                                            }

                                            venta(conjVentas, p, cant, cod);
                                            cant = conjProductos.get(p).getCantStock() - cant;
                                            conjProductos.get(p).setCantStock(cant);
                                            grabar("productos.ser", conjProductos);
                                            break;//
                                    }
                                    char seguir = modo.leerDatoChar("Desea Cargar otra venta? s/n");
                                    if (seguir == 's') {
                                        p = menuProductos();
                                    }
                                }
                                break;
                            case 2: //consulta de ventas realizadas 

                                break;
                        }
                        caj1 = menuCajeras();
                    }
                    break;

                case 2: //cajera 2
                    int cla2 = modo.leerDatoEntero("Ingrese su clave de cuatro digitos");
                    while (c2.getClave() != cla2) {
                        cla2 = modo.leerDatoEntero("Clave incorrecta.\n Reintente!");
                    }
                    modo.mostrarCadena("Cajera: " + c2.toString());

                    break;

                case 3: // cajera 3
                    int cla3 = modo.leerDatoEntero("Ingrese su clave de cuatro digitos");
                    while (c3.getClave() != cla3) {
                        cla3 = modo.leerDatoEntero("Clave incorrecta.\n Reintente!");
                    }
                    modo.mostrarCadena("Cajera: " + c3.toString());
                    break;

                case 4: //administrador
                    int claAdm = modo.leerDatoEntero("Ingrese su clave de cuatro digitos");
                    while (adm.getClave() != claAdm) {
                        claAdm = modo.leerDatoEntero("Clave incorrecta.\n Reintente!");
                    }
                    modo.mostrarCadena("Administrador: " + adm.toString());
                    break;

            }
            op = modo.leerDatoEntero(men);
        }

    }

    public ArrayList<Producto> getConjProductos() {
        return conjProductos;
    }

    public ArrayList<Venta> getConjVentas() {
        return conjVentas;
    }

    public void setConjProductos(ArrayList<Producto> conjProductos) {
        this.conjProductos = conjProductos;
    }

    public void setConjVentas(ArrayList<Venta> conjVentas) {
        this.conjVentas = conjVentas;
    }

    @Override
    public String toString() {
        return "Conj Productos:" + conjProductos + "\nConj Ventas=" + conjVentas + '\n';
    }

}
