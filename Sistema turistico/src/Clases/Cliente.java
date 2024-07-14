package Clases;

public class Cliente {
    private  String nombre;
    private  String apellido;
    private  int pasaporte;


    public Cliente(String nombre, String apellido, int pasaporte) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "\n"+"Cliente" +"\n"+
                "nombre='" + nombre  +"\n"+
                "apellido='" + apellido +"\n"+
                "pasaporte=" + pasaporte +"\n"
                ;
    }
}
