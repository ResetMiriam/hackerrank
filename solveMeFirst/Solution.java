//https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true

package solveMeFirst;


import java.util.Scanner;

public class Solution {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        a = in.nextInt();
        b = in.nextInt();
        int sum;
        sum = add(a, b);

        System.out.println(sum);
    }
}
