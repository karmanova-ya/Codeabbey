// 22.03.2018
//1. We need to sum two numbers and tell the result
import java.util.Scanner;

public class Summ {

    public int countSumm() {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String[] s = str.split(" ");

        int countSumm = Integer.valueOf(s[0]) + Integer.valueOf(s[1]);
        return countSumm;
    }

    public static void main(String[] args) {
        Summ summ = new Summ();

        System.out.println("input data: ");
        System.out.println("answer: \n"+ summ.countSumm());
    }
}
