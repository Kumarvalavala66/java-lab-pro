
// // Describes exception handling mechanism.
<<<<<<< HEAD
// import java.util.Scanner;

// class Exercise6{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// try{
// float div = a/b;
// System.out.println("the answer of "+a+ "/"+b+" is "+div);
// }
// catch(ArithmeticException e){
// System.out.println("Denomenator is 0 " +e);
// }
// finally{
// System.out.println("this block will execute no matter what ");
// }
// sc.close();
=======
import java.util.Scanner;
class Exercise6{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
try{
float div = a/b;
System.out.println("the answer of "+a+ "/"+b+" is "+div);
}
catch(ArithmeticException e){
System.out.println("Denomenator is 0 " +e);
}
finally{
System.out.println("this block will execute no matter what ");
}
sc.close();
>>>>>>> 4fc6f1f802a7cc737232e99f786d6b230ace44e6

}
}

// // Illustrating Multiple catch clauses.

<<<<<<< HEAD
// import java.util.*;

// class Exercise6{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// try{
// System.out.println("ENTER A NUMBER");
// int a = sc.nextInt();
// System.out.println("the number entered is "+a);
// }
// catch( InputMismatchException e){
// System.out.println("enter a number "+e);
// }
// int arr[] = new int[2];
=======
import java.util.*;
class Exercise6{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
try{
System.out.println("ENTER A NUMBER");
int a = sc.nextInt();
System.out.println("the number entered is "+a);
}
catch( InputMismatchException e){
System.out.println("enter a number "+e);
}
int arr[] = new int[2];
>>>>>>> 4fc6f1f802a7cc737232e99f786d6b230ace44e6

try{
arr[5] = 12;
}
catch(ArrayIndexOutOfBoundsException e){
System.err.println("the index don't exist"+e);
}
finally{
System.out.println("this block will execute no matter what ");
}
sc.close();
}
}

// // * Creation of Java Built-in Exceptions.
<<<<<<< HEAD
// class Exercise6 {
//     public static void main(String[] args) {
//         int n = 0;
//         int m = 1;
//         try {
//             float result = m / n;
//             System.out.println("the result is " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("NOT possible " + e);
//         } finally {
//             System.out.println("this block will execute without fail ");
//         }
//     }
// }

// // * Creation of User Defined Exception
// import java.util.Scanner;

// class MyException extends Exception {
//     MyException() {
//         super("this is not good ");
//     }
// }

// class Exercise6 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive value :");
//         try {
//             int num = sc.nextInt();
//             if (num <= 0) {
//                 throw new MyException();
//             }
//         } catch (MyException e) {
//             System.out.println(e + "enter a positive number ");
//         } finally {
//             System.out.println("this block is nonstop \"finally block \"");
//         }
//     }
// }
=======
class Exercise6{
public static void main(String[] args){
int n =0;
int m = 1;
try{
float result = m/n;
System.out.println("the result is "+result);
}
catch(ArithmeticException e){
System.out.println("NOT possible "+e);
}
finally{
System.out.println("this block will execute without fail ");
}
}
}

//  * Creation of User Defined Exception
import java.util.Scanner;
class MyException extends Exception{
    MyException(){
        super("this is not good ");
    }
}
class Exercise6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive value :");
        try{
            int num = sc.nextInt();
            if(num <= 0){
                throw new MyException();
            }
        }
        catch(MyException e){
            System.out.println(e+"enter a positive number ");
        }
        finally{
            System.out.println("this block is nonstop \"finally block \"");
        }        
    }
}
>>>>>>> 4fc6f1f802a7cc737232e99f786d6b230ace44e6
