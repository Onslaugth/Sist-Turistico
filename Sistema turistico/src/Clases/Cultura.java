package Clases;

public  class Cultura extends Paquetes implements Seguro{
   private  int cVisitas;
   private  float pFinal;

    public Cultura(int dias, int stock, int id ,String destino, int cVisitas) {
        super(dias, stock, id, destino);
        this.cVisitas = cVisitas;
        this.pFinal = (cVisitas*10)*porcent;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Paquete especifico:Cultural{" +"\n"+
                "Cantidad de visitas=" + cVisitas +"\n"+
                ", Precio final=" + pFinal +
                '}'+"\n";
    }
}
