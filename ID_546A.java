import java.util.Scanner;

public class ID_546A {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String numbers = input.nextLine();

        String newN[] = numbers.split(" "); 
        int out[] = new int[newN.length]; 

        for(int i = 0 ; i < newN.length; i++){
            out[i] = Integer.parseInt(newN[i]);
        }

        int cost = out[0];
        int dollars = out[1];
        int numberOfB = out[2];

        //1 = 1k, 2 = 2k, 3 = 3k
        // w = k+2k+3k...wk = k(2+3+...w) = k(w(w+1)/2) 

        int sum = (cost * numberOfB*(numberOfB+1))/2;

        if(sum - dollars <0){
            System.out.println(0);

        }else
        {
            System.out.println(sum-dollars);
         //   System.out.println(cost);
        }

        


    }
    
}
