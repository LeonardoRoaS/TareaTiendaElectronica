public class Producto {
    // Atributos
    private String nombre, descripcion, categoria;
    private int precio, stock;

    // Constructor
    public Producto(String nombre, int precio, int stock, String descripcion, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Return String
    @Override
    public String toString() {
        return this.nombre + ", precio: $" + this.precio + ", stock: " + this.stock + ", Descripción: " + this.descripcion + ", Categoría: " + this.categoria;
    }
}