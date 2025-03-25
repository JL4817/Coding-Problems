import java.util.Scanner;

public class ID_131A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int capsLockCount = 0;
        int lowerCaseCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                capsLockCount++;
            }
        }

        if (capsLockCount == str.length()) {
            System.out.println(str.toLowerCase());
        } else if (lowerCaseCount == 1 && Character.isLowerCase(str.charAt(0))) {
            str = str.toLowerCase(); // caps
            StringBuilder sb = new StringBuilder(str);
            sb.delete(0, 1); // aps
            System.out.println(str.substring(0, 1).toUpperCase() + sb.toString());
        } else {
            System.out.println(str);
        }

        input.close();
    }
}
