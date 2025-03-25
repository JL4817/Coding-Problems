import java.util.Scanner;

public class ID_734A {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfGames = input.nextInt();
        input.nextLine();
        String theGames = input.nextLine();
      //  System.out.println(theGames);

        int countA = 0;
        int countD = 0;

        String[] strArray = null;   
        strArray = theGames.split("(?!^)");  

        for (int i = 0; i< strArray.length; i++){  

      //  System.out.println(strArray[i]);  

            if(strArray[i].equals("A")){
                countA++;

            }
            
            if(strArray[i].equals("D")){

                countD++;
            }


        }  


        //System.out.println(countA);
        //System.out.println(countD);
        

        if(countA>countD){
            System.out.println("Anton");
        }else if(countA<countD){
            System.out.println("Danik");
        }else if(countA==countD){
            System.out.println("Friendship");
        }


    }
    
}
