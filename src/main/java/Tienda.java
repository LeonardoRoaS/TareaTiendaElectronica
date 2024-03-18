import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<Producto>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void mostrarProductos() {
        System.out.println("==================================================================================================================");
        System.out.println("Catalogo: ");
        for (Producto producto : this.productos) {
            System.out.println(producto);
        }
        System.out.println("==================================================================================================================x ");
    }

    public void agregarProducto(String nombre, int precio, int stock, String descripcion, String categoria) {
        Producto productoAgregar = new Producto(nombre, precio, stock, descripcion, categoria);
        this.productos.add(productoAgregar);
    }

    public void buscarProducto(String nombre, String categoria) {
        //busca el producto
        for (Producto producto : this.productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre) || producto.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println("Producto encontrado: " + producto);
            }
        }
    }

    public void eliminarProducto(String nombre, String categoria) {
        //busca el producto por nombre y categoria
        for (Producto producto : this.productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre) && producto.getCategoria().equalsIgnoreCase(categoria)){
                //notifica que será eliminado
                System.out.println("Producto eliminado: " + producto);
                //elimina el producto
                this.productos.remove(producto);
            }
        }
    }

    public void modificarProducto(String nombre, int precio, int stock, String descripcion){
        for (Producto producto : this.productos){
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                //modificar precio, stock y descripcion


            }
        }


    }

}