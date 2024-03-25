public class Teclados extends Electronicos{
    private boolean mecanicos;
    private boolean numericos;


    public Teclados(int id, String nombre, int cantidad, int precio, String marca, boolean mecanicos, boolean numericos) {
        super(id, nombre, cantidad, precio, marca);
        this.mecanicos = mecanicos;
        this.numericos = numericos;
    }

    public boolean isMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(boolean mecanicos) {
        this.mecanicos = mecanicos;
    }

    public boolean isNumericos() {
        return numericos;
    }

    public void setNumericos(boolean numericos) {
        this.numericos = numericos;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\n Teclados" +
                "mecanicos = " + mecanicos +
                ", numericos = " + numericos +
                '}';
    }
}
