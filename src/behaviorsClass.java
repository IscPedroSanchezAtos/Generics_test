import java.util.Arrays;

public class behaviorsClass<T> implements DeclarationInterface<T> {


    @Override
    public T product(Integer index1, Integer index2) {
        Integer product = index1 * index2;
        return (T) product;
    }

    @Override
    public T maxValue(T[] collection) {
        Arrays.sort(collection);

        Integer maxNum = (Integer) collection[collection.length - 1];

        return (T) maxNum;

    }

    @Override
    public T minValue(T[] collection) {
        Arrays.sort(collection);

        Integer minNum = (Integer) collection[0];
        return (T) minNum;

    }

    @Override
    public T sum(Integer index1, Integer index2) {
        Integer sum = index1 + index2;
        return (T) sum;
    }

    @Override
    public T factorial(Integer index1) {
        Integer total = 1;
        for (int i = 1; i <= index1; i++){
            total = total * i;
        }
        return (T) total;
    }

    @Override
    public T prime(T[] collection) {
        return null;
    }


}