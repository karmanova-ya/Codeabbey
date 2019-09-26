/*
2. Create variable sum and add every value from the list to it. Perhaps "for" loop will suit nicely since the amount of numbers is known beforehand.


Input data has the following format:
-first line contains N - amount of values to sum;
-second line contains N values themselves.
Answer should contain a single value - the sum of N values.
 */
public class SumInLoop {
    public static void main(String[] args) {
        int[] data = {2,3,3,4,2,12,4,2,3,7,10};
        int summ = 0;

        for (int i = 0; i < data.length; i++) {
            summ+=data[i];
        }

        System.out.println(summ);
    }
}
