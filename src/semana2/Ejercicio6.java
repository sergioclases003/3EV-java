package src.semana2;

public class Ejercicio6 {
    public static void main(String[] args) {
        EstudianteConNotas estudiante = new EstudianteConNotas("John");

        estudiante.cursarAsignatura("Matemáticas", 8);
        estudiante.cursarAsignatura("Historia", 4);
        estudiante.cursarAsignatura("Física", 6);
        estudiante.cursarAsignatura("Química", 3);
        estudiante.cursarAsignatura("Inglés", 9);

        estudiante.mostrarEstudiante();
    }
}

class EstudianteConNotas {
    private String nombre;
    private Nota[] notas;
    private int notasSize;

    public EstudianteConNotas(String nombre) {
        this.nombre = nombre;
        this.notas = new Nota[10];
        this.notasSize = 0;
    }

    public void cursarAsignatura(String asignatura, int nota) {
        for (int i = 0; i < notasSize; i++) {
            if (notas[i].getAsignatura().equals(asignatura)) {
                if (notas[i].getNota() >= 5) {
                    System.out.println("Ya ha aprobado la asignatura: " + asignatura);
                } else {
                    notas[i].setNota(nota);
                }
                return;
            }
        }
        notas[notasSize++] = new Nota(asignatura, nota);
    }

    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Notas:");
        for (int i = 0; i < notasSize; i++) {
            System.out.println(notas[i].getAsignatura() + ": " + notas[i].getNota());
        }
    }
}

class Nota {
    private String asignatura;
    private int nota;

    public Nota(String asignatura, int nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}