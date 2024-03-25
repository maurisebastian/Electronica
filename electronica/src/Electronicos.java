public class Electronicos extends Producto {
    private String marca;

    public Electronicos(int id, String nombre, int cantidad, int precio, String marca) {
        super(id, nombre, cantidad, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return
               super.toString()+
                " \n Electronicos " +
                "marca = " + marca + ' ';
    }
}

