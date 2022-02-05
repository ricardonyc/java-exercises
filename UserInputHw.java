import java.util.Scanner;

class UserInputHw {
   public static void main(String args[]){




       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int userNum = scan.nextInt();
       
       int num1 = 0;
       int num2 = 1;
       int num3;
       
       for(int i = 0; i < userNum; i++){
           num3 = num1 + num2;
           System.out.print(" " + num3);
           num1 = num2;
           num2 = num3;

       }
       
   }
}