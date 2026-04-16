package src.semana2;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] comidas = {
            "Pollo con patatas",
            "Lasaña vegetal",
            "Caldo",
            "Pollo con patatas",
            "Lasaña vegetal",
            "Caldo",
            "Caldo",
            "Pollo con patatas"
        };

        String[] comidasUnicas = new String[comidas.length];
        int[] contadorComidas = new int[comidas.length];
        int size = 0;

        for (String comida : comidas) {
            int index = indexOf(comidasUnicas, size, comida);
            if (index == -1) {
                comidasUnicas[size] = comida;
                contadorComidas[size] = 1;
                size++;
            } else {
                contadorComidas[index]++;
            }
        }

        System.out.println("Frecuencia de comidas:");
        for (int i = 0; i < size; i++) {
            System.out.println(comidasUnicas[i] + ": " + contadorComidas[i] + " días");
        }
    }

    private static int indexOf(String[] array, int size, String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}