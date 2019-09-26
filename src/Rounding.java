/*
6. There are several pairs of numbers. For each pair you are to divide first by second and return the result, rounded to the nearest integer
 */
public class Rounding {

    long countAverage (double num1, double num2){

        double average = num1 / num2;
        long round = Math.round(average);
        return round;
    }

    public static void main(String[] args) {
        Rounding r = new Rounding();

        System.out.print(r.countAverage(5697, 1622) + " ");
        System.out.print(r.countAverage(3578345, 133) + " ");
        System.out.print(r.countAverage(8069741, 4465538) + " ");
        System.out.print(r.countAverage(5007365, 814) + " ");
    }
}
