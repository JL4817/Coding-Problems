import java.util.Scanner;

public class ID_110A {

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    String number = input.nextLine();

    int count=0;

    for(int i=0; i<number.length(); i++){

        if(number.charAt(i) == '4' || number.charAt(i) == '7'){
            count++;
        }

    }
//count == number.length() && number.contains("4") && number.contains("7") || 
    
    if(count == 7 || count == 4){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }



    }
    
}
