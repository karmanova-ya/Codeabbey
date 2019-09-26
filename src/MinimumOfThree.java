import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
5. Main trick here is how to choose minimum efficiently.
Many solutions use 6 comparisons, like "if a < b and a < c then a is min" repeated three times for each variable. This looks bit too clumsy.
Simple and clear approach is to use additional variable:
      min=a;
      if(min>b)
      min=b;
      if(min>c)
      min=c;
      output min

We can even do without temporary variable as a matter of fact:
      if (a < b)
      b = a;
      if (b < c)
      c = b;
      output c
 */
public class MinimumOfThree {

    //Variant 1
    int findMin(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array1 = {-6438362, -3879122, 6650792};
        int[] array2 = {-7017093, 7270493, -4081751};
        int[] array20 = {7534395, 1861746, 1050428};

        MinimumOfThree practice = new MinimumOfThree();

        System.out.print(practice.findMin(array1) + " ");
        System.out.print(practice.findMin(array2) + " ");
        System.out.print(practice.findMin(array20));
    }
}

