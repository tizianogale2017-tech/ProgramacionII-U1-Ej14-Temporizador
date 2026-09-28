package Ejercicio14_temporizador;

public class Main {
    public static void main(String[] args) {
        Temporizador temporizador = new Temporizador(1, 45);
        System.out.println("Tiempo inicial: " + temporizador.mostrarTiempo());

        temporizador.avanzarSegundos(50);
        System.out.println("Tras avanzar 50 segundos: " + temporizador.mostrarTiempo());

        temporizador.avanzarSegundos(3600);
        System.out.println("Tras avanzar 3600 segundos más: " + temporizador.mostrarTiempo());
    }
}
