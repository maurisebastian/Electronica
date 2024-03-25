public class Clientes {
    private String dni;
    private String nombre;
    private  String mail;

    public Clientes(String dni, String nombre, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public String toString() {
        return "\n Cliente " +
                " dni = " + dni + '\'' +
                ", nombre = " + nombre + '\'' +
                ", mail = " + mail + '\'' +
                '}';
    }
}
