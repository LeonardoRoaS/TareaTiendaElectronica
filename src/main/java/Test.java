public class Test {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Tienda tienda = new Tienda();
        tienda.agregarProducto("Notebook", 790990, 20, "Notebook con pantalla... lablabla", "Computadores");
        tienda.agregarProducto("Samsung Galaxy", 799000,30,"Smarthphone Samsung Galaxy A05", "Celulares");
        tienda.agregarProducto("Audifonos", 39990, 35, "Audifonos con entrada USB", "Auriculares");
        tienda.mostrarProductos();

        tienda.buscarProducto("NotebOOk", "CompUtaD");
        tienda.eliminarProducto("audifonos", "Auriculares");
        tienda.mostrarProductos();

    }
}
