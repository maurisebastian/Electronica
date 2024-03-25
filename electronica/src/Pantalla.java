public class Pantalla extends Electronicos{
    private TamPantalla tamPantalla;

    public Pantalla(int id, String nombre, int cantidad, int precio, String marca, TamPantalla tamPantalla) {
        super(id, nombre, cantidad, precio, marca);
        this.tamPantalla = tamPantalla;
    }

    public TamPantalla getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(TamPantalla tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    @Override
    public String toString() {
        return super.toString()+
                " \n Pantalla " +
                "tamPantalla = " + tamPantalla +
                '}';
    }
}

