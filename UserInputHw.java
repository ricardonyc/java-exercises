import java.util.Scanner;

class UserInputHw {
   public static void main(String args[]){
    Scanner scan = new Scanner(System.in);


       // Fibonacci series
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

    
    // Palindrome
    System.out.println("Enter a string: ");
    String userString = scan.nextLine();
    
    if(isPalindrome(userString.toLowerCase()))
        System.out.println("This is a palindrome");
    else 
        System.out.println("This is NOT a palindrome");

       
   }


   static boolean isPalindrome(String str){
       int i = 0;
       int j = str.length() - 1;

       while(i < j){
           if(str.charAt(i) != str.charAt(j))
           return false;

           i++;
           j--;
       }

       return true;
   }
}