//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
   Producto producto = new Pantalla(1,"pantallaAUKIN",4,20000,"samsumg",TamPantalla.media);
   Producto producto1= new Mouse(1,"mousePro",3,1100,"pcbox",true,false);
   Producto producto3= new Teclados(1,"tecladoSWRP",5,5000,"redDragon",false,true);
   Clientes cliente = new Clientes("32432321","Marcos","asdf@gmail.com");
   Clientes cliente1 = new Clientes("31234321","Anto","Anto234@gmail.com");
   Clientes cliente2 = new Clientes("45234654","Kike","rodokin@gmail.com");
   Ventas venta1 = new Ventas(cliente,"21/3");
   Ventas venta2 = new Ventas(cliente1,"21/3");
   Ventas venta3 = new Ventas(cliente2,"21/3");


        Tienda delta = new Tienda();

        delta.agregarProductos(producto);
        delta.agregarProductos(producto1);
        delta.agregarProductos(producto3);
        delta.agregarClientes(cliente);
        delta.agregarClientes(cliente1);
        delta.agregarClientes(cliente2);

        System.out.println(delta.buscarCliente("elpepe"));











    }





}