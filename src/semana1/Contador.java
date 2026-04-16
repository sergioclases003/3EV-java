package src.semana1;

public class Contador {
    private static int contador = 0;

    public static void incrementar() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}