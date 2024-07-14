package Clases;

public class Relax extends Paquetes {
    private  String servicios;
    private  float pFinal;

    public Relax(int dias, int stock, int id,  String destino, String servicios) {
        super(dias, stock, id, destino);
        this.servicios = servicios;
        if(servicios.equalsIgnoreCase("Baño de barro")==true){
            this.pFinal =precio+20F;
        }else if (servicios.equalsIgnoreCase("hidromasaje")==true){
            this.pFinal=precio+30F;
        }else{
            this.pFinal=precio;
        }

    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Paquete especifico:relax{" +"\n"+
                "Servicios='" + servicios + '\'' +"\n"+
                ",Precio final=" + pFinal +
                '}'+"\n";
    }
}
