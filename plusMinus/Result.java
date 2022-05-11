//https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

package plusMinus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Result {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        double positive = 0;
        double negative = 0;
        double neutral = 0;
        DecimalFormat df = new DecimalFormat("0.000000");

        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positive += 1;

            } else if (arr.get(i) < 0) {
                negative += 1;
            } else if (arr.get(i) == 0) {
                neutral += 1;
            }
        }
        System.out.println(df.format(positive / n));
        System.out.println(df.format(negative / n));
        System.out.println(df.format(neutral / n));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
