import java.util.Scanner;

public class ID_50A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double M = input.nextDouble();
        double N = input.nextDouble();

        double answer = (M*N)/2;
        double answer1 = Math.floor(answer);
        int toInt = (int)answer1;
        
        System.out.println(toInt);
        

        
    }
    
}
