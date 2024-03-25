public class Sillas extends NoElectronico{
    private String material;

    public Sillas(int id, String nombre, int cantidad, int precio, String material) {
        super(id, nombre, cantidad, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Sillas " +
                "material = " + material + '\'' +
                '}';
    }
}
