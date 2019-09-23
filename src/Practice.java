import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //Practice pr = new Practice();

        //11. Reverse String

                System.out.print("Enter string to reverse: ");

                Scanner read = new Scanner(System.in);
                String str = read.nextLine();
                String reverse = "";


                for(int i = str.length() - 1; i >= 0; i--)
                {
                    reverse = reverse + str.charAt(i);
                }

                System.out.print("Reversed string is: ");
                System.out.print(reverse);

/*
//10. Linear Function
    //public class Practice {
    int a, b;

    public int finedB(int x, int y) {
        int a1 = 2, b1;
        //y = a*x + b;
        b1 = y - (a1*x);
        //b=19-2*5
        //a=3 b=4 x=5 y=19   3*5+4=19
        b = b1;
        return b;
    }


    public int finedA(int x, int y){
        int a2, b2=2;
        //y = a*x + b;    a=3 b=4   3*5+4=19
        a2 = (y - b2)/x;
        a = a2;


      //0 = 1*0 + 0   (x1, y1) - 0 0   (a b) - (1 0)
      //1 = 1*1 + 0   (x1, y1) - 1 1   (a b) - (1 0)
      //0 = -1*1 + 1  (x2, y2) - 1 0   (a b) - (-1 1)
      //1 = -1*0 + 1  (x2, y2) - 0 1   (a b) - (-1 1)
        return a;
    }


    public int testResult(int x){
        int y;
        y = a*x + b;


      //0 = 1*0 + 0   (x1, y1) - 0 0   (a b) - (1 0)
      //1 = 1*1 + 0   (x1, y1) - 1 1   (a b) - (1 0)
      //0 = -1*1 + 1  (x2, y2) - 1 0   (a b) - (-1 1)
      //1 = -1*0 + 1  (x2, y2) - 0 1   (a b) - (-1 1)
        return y;
    }



//10. Linear Function

y(x) = ax + b
        входные данные:
(x1, y1) - 0 0 1 1
(x2, y2) - 1 0 0 1

ответ:
(a b) - (1 0) (-1 1)
*/





//9. Triangles
/*
        System.out.print(pr.isTriangle(656,2047,1159) + " ");
        System.out.print(pr.isTriangle(307,879,567) + " ");
        System.out.print(pr.isTriangle(812,1318,2153) + " ");
        System.out.print(pr.isTriangle(2123,577,938) + " ");
        System.out.print(pr.isTriangle(4215,990,1733) + " ");
        System.out.print(pr.isTriangle(1578,700,688) + " ");
        System.out.print(pr.isTriangle(777,455,1582) + " ");
        System.out.print(pr.isTriangle(642,729,923) + " ");
        System.out.print(pr.isTriangle(2139,1421,807) + " ");
        System.out.print(pr.isTriangle(299,172,400) + " ");
        System.out.print(pr.isTriangle(563,1280,1077) + " ");
        System.out.print(pr.isTriangle(605,1138,538) + " ");
        System.out.print(pr.isTriangle(2291,962,560) + " ");
        System.out.print(pr.isTriangle(328,1266,592) + " ");
        System.out.print(pr.isTriangle(639,525,1152) + " ");
        System.out.print(pr.isTriangle(222,524,420) + " ");
        System.out.print(pr.isTriangle(1101,586,2297) + " ");
        System.out.print(pr.isTriangle(418,363,714) + " ");
        System.out.print(pr.isTriangle(717,1289,998) + " ");
        System.out.print(pr.isTriangle(2486,835,1554) + " ");
        System.out.print(pr.isTriangle(257,269,475) + " ");
        System.out.print(pr.isTriangle(1742,3696,943) + " ");
        System.out.print(pr.isTriangle(991,1121,603) + " ");
        System.out.print(pr.isTriangle(776,492,1316) + " ");
        System.out.print(pr.isTriangle(1508,3431,946) + " ");
        System.out.print(pr.isTriangle(500,976,1065) + " ");
 */

//9. Triangles
/*
    int isTriangle (int a, int b, int c) {
        int triangle;

        if (a + b >= c && b + c >= a && a + c >= b) {
            triangle = 1;
        } else {
            triangle = 0;
        }

        return triangle;
    }
*/

//8.Arithmetic Progression
/*
//    A это начальное значение последовательности, B её шаг, а N количество первых членов которые нужно просуммировать.
//    A,  (A + B),  (A + 2*B),  (A + 3*B), ...
//    5 + (5+2) + (5+2*2) = 21

    public int progression (int num, int step, int amt){
        int progression = num;
        for (int i=1; i<amt; i++){
            progression += num + i*step;
        }
        return progression;
    }
*/


//8.Arithmetic Progression
/*
    System.out.print(pr.progression(12,0, 88) + " ");
    System.out.print(pr.progression(20,13,42) + " ");
    System.out.print(pr.progression(22, 18, 31) + " ");
    System.out.print(pr.progression(28, 7, 63) + " ");
    System.out.print(pr.progression(21, 1, 80) + " ");
    System.out.print(pr.progression(12, 16, 94) + " ");
    System.out.print(pr.progression(14, 17, 59) + " ");
    System.out.print(pr.progression(5, 10, 71) + " ");
    System.out.print(pr.progression(23, 5, 37) + " ");
    System.out.print(pr.progression(16, 16, 75) + " ");
*/

