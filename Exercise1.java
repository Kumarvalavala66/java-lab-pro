//  * Display default value of all primitive data type of JAVA.


import java.lang.*;  //optional
class Exercise1{
    public static void main(String[] args){
        // this is code for displaying data size of primitive datatypes
        System.out.println("the size of byte is : "+Byte.SIZE/8+" bytes");
        System.out.println("the size of integer is : "+Integer.SIZE/8+" bytes");
        System.out.println("the size of short is : " +Short.SIZE/8+" bytes");
        System.out.println("the size of long is : "+Long.SIZE/8+" bytes");
        System.out.println("the size of char is : "+Character.SIZE/8+" bytes");
        System.out.println("the size of float is : "+Float.SIZE/8+" bytes");
        System.out.println("the size of double is : "+Double.SIZE/8+" bytes");
        System.out.println("the size of boolean is :not precise ");
    }
}


//Display the roots of a quadratic equation ax^2+bx=0.

import java.util.Scanner;
import java.lang.Math;

class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.printf("The roots are r1 = %.2f and r2 = %.2f%n", r1, r2);
        } else if (d == 0) {
            double r1 = -b / (2*a);
            System.out.printf("The root is r = %.2f%n", r1);
        } else {
            System.out.println("The roots are imaginary.");
        }

        sc.close();
    }
}
