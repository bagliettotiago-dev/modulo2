public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("L001", "Programacion en Java", "Juan Perez", 15, 1500.0, 3000.0, 'g');
        Libro libro2 = new Libro("L002", "Estructuras de Datos", "Ana Gomez", 5, 2000.0, 4000.0, 'c');

        System.out.println("Promoción: " );
        System.out.println("Stock que activa la promoción (consultado desde '" + libro1.getTitulo() + "'): " + Libro.getStockMinimoPromocion());

        Libro.setStockMinimoPromocion(20);
        System.out.println("Stock de promoción actualizado globalmente a: " + Libro.getStockMinimoPromocion());
    }
}