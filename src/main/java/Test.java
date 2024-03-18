public class Test {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();
        tienda.agregarProducto("Notebook", 790990, 20, "Notebook con pantalla...blablabla", "Computadores");
        tienda.agregarProducto("Samsung Galaxy", 799000,30,"Smarthphone Samsung Galaxy A05", "Celulares");
        tienda.agregarProducto("Audifonos", 39990, 35, "Audifonos con entrada USB", "Auriculares");
        tienda.agregarProducto("Mouse", 29990, 50, "Mouse Logitech G403", "Mouse y Teclado");
        tienda.mostrarProductos();

        tienda.buscarProducto("NotebOOk", "CompUtaD");

        tienda.realizarCompra("mOusE");
        tienda.realizarCompra("MOUSE");

        tienda.modificarProducto("Notebook", 10000, 100, "Notebook 24 pulgadas especializado en trabajo");

        tienda.eliminarProducto("Audifonos", "Auriculares");
        tienda.mostrarProductos();
    }
}
