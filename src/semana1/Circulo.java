package src.semana1;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double areaCirculo() {
        return Constantes.PI * radio * radio;
    }
}