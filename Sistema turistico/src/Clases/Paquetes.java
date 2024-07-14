package Clases;

public class Paquetes {
    protected int dias;
    protected  int stock;
    protected  int id;
    protected  float precio;
    protected  String destino;


    public Paquetes(int dias, int stock, int id, String destino) {
        this.dias = dias;
        this.stock = stock;
        this.id = id;
        if (destino.equalsIgnoreCase("Playa")==true){
            this.precio = 600F;
        }else if (destino.equalsIgnoreCase("montaña")==true){
            this.precio=500F;
        }else{
            this.precio=0;
        }

        this.destino = destino;
    }


    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "\n"+"Paquete general{" +"\n"+
                "dias=" + dias +"\n"+
                "stock=" + stock +"\n"+
                "id=" + id +"\n"+
                "precio=" + precio +"\n"+
                "destino='" + destino + '\'' +
                "\n";
    }
}
