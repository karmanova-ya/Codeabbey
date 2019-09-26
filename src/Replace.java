//Replace the blanks with commas

public class Replace {
    public static void main(String[] args) {

        String s = "566 219 588";
        String str;
        str=s.replaceAll(" ",", ");
        System.out.println(str);
    }
}
