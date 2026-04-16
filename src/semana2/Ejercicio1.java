package src.semana2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[3];
        int size = 0;

        System.out.println("Introduce 3 palabras:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = scanner.nextLine();
            if (!existePalabra(palabras, size, palabra)) {
                palabras[size] = palabra;
                size++;
            }
        }

        System.out.println("Palabras únicas:");
        for (int i = 0; i < size; i++) {
            System.out.println(palabras[i]);
        }

        scanner.close();
    }

    private static boolean existePalabra(String[] palabras, int size, String palabra) {
        for (int i = 0; i < size; i++) {
            if (palabras[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }
}