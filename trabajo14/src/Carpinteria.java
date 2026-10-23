public class Carpinteria {
    public static void main(String[] args) {
        System.out.println("Calculadora: ");

        double metrosPedido = 14.7;
        System.out.println("Metros necesarios exactos: " + metrosPedido + " | Redondeados: " + Carpinteria_math.redondearMetrosMadera(metrosPedido));

        double diametro = 1.2;
        System.out.println("Área de mesa circular (diámetro " + diametro + "m): " + Carpinteria_math.calcularAreaMesaCircular(diametro) + " m²");

        double areaCuadrada = 4.0;
        System.out.println("Medida del lado de mesa cuadrada (área " + areaCuadrada + "m²): " + Carpinteria_math.calcularLadoMesaCuadrada(areaCuadrada) + " metros");

        int numeroGanador = Carpinteria_math.generarNumeroJuegoDescuento();
        int intentoUsuario = 7;
        System.out.println("Acierto");
        System.out.println("Número secreto generado: " + numeroGanador);
        if (intentoUsuario == numeroGanador) {
            System.out.println("Acertaste. Obtienes un 15% de descuento en tu próxima compra.");
        } else {
            System.out.println("Lo siento, no acertaste esta vez.");
        }
    }
}
