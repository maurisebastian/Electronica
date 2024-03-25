public class Pads extends NoElectronico{
    private TamPantalla tamPads;

    public Pads(int id, String nombre, int cantidad, int precio, TamPantalla tamPads) {
        super(id, nombre, cantidad, precio);
        this.tamPads = tamPads;
    }

    public TamPantalla getTamPads() {
        return tamPads;
    }

    public void setTamPads(TamPantalla tamPads) {
        this.tamPads = tamPads;
    }

    @Override
    public String toString() {
        return   super.toString() +
                " Pads " +
                "tamPads = " + tamPads +
                '}';
    }
}
