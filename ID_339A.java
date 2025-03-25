import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ID_339A {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = input.nextLine();
     //   String answer = "3+5+2+1+7";

        //replaces all no numeric values 
        String intoString = answer.replaceAll("\\D", ""); 
      //  int number = Integer.parseInt(intoString);

        int[] number = new int[intoString.length()];

        for (int a = 0; a < intoString.length(); a++)
        {
         number[a] = intoString.charAt(a) - '0';
        }

        Arrays.sort(number); //ascendign order 
        
       // System.out.println(Arrays.toString(number));
        
        String[] arrayI = new String[number.length];
        
        for (int i = 0; i < number.length; i++) {
            arrayI[i] = String.valueOf(number[i]);
        } 

        ArrayList<String> finalArr = new ArrayList<String>();
      //  String finalS[];

         for(int j=0; j<arrayI.length; j++){
            
            String replace = number[j]+"+";
            finalArr.add(replace);


        }
        //finaleArr.size()-1 //Last index of Arraylist replacing it
        finalArr.set(finalArr.size()-1, finalArr.get(finalArr.size()-1).replace("+", ""));
       
        String list = Arrays.toString(finalArr.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
        System.out.println(list);
        
 

    }
    

}

