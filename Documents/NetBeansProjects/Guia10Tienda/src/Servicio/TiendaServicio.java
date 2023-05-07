/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. 
 * Además, se necesita que la aplicación cuente con las funciones básicas. 
 * Estas las realizaremos en el servicio. 
 * Como:
 * introducir un elemento
 * modificar su precio
 * eliminar un producto 
 * mostrar los productos que tenemos con su precio.
 * 
 * (Utilizar Hashmap). 
 * 
 * El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 */
//TiendaServicio
package Servicio;

import Entidad.ProductoEntidad;
//import collectionejercicio6.ejercicio6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {
    private Map<String, ProductoEntidad> productos;
    private Scanner scanner; 

    public TiendaServicio(Map<String, ProductoEntidad> productos, Scanner scanner) {
        this.productos = productos;
        this.scanner = scanner;
    }
    
    
    public TiendaServicio() {
        this.productos = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void introducirProducto() {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.next();

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();

        ProductoEntidad producto = new ProductoEntidad(nombre, precio);
        productos.put(nombre, producto);

        System.out.println("El producto ha sido agregado exitosamente.");
    }

    public void modificarPrecioProducto() {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.next();

        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto:");
            double precio = scanner.nextDouble();

            ProductoEntidad producto = productos.get(nombre);
            producto.setPrecio(precio);

            System.out.println("El precio del producto ha sido modificado exitosamente.");
        } else {
            System.out.println("El producto ingresado no existe.");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.next();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("El producto ha sido eliminado exitosamente.");
        } else {
            System.out.println("El producto ingresado no existe.");
        }
    }

    public void listarProductos() {
        System.out.println("Lista de productos:");

        for (ProductoEntidad producto : productos.values()) {
            System.out.println(producto.nombre() + " - " + producto.precio());
        }
    }
}

