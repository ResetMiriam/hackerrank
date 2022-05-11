//

package diagonalDifference;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr, int n) {
        // Write your code here

        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        int result;

        for (int i = 0; i < n; i++) {
            sumPrimaryDiagonal += arr.get(i).get(i);
            sumSecondaryDiagonal += arr.get(i).get(n - i - 1);
        }
        result = Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
        return result;
    }

       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumPrimaryDiagonal += arr.get(i).get(j);

                    arr.get(0).get(0) + arr.get(1).get(1)
                }
                if (i == n - j - 1) {
                    sumSecondaryDiagonal += arr.get(i).get(j);
                }
            }
        }
        result = Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
        return result;
    }

        */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();


        bufferedReader.close();
        bufferedWriter.close();
    }

}
