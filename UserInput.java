import java.util.Scanner;
class UserInput{
    public static void main(String args[]){
        int inum;
        float fnum;
        double dnum;
        long lnum;
        char onechar;
        String name;
        String address;
        boolean choice;

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter any integer number: ");
        // inum = scan.nextInt();
        // System.out.println("Enter any longer number: ");
        // lnum = scan.nextLong();
        // System.out.println("Enter any decimal: ");
        // fnum = scan.nextFloat();
        // System.out.println("Enter any big decimal number: ");
        // dnum = scan.nextDouble();
        // System.out.println("Enter true or false: ");
        // choice = scan.nextBoolean();
        // System.out.println("Enter your name: ");
        // // * when you press enter, the enter gets stored in ADDRESS
        // // * and you dont get prompted the address question
        // // * next takes in any data type
        // name = scan.next();
        // scan.nextLine();
        // System.out.println("Enter your street address: ");
        // // * nextLine makes the question appear
        // address = scan.nextLine();


        // System.out.println(inum);
        // System.out.println(lnum);
        // System.out.println(fnum);
        // System.out.println(dnum);
        // System.out.println(choice);
        // System.out.println(name);
        // System.out.println(address); 



        // int userNum;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int userNum = scan.nextInt();

        // System.out.println("----------");
        // // first loop
        // // 1
        // // 12
        // // 123
        // // 1234
        // // 12345
        // for(int i = 1; i <= userNum; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // System.out.println("----------");
        // // second loop
        // // 54321
        // // 4321
        // // 321
        // // 21
        // // 1
        // for(int i = userNum; i >= 1; i--){
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        System.out.println("Enter a limit: ");
        int limit = scan.nextInt();


        for(int i = num; i <= limit; i = i + num){
            System.out.println(i);
        }
        


    }
}