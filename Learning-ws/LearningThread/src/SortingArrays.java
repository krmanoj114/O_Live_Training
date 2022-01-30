import java.util.Arrays;
import java.util.List;

public class SortingArrays {
    public static void main(String[] args) {
        int intArray[] = {2, 5, 3, 9, 12, 0, 5};
        //WAY_1
        List.of(2, 5, 3, 9, 12, 0, 5).stream().sorted().forEach(x -> System.out.print(x));

        //WAY_2
        Arrays.sort(intArray);
        System.out.println("intArray.toString() = " + Arrays.toString(intArray));
        System.out.println("before sort " + Arrays.toString(intArray));


        //WAY_3
        int temp = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }
        System.out.println("after sort = " + Arrays.toString(intArray));

    }

}
