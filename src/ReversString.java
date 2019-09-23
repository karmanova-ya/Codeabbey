import java.util.Scanner;

public class ReversString {

    public static void main(String[] args) {
        System.out.print("Enter string to reverse: ");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.print("Reversed string is: ");
        System.out.print(reverse);
    }
}
