import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static <T> void main (String[] args){
        behaviorsClass<T> behavior = new behaviorsClass<>();
        List<Integer> col= new ArrayList<>();

        int op;
        int coll;
        int resultado;
    T t;


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
                    "8.- Out" + "\n"

            );
            op = scr.nextInt();

            switch(op){
                case 1:
                    try {
                        System.out.println("Ingrese el valor");
                        coll = scr.nextInt();
                        col.add(coll);
                        System.out.println(col);
                    }catch (ArrayIndexOutOfBoundsException ex){
                        System.out.println(ex);

                    }
                    break;
                case 2:
                    System.out.println(col);
                    resultado = (int) behavior.maxValue((T[]) col.toArray());
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El numero mayor es: " + resultado+"\n");

                    break;
                case 3:
                    System.out.println(col);
                    resultado = (int) behavior.minValue((T[]) col.toArray());
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El numero menor es: " + resultado+"\n");

                    break;
                case 4:

                    System.out.println("select the position of the first value you want to add: " );
                    System.out.println(col);
                    int value1 = scr.nextInt();

                    System.out.println("select the position of the second value you want to add: " );
                    System.out.println(col);
                    int value2 = scr.nextInt();
                    int index1 = col.get(value1);
                    int index2 = col.get(value2);

                    resultado = (int) behavior.sum(index1,index2);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the selected values were "+index1+" and "+index2+" the addition of these is: " + resultado+"\n");

                    break;
                case 5:
                    System.out.println("select the position of the first value you want to get the product: " );
                    System.out.println(col);
                    value1 = scr.nextInt();

                    System.out.println("select the position of the second value you want to get the product: " );
                    System.out.println(col);
                    value2 = scr.nextInt();
                    index1 = col.get(value1);
                    index2 = col.get(value2);

                    resultado = (int) behavior.product(index1,index2);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the selected values were "+index1+" and "+index2+" the product of these is: " + resultado+"\n");


                    break;
                case 6:
                    System.out.println("select the position of the value you want to get the factorial: " );
                    System.out.println(col);
                    value1 = scr.nextInt();
                    index1 = col.get(value1);

                    resultado = (int) behavior.factorial(index1);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the factorial of: "+index1+" is: " + resultado+"\n");

                    break;
                case 7:
                    System.out.println(col);
                    //resultado = (int) behavior.maxValue(col.toArray(new Object[0]));

                    //System.out.println("El numero mayor es: " + resultado+"\n");

                    break;
                case 8:
                    break;

            }





    } while(op != 8);

    }

}
