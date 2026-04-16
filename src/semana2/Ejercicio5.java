package src.semana2;

public class Ejercicio5 {
    public static void main(String[] args) {
        String[] asignaturas = {"Matemáticas", "Historia", "Física", "Química", "Inglés"};

        Estudiante john = new Estudiante("John");
        Estudiante wick = new Estudiante("Wick");

        for (String asignatura : asignaturas) {
            john.cursarAsignatura(asignatura, Math.random() > 0.5);
            wick.cursarAsignatura(asignatura, Math.random() > 0.5);
        }

        System.out.println("Estado de los estudiantes:");
        john.mostrarEstudiante();
        wick.mostrarEstudiante();

        // Elegir un estudiante y aprobar una asignatura suspendida
        System.out.println("\nAprobando una asignatura suspendida para John:");
        String asignaturaSuspendida = john.getSuspensas()[0];
        john.cursarAsignatura(asignaturaSuspendida, true);
        john.mostrarEstudiante();
    }
}

class Estudiante {
    private String nombre;
    private String[] aprobadas;
    private String[] pendientes;
    private int aprobadasSize;
    private int pendientesSize;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.aprobadas = new String[10];
        this.pendientes = new String[10];
        this.aprobadasSize = 0;
        this.pendientesSize = 0;
    }

    public void cursarAsignatura(String asignatura, boolean aprobada) {
        if (contains(aprobadas, aprobadasSize, asignatura)) {
            System.out.println("Ya ha cursado esa asignatura: " + asignatura);
        } else {
            if (aprobada) {
                aprobadas[aprobadasSize++] = asignatura;
                remove(pendientes, pendientesSize, asignatura);
                pendientesSize--;
            } else {
                if (!contains(pendientes, pendientesSize, asignatura)) {
                    pendientes[pendientesSize++] = asignatura;
                }
            }
        }
    }

    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + nombre);
        System.out.print("Aprobadas: ");
        printArray(aprobadas, aprobadasSize);
        System.out.print("Pendientes: ");
        printArray(pendientes, pendientesSize);
    }

    public String[] getSuspensas() {
        return pendientes;
    }

    private boolean contains(String[] array, int size, String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    private void remove(String[] array, int size, String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                return;
            }
        }
    }

    private void printArray(String[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}