import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class behaviorsClass implements DeclarationInterface {

    @Override
    public Object product(int index1, int index2) {
        return index1 * index2;
    }

    @Override
    public Object maxValue(Object[] collection) {
       Arrays.sort(collection);

        int maxNum = (int) collection[collection.length - 1];

        return maxNum;
    }

    @Override
    public Object minValue(Object[] collection) {
        Arrays.sort(collection);

        int minNum = (int) collection[0];
        return minNum;
    }


    @Override
    public Object sum(int index1, int index2) {
        return index1 + index2;
    }
}