import java.util.Scanner;

public class ID_1374C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            System.out.println(recursiveKeepCheck(str));
        }
        input.close();
    }

    private static int recursiveKeepCheck(String str) {
        if (str.contains("()")) {
            str = str.replaceAll("\\(\\)", "");
            return recursiveKeepCheck(str);
        }
        return str.length() / 2;
    }
}