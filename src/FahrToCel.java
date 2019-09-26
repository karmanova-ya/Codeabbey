/*
7. There are two widespread systems of measuring temperature - Celsius and Fahrenheit. First is quite popular in Europe and second is well in use in United States for example.

By Celsius scale water freezes at 0 degrees and boils at 100 degrees. By Fahrenheit water freezes at 32 degrees and boils at 212 degrees. You may learn more from wikipedia on Fahrenheit. Use these two points for conversion of other temperatures.

You are to write program to convert degrees of Fahrenheit to Celsius.

Input data contains N+1 values, first of them is N itself (Note that you should not try to convert it).
Answer should contain exactly N results, rounded to nearest integer and separated by spaces.
 */
public class FahrToCel {

    static long fahrenheitToCelsius (double fahrenheit){

        double cel = 5*(fahrenheit - 32)/9;
        long celsius = Math.round(cel);

        return celsius;
    }

    public static void main(String[] args) {

        double[] fahrenheit = {99, 138, 310, 385, 242, 566, 219, 588};
        long[] celsius = new long[fahrenheit.length];

        for (int i = 0; i < fahrenheit.length; i++) {
            celsius[i] = fahrenheitToCelsius(fahrenheit[i]);

        }

        for (long r : celsius) {
            System.out.print(r + " ");
        }
    }
}
