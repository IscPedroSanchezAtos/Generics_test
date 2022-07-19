import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main (String[] args){
        behaviorsClass behavior = new behaviorsClass();
        ArrayList col= new ArrayList();

        int op;
        int coll;
        int resultado;



        do{
            Scanner scr = new Scanner (System.in);
            System.out.println("Elige una opción:" + "\n" +
                    "1.- Agregar un valor al array" + "\n" +
                    "2.- Mostrar el numero mayor" + "\n"+
                    "3.- Mostrar el numero menor" + "\n"+
                    "4.- Mostrar la suma de dos valores en el array" + "\n"+
                    "5.- Mostrar el producto de dos valores en el array" + "\n"+
                    "6.- Mostrar el factorial de un valor en el array" + "\n"+
                    "7.- Mostrar los numeros primos en el array" + "\n"+
                    "8.- Mostrar los numeros primos en el array" + "\n"

            );
            op = scr.nextInt();

            switch(op){
                case 1:
                    System.out.println("Ingrese el valor");
                    coll = scr.nextInt();
                    col.add(coll);
                    System.out.println(col);
                    break;
                case 2:
                    System.out.println(col);
                    resultado = (int) behavior.maxValue(col.toArray(new Object[0]));
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El numero mayor es: " + resultado+"\n");

                    break;
                case 3:
                    System.out.println(col);
                    resultado = (int) behavior.minValue(col.toArray(new Object[0]));
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El numero menor es: " + resultado+"\n");

                    break;
                /*case 4:
                    System.out.println(col);
                    resultado = (int) behavior.maxValue(col.toArray(new Object[0]));

                    System.out.println("El numero mayor es: " + resultado+"\n");

                    break;
                case 5:
                    System.out.println(col);
                    resultado = (int) behavior.maxValue(col.toArray(new Object[0]));

                    System.out.println("El numero mayor es: " + resultado+"\n");

                    break;
                case 6:
                    System.out.println(col);
                    resultado = (int) behavior.maxValue(col.toArray(new Object[0]));

                    System.out.println("El numero mayor es: " + resultado+"\n");

                    break;
                case 7:
                    System.out.println(col);
                    resultado = (int) behavior.maxValue(col.toArray(new Object[0]));

                    System.out.println("El numero mayor es: " + resultado+"\n");

                    break;*/
                case 8:
                    break;

            }





    } while(op != 8);

    }

}
