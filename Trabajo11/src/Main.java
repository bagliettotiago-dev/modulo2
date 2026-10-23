public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("L001", "Programacion en Java", "Juan Perez", 10, 1500.0, 3000.0, 'g');
        Libro libro2 = new Libro("L002", "Estructuras de Datos", "Ana Gomez", 5, 2000.0, 4000.0, 'c');

        System.out.println("LIBRO 1: " + libro1.getTitulo() + );
        System.out.println("¿Hay disponibilidad? " + (libro1.hayDisponibilidad() ? "Sí" : "No"));
        System.out.println("Precio de venta: $" + libro1.getPrecioVenta());
        System.out.println("Costo total por el stock actual: $" + libro1.calcularCostoTotal());

        libro1.modificarStock(-2);
        System.out.println("Stock actualizado tras venta: " + libro1.getStock());

        System.out.println("LIBRO 2 (Sector 'c' con 10% de descuento): " + libro2.getTitulo() + );
        System.out.println("Precio de venta base con descuento aplicado: $" + libro2.getPrecioVenta());
        System.out.println("Costo total del stock: $" + libro2.calcularCostoTotal());

        libro2.actualizarStockCompleto(15);
        System.out.println("Stock completo actualizado: " + libro2.getStock());
        System.out.println("Nuevo costo total por el stock reposicionado: $" + libro2.calcularCostoTotal());
    }
}