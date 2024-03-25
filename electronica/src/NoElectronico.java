public class NoElectronico extends Producto{

    public NoElectronico(int id, String nombre, int cantidad, int precio) {
        super(id, nombre, cantidad, precio);
    }

    @Override
    public String toString() {
        return " \n NoElectronico";
    }
}

