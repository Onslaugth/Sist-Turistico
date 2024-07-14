package Clases;

import java.util.ArrayList;

public class Ventas {
    private String fecha;
    private  Cliente cliente;
    private  Paquetes packs;




    public Ventas(String fecha, Cliente cliente, Paquetes packs) {

        this.fecha = fecha;
        this.cliente = cliente;
        this.packs = packs;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquetes getPacks() {
        return packs;
    }

    public void setPacks(Paquetes packs) {
        this.packs = packs;


    }

    @Override
    public String toString() {
        return "\n"+"Ventas realizadas" +"\n"+
                "Fecha='" + fecha+ "\n" +
                cliente +
                  packs+"\n"
                ;
    }



}
