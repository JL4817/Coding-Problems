import java.util.Scanner;

public class ID_677A {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfFriends = input.nextInt();
        int height = input.nextInt();
        input.nextLine(); 
        String person = input.nextLine();

        String[] array = person.split("\\s+");
        int[] numbers = new int[array.length];

        int count=0;

        for (int j = 0; j < array.length; j++) {

            numbers[j] = Integer.parseInt(array[j]);

            if(numbers[j] > height){
                count = count+2;
            }else{
                count++;
            }


        }

        System.out.println(count);


    }
    
}
