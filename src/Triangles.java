/*
9. Triangle is an object built of three line segments (sides of triangle), connected by ends. Wiki on triangles provides more detailed explanation.
If we have three line segments with lengths A B C - we either can built a triangle with them
(for example with 3 4 5 or 3 4 7 - though this is with zero area) or we found it impossible
(for example 1 2 4).

You are given several triplets of values representing lengths of the sides of triangles. You should tell from which triplets it is possible to build triangle and for which it is not.

Input data: First line will contain number of triplets.
Other lines will contain triplets themselves (each in separate line).
Answer: You should output 1 or 0 for each triplet (1 if triangle could be built and 0 otherwise)
 */

public class Triangles {
    public int a, b, c;

    int isTriangle(int a, int b, int c) {
        int triangle;

        if (a + b >= c && b + c >= a && a + c >= b) {
            triangle = 1;
        } else {
            triangle = 0;
        }

        return triangle;
    }

    public static void main(String[] args) {
        Triangles triangles = new Triangles();

        System.out.print(triangles.isTriangle(4215,990,1733) + " ");
        System.out.print(triangles.isTriangle(1578,700,688) + " ");
        System.out.print(triangles.isTriangle(777,455,1582) + " ");
        System.out.print(triangles.isTriangle(642,729,923) + " ");
        System.out.print(triangles.isTriangle(2139,1421,807) + " ");
        System.out.print(triangles.isTriangle(299,172,400) + " ");
    }
}