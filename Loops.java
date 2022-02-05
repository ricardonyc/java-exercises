class Loops {
    public static void main(String args[]){

        // //012345678910
        // for(int i = 0; i <= 10; i++){
        //     System.out.print(i);
        // }

        // System.out.println();


        // //0246810
        // for(int i = 0; i <= 10; i+=2){
        //     System.out.print(i);
        // }

        // System.out.println();

        // // 15 stars
        // for(int i = 0; i <= 15; i++){
        //     System.out.print("*");
        // }


        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 5; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
   
        // String[] s1 = new String[5];
        // String[] s2 = new String[5];
        // int j = 0;
        // for(int i = 1; i < 10; i+=2){
        //     s1[j] = i + "";
        //     s2[j] = i + 1 + "";
        //     j++;
        // }
        // System.out.println(s1);

        // System.out.println(String.join(", ", s1));
        // System.out.println(String.join(", ", s2));


    }
}
