import java.util.ArrayList;
import java.util.Scanner;

public class ID_1462A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                b[i] = input.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();
            int left = 0;
            int right = n - 1;
            boolean addToLeft = true;

            while (left <= right) {
                if (addToLeft) {
                    ans.add(b[left]);
                    left++;
                } else {
                    ans.add(b[right]);
                    right--;
                }
                addToLeft = !addToLeft;
            }

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        input.close();
    }
}