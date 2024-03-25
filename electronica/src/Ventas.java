import java.util.ArrayList;
import java.util.List;

public class Ventas {
    private static int nextid = 0;
    private int id;
    private Clientes cliente;

    private List<Producto> productos;

    private int monto;
    private  String fecha;

    public Ventas(Clientes cliente , String fecha) {
        this.id = nextid++;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.monto = 0 ;
        this.fecha = fecha;
    }

    public void agregarProducto(Producto producto){
        if(producto.isCantidad())
        {
            productos.add(producto);
            producto.descontarCantidad();

        }else{
            System.out.println("no tiene stock");
        }


    }
    public void montoTotal(){
        if(productos.isEmpty()){
            System.out.println("no hay productos en el cliente");
        }else {
            for (Producto producto:productos){
                this.monto += producto.getPrecio();

            }

        }


    }

    @Override
    public String toString() {
        return "Ventas{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", monto=" + monto +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
