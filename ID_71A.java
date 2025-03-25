
import java.util.Scanner;

public class ID_71A{

    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        num=input.nextInt();


      for (int i=0; i<num+1; i++){

         String scanWord = input.nextLine();
    // String scanWord = "communication";
        StringBuilder word = new StringBuilder(scanWord);
          
    if(word.length() > 10){

        int newL = word.length()-2;
        StringBuilder newPiece2 = word.delete(1, word.length()-1);
        String print = newPiece2.toString();

        String[] parts = print.split("");
        String part1 = parts[0]; 
        String part2 = parts[1]; 

        System.out.println(part1+newL+part2);
        
    }
    else 
    {
        System.out.println(word);
    }




   // String resultString = word.toString();



    }
    
    }



}
