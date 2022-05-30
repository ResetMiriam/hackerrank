// Source: https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true


package extraLongFactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Result {
    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 2; i <= n; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(result);


    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
