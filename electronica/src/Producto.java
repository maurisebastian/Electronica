public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private int precio;

    public Producto(int id, String nombre, int cantidad, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCantidad(){
        this.cantidad++;
    }
    public boolean isCantidad(){
        if(this.cantidad > 0 ) {
            return true;
        }else{
            return false;
        }
    }
    public void descontarCantidad(){
        if( isCantidad() ) {
            this.cantidad--;
        }else{
            System.out.println(" \n no tiene stock");
        }
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " \n Producto " +
                "id = " + id +
                ", nombre = " + nombre +
                ", cantidad = " + cantidad +
                ", precio = " + precio
                ;
    }
}


