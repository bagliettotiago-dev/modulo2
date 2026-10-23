public class Libro {
    private final String codigo;
    private String titulo;
    private String autor;
    private int stock;
    private final double precioCosto;
    private double precioVenta;
    private char sector;

    private static int stockMinimoPromocion = 10;

    public Libro(String codigo, String titulo, String autor, int stock, double precioCosto, double precioVenta, char sector) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.sector = sector;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getStock() { return stock; }
    public double getPrecioCosto() { return precioCosto; }
    public char getSector() { return sector; }

    public double getPrecioVenta() {
        if (Character.toLowerCase(sector) == 'c') {
            return precioVenta * 0.90;
        }
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }
    public void setSector(char sector) { this.sector = sector; }

    public static int getStockMinimoPromocion() {
        return stockMinimoPromocion;
    }

    public static void setStockMinimoPromocion(int nuevoStockPromocion) {
        stockMinimoPromocion = nuevoStockPromocion;
    }

    public boolean hayDisponibilidad() { return this.stock > 0; }
    public void actualizarStockCompleto(int nuevoStock) { this.stock = nuevoStock; }
    public void modificarStock(int cantidad) { this.stock += cantidad; }
    public double calcularCostoTotal() { return this.stock * this.precioCosto; }
    public double calcularPrecioFinalVenta() {
        if (Character.toLowerCase(sector) == 'c') {
            return this.precioVenta * 0.90;
        }
        return this.precioVenta;
    }
}
