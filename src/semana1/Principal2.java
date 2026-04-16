package src.semana1;

public class Principal2 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");
        Usuario usuario3 = new Usuario("Charlie");

        System.out.println("Total de usuarios creados: " + Usuario.getTotalUsuarios());
    }
}