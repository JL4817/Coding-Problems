package Contest.C49Training;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        System.out.println(calculate(index));
    }

    public static char calculate(int index) {

        StringBuilder sb = new StringBuilder();
        int count = 1;

        while (count <= index) {
            sb.append(String.valueOf(count));
            count++;
        }

        return sb.charAt(index - 1); // returning char so return signature has to be changed
    }
}
