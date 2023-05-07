// ejercicio6.java

package collectionEjercicio6;

public class ejercicio6 {
    public static void main(String[] args) {
    }

private String nombre;
private double precio;

public ejercicio6(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;

    /*public void setNombre(String nombre) {*/
    this.nombre = nombre;
}


public void setPrecio(double precio) {
    this.precio = precio;
}

@Override
public String toString() {
    return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
}

}