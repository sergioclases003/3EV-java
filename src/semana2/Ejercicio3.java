package src.semana2;

public class Ejercicio3 {
    public static void main(String[] args) {
        Item[] inventario = new Item[100];
        int inventarioSize = 0;

        // Añadir objetos al inventario
        inventarioSize = agregarObjeto(inventario, inventarioSize, "anillo", 2);
        inventarioSize = agregarObjeto(inventario, inventarioSize, "pulsera", 1);
        inventarioSize = agregarObjeto(inventario, inventarioSize, "piercing", 3);
        inventarioSize = agregarObjeto(inventario, inventarioSize, "anillo", 1);

        // Mostrar el inventario
        System.out.println("Inventario actual:");
        mostrarInventario(inventario, inventarioSize);

        // Eliminar la pulsera
        inventarioSize = eliminarObjeto(inventario, inventarioSize, "pulsera");
        System.out.println("\nDespués de eliminar la pulsera:");
        mostrarInventario(inventario, inventarioSize);

        // Comprobar si la pulsera existe
        System.out.println("\n¿Existe la pulsera? " + existeObjeto(inventario, inventarioSize, "pulsera"));
    }

    private static int agregarObjeto(Item[] inventario, int size, String nombre, int cantidad) {
        for (int i = 0; i < size; i++) {
            if (inventario[i].getNombre().equals(nombre)) {
                inventario[i].incrementarCantidad(cantidad);
                return size;
            }
        }
        inventario[size] = new Item(nombre, cantidad);
        return size + 1;
    }

    private static void mostrarInventario(Item[] inventario, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(inventario[i].getNombre() + ": " + inventario[i].getCantidad());
        }
    }

    private static int eliminarObjeto(Item[] inventario, int size, String nombre) {
        for (int i = 0; i < size; i++) {
            if (inventario[i].getNombre().equals(nombre)) {
                for (int j = i; j < size - 1; j++) {
                    inventario[j] = inventario[j + 1];
                }
                inventario[size - 1] = null;
                return size - 1;
            }
        }
        return size;
    }

    private static boolean existeObjeto(Item[] inventario, int size, String nombre) {
        for (int i = 0; i < size; i++) {
            if (inventario[i].getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}

class Item {
    private String nombre;
    private int cantidad;

    public Item(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void incrementarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
}