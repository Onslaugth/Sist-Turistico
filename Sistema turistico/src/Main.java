import Clases.*;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aventura packA1=new Aventura(5,1,1,"Playa","kayak");
        Aventura packA2=new Aventura(5,5,2,"Montaña","Senderismo");
        Relax packR1=new Relax( 5,10,3,"playa","hidromasaje");
        Relax packR2=new Relax( 5,1,4,"playa","Baño de barro");
        Cultura packC1=new Cultura(5, 3, 5, "montaña",5);
        Cultura packC2=new Cultura(5,4,6,"",10);

        Cliente pepe=new Cliente("Pepe","peposo",1);
        Cliente luisa=new Cliente("Luisa","Lane",2);
        Cliente tito=new Cliente("tito","Puentes",3);

        ArrayList<Ventas> historial=new ArrayList<Ventas>();
        ArrayList<Cliente> clientes=new ArrayList<Cliente>();
        ArrayList<Paquetes> paquetes=new ArrayList<Paquetes>();

        agregarCliente(pepe,clientes);
        agregarCliente(luisa,clientes);
        agregarCliente(tito,clientes);

        agregarPaquetes(packA1,paquetes);
        agregarPaquetes(packA2,paquetes);
        agregarPaquetes(packR1,paquetes);
        agregarPaquetes(packR2,paquetes);
        agregarPaquetes(packC1,paquetes);
        agregarPaquetes(packC2,paquetes);

        agregarVenta("15/4/2024",pepe,packA1,historial);
        agregarVenta("25/5/2024",pepe,packC1,historial);
        agregarVenta("14/7/2024",pepe,packR1,historial);
        agregarVenta("18/7/2024",luisa,packR1,historial);
        agregarVenta("15/1/2024",tito,packC2,historial);
        agregarVenta("31/3/2024",tito,packA1,historial);

        pause();
        System.out.println("\n");



        Agencia compañia=new Agencia(clientes,paquetes,historial);


        System.out.println("\n");

        System.out.println("Bienvenido al sistema de la agencia viajes patito\n");
        int salida=1;
        while (salida==1) {
            System.out.println("Que desea hacer?\n");
            System.out.println("1-Ver clientes\n");
            System.out.println("2-Ver paquetes disponibles\n");
            System.out.println("3-Ver historial de ventas\n");
            System.out.println("4-Eliminar paquetes\n");
            System.out.println("5-Aumentar precio de paquete aventura\n");
            System.out.println("6-Ver paquete mas vendido\n");


            int opcion = teclado.nextInt();
            compañia.getPacks();
            switch (opcion) {
                case 1:
                    System.out.println(clientes.toString());
                    pause();
                    break;
                case 2:
                    System.out.println(paquetes.toString());
                    pause();
                    break;
                case 3:
                    System.out.println(historial.toString());
                    pause();
                    break;
                case 4:
                    System.out.println("Ingrese el ID del paquete que desea eliminar\n");
                    int id = teclado.nextInt();
                    compañia.removerPack(id);
                    break;
                case 5:
                    ArrayList<Paquetes> x = compañia.getPacks();
                    for (Paquetes y : x) {
                        if (y instanceof Aventura) {
                            ((Aventura) y).incremento();
                        }
                    }
                    pause();
                    break;
                case 6:
                    System.out.println(maximoEnVentas(historial));

                    break;
            }
            System.out.println("\n");
            System.out.println("Desea seguir consultando el sistema?\n");
            System.out.println("1-Si\n");
            System.out.println("0-No\n");
            salida=teclado.nextInt();
            System.out.println("\n");
        }

        }






    public static  void   agregarVenta (String fecha,Cliente cliente,Paquetes pack,ArrayList<Ventas>historial) {
        Ventas nuevo = null;
        if (pack.getStock() > 0) {
            nuevo = new Ventas(fecha, cliente, pack);
            historial.add(nuevo);
            pack.setStock(pack.getStock()-1);

        } else {
            System.out.println("No se puede agregar una venta debido a la falta de Stock");

        }
    }


    public static void agregarCliente (Cliente cliente, ArrayList<Cliente>clientes)
    {

        for(Cliente x: clientes)
        {
            if(x.getPasaporte()==cliente.getPasaporte())
            {
                System.out.println("No se puede agregar cliente,ya que este se encuentra actualmente registrado");
                break;
            }
        }
        clientes.add(cliente);
    }

    public  static  void agregarPaquetes (Paquetes pack, ArrayList<Paquetes>paquetes)
    {
        for (Paquetes x: paquetes)
        {
            if (x.getId()== pack.getId())
            {
                System.out.println("El paquete que quiere agregar ya esta en el sistema");
                break;
            }
        }
        paquetes.add(pack);
    }
    public static void pause() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese enter para continuar\n");

        s.next();
        System.out.println("\n");


    }




    public static  String  maximoEnVentas (ArrayList<Ventas> ventas) {

        int a=0;
        int c=0;
        int r=0;
        for (Ventas x:ventas)

        if(x.getPacks() instanceof  Aventura)
        {
            a++;

        }else if(x.getPacks() instanceof Cultura)
        {
            c++;

        }else if (x.getPacks() instanceof Relax)
        {
            r++;

        }


        String maximo="";
        if (a==r && a==c)
        {
            maximo="Todos los paquetes vendieron el mismo numero de paquetes: "+a;
        }else if(a==r && a>c && r>c)
        {
            maximo="El paquete de aventura y el paquete de relax han vendido la misma cantidad:  "+a;

        }else  if(a==c && a>r && c>r)
        {
            maximo="El paquete de aventura y el paquete de cultura han vendido la misma cantidad:  "+a;

        } if(c==r && c>a && r>a)
        {
            maximo="El paquete de cultura y el paquete de relax han vendido la misma cantidad:  "+c;

        }else if (a > c && a > r) {
            maximo="El paquete mas vendido es el de aventura con "+a+" paquetes vendidos\n";
        } else if (c > a && c > r) {
            maximo="El paquete mas vendido es el de cultura con "+c+" paquetes vendidos\n";
        } else if (r > c && r > a) {
            maximo="El paquete mas vendido es el de relax con "+r+" paquetes vendidos\n";
        }





        return maximo;


    }
}






