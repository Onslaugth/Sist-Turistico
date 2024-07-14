package Clases;

public class Aventura extends Paquetes implements Seguro{
   private  String actividades;
   private  float pFinal;

    public Aventura(int dias, int stock, int id, String destino, String actividades) {
        super(dias, stock, id, destino);
        this.actividades = actividades;
        if (actividades.equalsIgnoreCase("Kayak")==true){
            this.pFinal=(precio+60F)*porcent;

        }else if (actividades.equalsIgnoreCase("senderismo")==true){
            this.pFinal=(precio+50F)*porcent;
        }else{
            this.pFinal = precio*porcent;
        }


    }

    public String getActividades() {
        return actividades;
    }

    public float getpFinal() {
        return pFinal;
    }

    //@Override
    public String toString() {
        return  super.toString()+
                "\n"+"Paquete especifico:Aventura{" +"\n"+
                "Actividades='" + actividades + '\''+"\n" +
                ", Precio final=" + pFinal +
                '}'+"\n";
    }


    public void incremento ()
    {
        this.pFinal=this.pFinal*1.10F;
        System.out.println(toString());
    }

}