//7. Fahrenheit to Celsius
/*
    static long fahrenheitToCelsius (double fahrenheit){

        double cel = (fahrenheit - 32)/1.8;
        long celsius = Math.round(cel);

        return celsius;
}
*/

//7. Fahrenheit to Celsius
/*
        double [] fahrenheit = {437, 246, 386, 135, 288, 434, 378, 451, 394, 196, 293, 90, 263, 60, 569, 421, 185, 526, 123, 568, 496, 553, 378, 394, 353, 179, 91, 181, 301, 95, 599, 138, 310, 385, 242, 566, 219, 588};
        long [] celsius = new long[fahrenheit.length];

        for (int i=0; i<fahrenheit.length; i++) {
            celsius[i]=fahrenheitToCelsius(fahrenheit[i]);

        }



        for (long r : celsius) {
            System.out.print(r+" ");
        }
*/



//6. Rounding
/*
        System.out.print(r.countAverage(5697, 1622) + " ");
        System.out.print(r.countAverage(3578345, 133) + " ");
        System.out.print(r.countAverage(8069741, 4465538) + " ");
        System.out.print(r.countAverage(5007365, 814) + " ");
        System.out.print(r.countAverage(9481101, 755) + " ");
        System.out.print(r.countAverage(6793, 430) + " ");
        System.out.print(r.countAverage(16931, 1062) + " ");
        System.out.print(r.countAverage(15451, 794) + " ");
        System.out.print(r.countAverage(17655, 422) + " ");
        System.out.print(r.countAverage(7387, 440) + " ");
        System.out.print(r.countAverage(18823, 610) + " ");
        System.out.print(r.countAverage(19805, 1068));
*/

//6. Rounding
/*
    long countAverage (double num1, double num2){

        double average = num1 / num2;
        long round = Math.round(average);
        return round;
    }
*/


//5. Minimum of Three
/*
//Main trick here is how to choose minimum efficiently.
//
//Many solutions use 6 comparisons, like "if a < b and a < c then a is min" repeated three times for each variable. This looks bit too clumsy.
//
//Simple and clear approach is to use additional variable:

      min=a;
      if(min>b)
      min=b;
      if(min>c)
      min=c;
      output min

//We can even do without temporary variable as a matter of fact:

      if (a < b)
      b = a;
      if (b < c)
      c = b;
      output c
*/

/*
//my realisation
    int findMin(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }
*/

//5. Minimum of Three

/*
        int [] array1 = {-6438362,-3879122,6650792};
        int [] array2 = {-7017093,7270493,-4081751};

        int [] array20 = {7534395,1861746,1050428};


        Practice practice = new Practice();


        System.out.print(practice.findMin(array1) + " ");
        System.out.print(practice.findMin(array2) + " ");

        System.out.print(practice.findMin(array20));

*/




//4. Minimum of Two
/*
        int [] array1 = {3352819,-1482780,-3323178,5206065,-4106368,6578232,-5405737,-2858404,-8841964,-8706014,-9007068,3266992,-1296605,3121967,36643,-8669919,-2517348,-1776138,2719029,1143194,1526778,8717830,-8788527,647513};
        int [] array2 = {-7999677,-5165600,-7128270,6983720,-1903149,-9894829,3490046,4526473,2718324,6424653,3075757,-3485095,-8958173,3703646,-4517670,-6610538,-152700,4159473,-6570073,8612660,-2278573,6121040,-4140573,-7630491};
        int [] result = new int[array1.length];

        for (int i=0; i<array1.length; i++) {

            if (array1[i] < array2[i]){
                result[i]=array1[i];
            }
            else {
                result[i]=array2[i];
            }
        }

        for (int r : result) {
            System.out.print(r+" ");
        }

 */





//3. Sums in Loop
/*

        int [] array1 = {231917,266900,766271,484470,515394,515437,844196,693797,734237,521673,329164,182971,270201,508636};
        int [] array2 = {981655,94078,747831,824680,359510,541795,439079,817113,640200,282383,320630,164020,834513,244038};
        int [] result = new int[array1.length];

        for (int i=0; i<array1.length; i++){
            result[i]=array1[i] + array2[i];
            System.out.print(result[i]+" ");
        }
*/




//2. Sum in Loop

/*
        int[] data = {529,382,193,74,257,1273,934,289,356,505,1282,405,676,250,760,1131,326,1221,408,885,1059,1049,24,522,640,415,407,338,59,820,16,578,1193,200,643,149,173,276,428,519,771,410,914,147,650};
        int summ = 0;

        for (int i = 0; i < data.length; i++) {
            summ+=data[i];
        }

        System.out.println(summ);
*/




//1. Sum "A+B"
// Summ summ = new Summ(15577, 3654);
//summ.countSumm();
/*
        int a = 15577;
        int b = 3654;
        System.out.println(a+b);
        System.out.println();
*/



//заменить пробелы на запятые
/*
        String s = "566 219 588";
        String str;
        str=s.replaceAll(" ",", ");
        System.out.println(str);
*/




}

}
