package Ejercicio14_temporizador;

public class Temporizador {
    private int minutos;
    private int segundos;

    public Temporizador(int minutos, int segundos) {
        if (minutos < 0) {
            throw new IllegalArgumentException("Los minutos no pueden ser negativos.");
        }
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59.");
        }
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void avanzarSegundos(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de segundos no puede ser negativa.");
        }
        int totalSegundos = minutos * 60 + segundos + cantidad;
        minutos = totalSegundos / 60;
        segundos = totalSegundos % 60;
    }

    public String mostrarTiempo() {
        return String.format("%02d:%02d", minutos, segundos);
    }
}
