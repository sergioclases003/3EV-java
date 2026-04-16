package src.semana2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};

        // Mostrar todos los números
        System.out.println("Números en la lista:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Mostrar cuántos números hay en total
        System.out.println("Cantidad total de números: " + numeros.length);

        // Calcular la suma total
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("Suma total: " + suma);

        // Calcular el número mayor
        int max = numeros[0];
        for (int numero : numeros) {
            if (numero > max) {
                max = numero;
            }
        }
        System.out.println("Número mayor: " + max);
    }
}