package src.semana1;

public class Principal3 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(10);

        System.out.println("Área del círculo 1: " + circulo1.areaCirculo());
        System.out.println("Área del círculo 2: " + circulo2.areaCirculo());
    }
}