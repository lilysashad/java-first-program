package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int[] array = {1,2,3,4};
        int num = 2;
        System.out.println(add(array));
        System.out.println(doubleTheNumber(num));
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return 2 * number;
    }

    private static int add(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}
