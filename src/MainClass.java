import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main (String[] args){
        behaviorsClass behaviors = new behaviorsClass();

        ArrayList col= new ArrayList();
        //int col[] = new int[]{10,12,45};
        int op;
        int coll;


        /*for(int i = 1; i< col.toArray().length; i++){

        }*/

        do{
            Scanner scr = new Scanner (System.in);
            System.out.println("Elige una opción:" + "\n" +
                    "1.- Agregar un valor al array" + "\n" +
                    "2.- Mostrar el array" + "\n"
            );
            op = scr.nextInt();

            switch(op){
                case 1:
                    System.out.println("Ingrese el valor");
                    coll = scr.nextInt();
                    col.add(coll);
                    break;
                case 2:
                    System.out.println(col);
                    break;

            }


            //col.add(coll);


    } while(op != 2);

    }

}
