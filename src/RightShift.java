import java.util.Arrays;

public class RightShift {
    public static int[] rightShift(int[] array, int step){
        for(int i = 0; i < step; i++){
            int i2;
            int finalElement;
            finalElement = array[array.length-1];

            for(i2 = array.length-1; i2 > 0; i2--){
                array[i2] = array[i2-1];
            }
            array[0] = finalElement;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}