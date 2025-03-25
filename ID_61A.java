import java.util.Scanner;

public class ID_61A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String str1[] = input.nextLine().split("");
        String str2[] = input.nextLine().split("");

        String end = "";

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].equals(str2[i])) {
                end = end + "0";
            } else {
                end = end + "1";
            }
        }

        System.out.println(end);

    }

}
