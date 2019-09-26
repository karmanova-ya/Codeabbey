/*
4. Of two numbers select one with minimum value
 */
public class MinimumOfTwo {
    public static void main(String[] args) {

        int[] array1 = {-1776138, 2719029, 1143194, 1526778, 8717830, -8788527, 647513};
        int[] array2 = {4159473, -6570073, 8612660, -2278573, 6121040, -4140573, -7630491};
        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] < array2[i]) {
                result[i] = array1[i];
            } else {
                result[i] = array2[i];
            }
        }

        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}