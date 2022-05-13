//https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

package staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Result {

    public static void staircase(int n) {
        // Write your code here
        String space = " ";
        String symbol = "#";
        for (int i = 1; i - 1 < n; i++) {
            System.out.println(space.repeat(n - i) + symbol.repeat(i));

        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
