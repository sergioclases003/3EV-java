package src.semana1;

public class Usuario {
    private String nombre;
    private static int totalUsuarios = 0;

    public Usuario(String nombre) {
        this.nombre = nombre;
        totalUsuarios++;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getTotalUsuarios() {
        return totalUsuarios;
    }
}