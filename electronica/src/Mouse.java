public class Mouse extends Electronicos{
    private boolean gaming;
    private boolean rgb;

    public Mouse(int id, String nombre, int cantidad, int precio, String marca, boolean gaming, boolean rgb) {
        super(id, nombre, cantidad, precio, marca);
        this.gaming = gaming;
        this.rgb = rgb;
    }

    public boolean isGaming() {
        return gaming;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setGaming(boolean gaming) {
        this.gaming = gaming;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " \n Mouse " +
                "gaming = " + gaming +
                ", rgb = " + rgb +
                '}';
    }
}
