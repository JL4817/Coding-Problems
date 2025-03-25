package Contest.Div2R1002;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        while (nTest-- > 0) {
            int nElements = input.nextInt();
            input.nextLine();
            int[] arrA = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arrB = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            boolean hasSolution = false;

            HashSet<Integer> distinctValsA = new HashSet<>();
            for (int val : arrA) {
                distinctValsA.add(val);
            }

            HashSet<Long> distinctSums = new HashSet<>();
            for (int val : distinctValsA) {
                for (int i = 0; i < nElements; i++) {
                    distinctSums.add((long) val + arrB[i]);
                }
            }

            System.out.println(distinctSums.size() >= 3 ? "YES" : "NO");
        }
        input.close();
    }
}