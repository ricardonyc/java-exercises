class Grades {
    public static void main(String args[]){

        int grade  = 75;

        if(grade >= 90){
            System.out.println("A");
        } else if (grade >= 80){
            System.out.println("B");
        } else if(grade >= 70){
          System.out.println("C");  
        } else if(grade >= 55){
          System.out.println("D");
        } else if(grade <= 55){
          System.out.println("F");
        }
    

        int day = 5;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: 
                System.out.println("Enter a number between 1-7");
                break;
        }

        int num = 6;

        if(num % 2 == 1){
          System.out.println("Odd");
        } else if(num % 2 == 0 && num <= 5 && num >= 2){
          System.out.println("Not Cool");
        } else if(num % 2 == 0 && num >= 6 && num <= 20){
          System.out.println("Cool");
        } else if(num % 2 == 0 && num > 20){
          System.out.println("Not Cool");
        } 





    }
}
;



// if => if statement
// elf => else if
// el => else
// fel => if - else if - else
// so => system out println