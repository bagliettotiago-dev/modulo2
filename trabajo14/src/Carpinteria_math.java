import java.util.Random;

public class Carpinteria_math {

    public static long redondearMetrosMadera(double metros) {
        return Math.round(metros);
    }

    public static double calcularAreaMesaCircular(double diametro) {
        double radio = diametro / 2.0;
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularLadoMesaCuadrada(double areaTotal) {
        return Math.sqrt(areaTotal);
    }

    public static int generarNumeroJuegoDescuento() {
        Random random = new Random();
        return random.nextInt(10) + 1; // Genera entre 1 y 10
    }
}