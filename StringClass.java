import java.util.Scanner;

class StringClass {
   public static void main(String args[]){
       String fullname;
       String fname;
       String lname;
       String str1 = "Friday";
       String str2 = "friday";

       Scanner scan = new Scanner(System.in);
    //    System.out.println("Enter your first name: ");
    //    fname = scan.nextLine();
    //    System.out.println("Enter your last name: ");
    //    lname = scan.nextLine();

    //    fullname = fname.concat(lname);
       // ! STRINGS are immutable
    //    System.out.println(fullname.length());
    //    // ! trim wont work!
    //    System.out.println(fullname.trim());
    //    System.out.println(fullname.length());

    //    System.out.println(fname.charAt(2));
    //    System.out.println(fname.indexOf("o"));
    //    System.out.println(fname.lastIndexOf("a"));
    //    System.out.println(fname.isEmpty());
        // System.out.println(fname.contains("rdo"));
        // like slice, takes everything from the given index to the end
        // System.out.println(fname.substring(3));
        // starting from index 4 and ending at index 7 BUT does not return index 7
        // System.out.println(fname.substring(4, 7));

        // System.out.println(str1.equals(str2));
        // ignores lower or uppercase
        // System.out.println(str1.equalsIgnoreCase(str2));

        

        int[] names = {1, 2, 3, 4 ,5};
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

   }
}

