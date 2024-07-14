package Clases;

import java.util.ArrayList;

public class Agencia {
   private ArrayList<Cliente> compradores;
    private  ArrayList<Paquetes> packs;
   private  ArrayList<Ventas> vendidos;

    public Agencia(ArrayList<Cliente> compradores, ArrayList<Paquetes> packs, ArrayList<Ventas> vendidos) {
        this.compradores = compradores;

        this.packs =packs;
        this.vendidos = vendidos;
    }

    public ArrayList<Cliente> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<Cliente> compradores) {
        this.compradores = compradores;
    }

    public ArrayList<Paquetes> getPacks() {
        return packs;
    }

    public void setPacks(ArrayList<Paquetes> packs) {
        this.packs = packs;
    }

    public ArrayList<Ventas> getVendidos() {
        return vendidos;
    }

    public void setVendidos(ArrayList<Ventas> vendidos) {
        this.vendidos = vendidos;
    }

    public void removerPack (int id)
    {
        int i=0;
        for (Paquetes x: this.packs){
            if (id==x.id){
                this.packs.remove(i);
            }
            i++;
        }
    }





}
