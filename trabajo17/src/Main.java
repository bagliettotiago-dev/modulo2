public class Main {
    public static void main(String[] args) {
        BilleteraVirtual pablo = new BilleteraVirtual("Pablo Gómez", "38123456", 50000.0, 1001);
        BilleteraVirtual anna = new BilleteraVirtual("Anna Jose", "40987654", 20000.0, 1002);

        System.out.println("Estado: ");
        System.out.println("Saldo de " + pablo.getNombre() + ": $" + pablo.getSaldo());
        System.out.println("Límite actual de préstamos: $" + BilleteraVirtual.getLimitePrestamo());

        System.out.println("Prestamo: ");
        pablo.pedirPrestamo(80000.0);
        pablo.pedirPrestamo(40000.0);
        System.out.println("Nuevo saldo de Pablo: $" + pablo.getSaldo());

        System.out.println("Transferencia: ");
        pablo.enviarDinero(anna, 500.0);
        pablo.enviarDinero(anna, 15000.0);

        System.out.println("Saldo: ");
        System.out.println("Saldo final de Pablo: $" + pablo.getSaldo());
        System.out.println("Saldo final de Anna: $" + anna.getSaldo());
    }
}