import java.util.Arrays;

/**
 * Created by 28076 on 2017/8/8.
 */
public class ArrayTest {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(array, 3);
        System.out.println(Arrays.toString(array));

        int [] array1 = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate1(array1, 3);
        System.out.println(Arrays.toString(array1));

        int [] array2 = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate2(array2, 4);
        System.out.println(Arrays.toString(array2));

        int [] array3 = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate3(array3, 4);
        System.out.println(Arrays.toString(array3));

        int [] array4 = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate3(array4, 4);
        System.out.println(Arrays.toString(array4));
    }

}
