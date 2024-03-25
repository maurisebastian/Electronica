import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> productoList;
    private List<Clientes> clientesList;
    private List<Ventas> ventasList;

    public Tienda() {
        this.productoList = new ArrayList<>();
        this.clientesList = new ArrayList<>();
        this.ventasList = new ArrayList<>();
    }
    public void agregarProductos(Producto producto){

        productoList.add(producto);
    }
    public void agregarVenta(Ventas venta){


        venta.agregarProducto();
        ventasList.add(venta);

    }
    public void agregarClientes(Clientes cliente){
        clientesList.add(cliente);
    }
    public Clientes buscarCliente(String nombre){

        Clientes clienteEncotrado = null;
        int i = 0;
        while (i < cantidadClientes()&& !this.clientesList.get(i).getNombre().equalsIgnoreCase(nombre)){

          i++;
        }

        if(i< cantidadClientes()){
            clienteEncotrado = this.clientesList.get(i);
        }

        return clienteEncotrado;

    }
    public int cantidadClientes(){
        return this.clientesList.size();
    }
    public int cantidadProductos(){
        return this.productoList.size();
    }

    public void mostrarProductos(){
        if(productoList.isEmpty()){
            System.out.println("no hay productos en el cliente");
        }else{
            for(Producto producto : productoList){
                System.out.println("__________________");
                System.out.println(producto.toString());

            }

        }

    }


    public void mostrarClientes(){
        if(clientesList.isEmpty()){
            System.out.println("no hay productos en el cliente");
        }else{
            for(Clientes cliente : clientesList){
                System.out.println("__________________");
                System.out.println(cliente.toString());

            }

        }

    }
    public void mostrarVentas(){
        if(ventasList.isEmpty()){
            System.out.println("no hay productos en el cliente");
        }else{
            for(Ventas venta: ventasList){
                System.out.println("__________________");
                System.out.println(venta.toString());

            }

        }

    }
}
