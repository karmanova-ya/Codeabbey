//This function doesn't work
/*
10. Very common problem in computational programming is to determine the underlying law to which some phenomenon obeys. For learning purpose let us practice a simple variant - discovering linear dependence by two given observations (for example, how the price for some product depends on its size, weight etc.)

Linear function is defined by an equation:

y(x) = ax + b
Where a and b are some constants.
For example, with a=3, b=2 function will yield values y = 2, 5, 8, 11...
for x = 0, 1, 2, 3...

Your task is to determine a and b by two points, belonging to the function.
I.e. you are told two pairs of values (x1, y1), (x2, y2) which satisfy the function equation - and you should restore the equation itself.

Input data have the number of test-cases in the first line
and then test-cases themselves in separate lines.
Each case contains 4 integers (x1 y1 x2 y2).
Answers should be integer too and you are to write them in line, separating with spaces and enclosing each pair in parenthesis, for example:

input data:
2
0 0 1 1
1 0 0 1

answer:
(1 0) (-1 1)
*/

public class LinearFunction {
    int a, b;

    public int finedB(int x, int y) {
        int a1 = 2, b1;
        //y = a*x + b;
        b1 = y - (a1 * x);
        //b=19-2*5
        //a=3 b=4 x=5 y=19   3*5+4=19
        b = b1;
        return b;
    }

    public int finedA(int x, int y) {
        int a2, b2 = 2;
        //y = a*x + b;    a=3 b=4   3*5+4=19
        a2 = (y - b2) / x;
        a = a2;

        //0 = 1*0 + 0   (x1, y1) - 0 0   (a b) - (1 0)
        //1 = 1*1 + 0   (x1, y1) - 1 1   (a b) - (1 0)
        //0 = -1*1 + 1  (x2, y2) - 1 0   (a b) - (-1 1)
        //1 = -1*0 + 1  (x2, y2) - 0 1   (a b) - (-1 1)
        return a;
    }

    public int testResult(int x) {
        int y;
        y = a * x + b;

        //0 = 1*0 + 0   (x1, y1) - 0 0   (a b) - (1 0)
        //1 = 1*1 + 0   (x1, y1) - 1 1   (a b) - (1 0)
        //0 = -1*1 + 1  (x2, y2) - 1 0   (a b) - (-1 1)
        //1 = -1*0 + 1  (x2, y2) - 0 1   (a b) - (-1 1)
        return y;
    }
    public static void main(String[] args) {

    }
}
