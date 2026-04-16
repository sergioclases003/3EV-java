package src.semana1;

public class Principal1 {
    public static void main(String[] args) {
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        System.out.println("Valor final del contador: " + Contador.getContador());
    }
}