# JavaAppSupermercado
Escribir una aplicación en Java para un supermercado. El sistema tiene un archivo con el stock de productos, un archivo con los movimientos de las ventas. Si el archivo de productos no fué creado, ingresar los prod por teclado y grabarlo en un archivo Los usuarios del sistemas son 3 cajeras y el administrador cada uno con su clave para ingresar. El menú inicial: 1 – cajera 1 2 – cajera 2 3 – cajera 3 4 – administrador 5 – salir El menú de las cajeras es: 1- realizar venta de productos 2- mostrar productos y su stock disponible 3- consulta de ventas realizadas x cajera (mostrar el ArrayList de venta de esa cajera) 4- volver al menú anterior La opción 1 de ingreso de ventas Elija el producto: 1- harina 2- azucar 3- arroz 4- leche 5- yerba 6- terminar la venta Por cada producto que se vende hay que ingresar la cantidad que se vende y hay que actualizar el stock Controlar que no se venda más cantidad de lo que hay en stock Menú del administrador: 1- consultar todo lo vendido 2- consultar ventas realizadas por una cajera 3- consultar el stock de todos los productos 4- salir El sistema consta de las siguientes clases:  clase Supermercado  clase Cajera  clase Venta (movimientos)  clase Producto   clase PruebaSupermercado (main)