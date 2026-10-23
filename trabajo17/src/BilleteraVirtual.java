public class BilleteraVirtual {
    private String nombre;
    private String dni;
    private double saldo;
    private int numeroCuenta;

    private static double limitePrestamo = 100000.0;

    public BilleteraVirtual(String nombre, String dni, double saldoInicial, int numeroCuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
    }

    public boolean pedirPrestamo(double monto) {
        if (monto > 0 && monto <= limitePrestamo) {
            this.saldo += monto;
            System.out.println("Éxito: Préstamo aprobado por $" + monto + " para " + nombre);
            return true;
        }
        System.out.println("Error: El monto supera el límite de préstamo permitido ($" + limitePrestamo + ")");
        return false;
    }

    public void enviarDinero(BilleteraVirtual destino, double monto) {
        if (monto < 1000.0) {
            System.out.println("Error: El monto mínimo para transferir es de $1000.");
            return;
        }
        if (this.saldo >= monto) {
            this.saldo -= monto;
            destino.recibirTransferencia(monto);
            System.out.println("Transferencia exitosa de $" + monto + " enviada por " + this.nombre);
        } else {
            System.out.println("Error: Saldo insuficiente para realizar la transferencia.");
        }
    }

    public void recibirTransferencia(double monto) {
        double comision = monto * 0.05;
        double montoNeto = monto - comision;
        this.saldo += montoNeto;
        System.out.println(" -> [" + this.nombre + "] Recibió $" + monto + " (Comisión aplicada del 5%: $" + comision + "). Neto acreditado: $" + montoNeto);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public static double getLimitePrestamo() {
        return limitePrestamo;
    }

    public static void setLimitePrestamo(double nuevoLimite) {
        limitePrestamo = nuevoLimite;
        System.out.println("Actualización de entidad: El nuevo límite de préstamo global es $" + limitePrestamo);
    }
}