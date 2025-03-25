import java.util.Scanner;

public class ID_32B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = input.nextLine().split("");
        // String asd = "--.";
        // String arr[] = asd.split("");
        String total = "";

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i].equals(".")) {
                total += "0";
            } else if (arr[i].equals("-") && arr[i + 1].equals(".")) {
                total += "1";
                i++;
            } else if (arr[i].equals("-") && arr[i + 1].equals("-")) {
                total += "2";
                i++;
            }
        }

        System.out.println(total);
    }
}
