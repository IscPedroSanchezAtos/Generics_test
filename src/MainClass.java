import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {



    public static <T> void main (String[] args){
        behaviorsClass<T> behavior = new behaviorsClass<>();
        List<Integer> col= new ArrayList<>();

        int op,coll,resul,value1,index2,index1,value2;


        do{
            Scanner scr = new Scanner (System.in);
            System.out.println("Elige una opción:" + "\n" +
                    "1.- Add a value to array" + "\n" +
                    "2.- Get the greatest number" + "\n"+
                    "3.- Get the smallest number" + "\n"+
                    "4.- Get the addition of two values into array" + "\n"+
                    "5.- Get the product of two values into array" + "\n"+
                    "6.- Get the factorial of a value in the array" + "\n"+
                    "7.- Get the prime numbers in the array" + "\n"+
                    "8.- Out" + "\n"

            );
            op = scr.nextInt();

            switch(op){
                case 1:
                    try {
                        System.out.println("Enter the value");
                        coll = scr.nextInt();
                        col.add(coll);
                        System.out.println(col);
                    }catch (ArrayIndexOutOfBoundsException ex){
                        System.out.println(ex);

                    }
                    break;
                case 2:
                    System.out.println(col);
                    resul = (int) behavior.maxValue((T[]) col.toArray());
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the greatest value is: " + resul+"\n");

                    break;
                case 3:
                    System.out.println(col);
                    resul = (int) behavior.minValue((T[]) col.toArray());
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the smallest value : " + resul+"\n");

                    break;
                case 4:

                    System.out.println("select the position of the first value you want to add: " );
                    System.out.println(col);
                    value1 = scr.nextInt();

                    System.out.println("select the position of the second value you want to add: " );
                    System.out.println(col);
                    value2 = scr.nextInt();
                    index1 = col.get(value1);
                    index2 = col.get(value2);

                    resul = (int) behavior.sum(index1,index2);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the selected values were "+index1+" and "+index2+" the addition of these is: " + resul+"\n");

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

                    resul = (int) behavior.product(index1,index2);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the selected values were "+index1+" and "+index2+" the product of these is: " + resul+"\n");


                    break;
                case 6:
                    System.out.println("select the position of the value you want to get the factorial: " );
                    System.out.println(col);
                    value1 = scr.nextInt();
                    index1 = col.get(value1);

                    resul = (int) behavior.factorial(index1);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("the factorial of: "+index1+" is: " + resul+"\n");

                    break;
                case 7:
                    System.out.println(col);
                    List<Integer> res = new ArrayList<>();
                    res = (List<Integer>) behavior.prime(col);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("The prime numbers in the collection are: " + res+"\n");

                    break;
                case 8:
                    System.out.println("see you soon XD");

                    break;

            }





    } while(op != 8);

    }

}
