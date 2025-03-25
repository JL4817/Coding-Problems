import java.util.Scanner;

public class ID_266A {

    public static void main(String[] args) {
        // make sure that there are no neiboring same color stones
        Scanner input = new Scanner(System.in);

        int nStones = input.nextInt();
        String arr[] = input.next().split("");

        int count = 0;

        for (int i = 0; i < nStones - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                count++;
            }
        }

        System.out.println(count);

    }

}
