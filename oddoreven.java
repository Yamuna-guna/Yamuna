import java.util.Scanner;

public class EvenNumbers {


    public static void main(String[] args) {
        
        Scanner my = new Scanner(System.in);
        


        System.out.println("enter the starting number:");
        int s = my.nextInt();



        
        System.out.println("enter the ending number:");
        int e = my.nextInt();

         for(int i=s; i<=e;i++)
      {
         if(i%2==0){

            System.out.println(i);
         }
      }

        
      

    }
    
}
