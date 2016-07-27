package com.tonyrich;

/**
 * Created by localadmin on 7/27/16.
 */
public class Name {
    public static int add( int x, int y){
        return x + y;
    }
    public static int sumArray(int[] nums) {

        int total = 0;
        for(int n:nums){
            total += n;
        }
        return total;
    }


    public static void main(String[] args){

        int sum = add(2, 3);

        System.out.println("sum: " + sum);

        int[] evens = { 2, 4, 6};
        int bbbb = sumArray(evens);
        System.out.println("Sum of evens: " + bbbb);
        
        byte b = 30;
        short s = 23000;
        int i = 5555;
        long l = 10L;
        float f = 3.12f;
        double d = 2.0d;
        char c = 'x';
        boolean bl = true;

        int ii = b;
        byte bb = (byte) i;
        float f1 = (float) d;


        String s1 = "Hello World";
        int [] nums = {1,2,3};
        int[] odds = new int[3];
        odds[0] = 3;
        odds[1] = 2;
        odds[2] = (int) 3.1;
        System.out.println("odds: " + odds);

        if(b < 50){
            System.out.println("less than 50");
        }else{
            System.out.println("larger than 50");
        }

        switch (b) {
            case 15:
                System.out.println("10");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("default");

        }

        for (byte j = 10; j > 0; j--){
            System.out.println("j is: " + j);
        }

        byte jj = 10;
        while(jj>0){
            System.out.println("Second while loop: " + jj);
            jj--;
        }

        for (byte jjj = 0; jjj < odds.length; jjj++){
            System.out.println("jjj: " + odds[jjj]);

        }

        for (int y:odds){
            System.out.println("y is: " + y);
        }
    }


}
