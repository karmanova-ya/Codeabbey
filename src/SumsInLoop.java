/*
3. Now we are given several pairs of values and we want to calculate sum for each pair.

Input data will contain the total count of pairs to process in the first line.
The following lines will contain pairs themselves - one pair at each line.
Answer should contain the results separated by spaces.
 */
public class SumsInLoop {

    public static void main(String[] args) {
        int [] array1 = {231917,266900,766271,484470,515394,515437,844196,693797,734237,521673,329164,182971,270201,508636};
        int [] array2 = {981655,94078,747831,824680,359510,541795,439079,817113,640200,282383,320630,164020,834513,244038};
        int [] result = new int[array1.length];

        for (int i=0; i<array1.length; i++){
            result[i]=array1[i] + array2[i];
            System.out.print(result[i]+" ");
        }
    }
}
