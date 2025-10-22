// Implement class mechanism (Create a class, methods and invoke them inside main method).
import java.util.Scanner;

class Swapping{
    void  swap(int x,int y){
        int temp ;
        temp = x;
        x = y;
        y = temp;
        System.out.println(" after swaping this is in swap method ");
        System.out.println("x = " +x+" y = "+y);


    }
}
class Exercise3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x :");
        int x = sc.nextInt();
        System.out.print("Enter the value of y :");
        int y = sc.nextInt();
        System.out.println(" before swaping this is in main method ");
        System.out.println("x = " +x+" y = "+y);
        Swapping sw = new Swapping();
        sw.swap(x,y);
        System.out.println(" after swaping this is in main method ");
        System.out.println("x = " +x+" y = "+y);
        sc.close();

    }
}



// * Implement constructor.


class DemoConstructor{
    DemoConstructor(){
        System.out.println("If this printed means constructor is envoked");
    }
}
public class Exercise3 {
    public static void main(String[] args){
        DemoConstructor obj = new DemoConstructor();

    }
}


// * Implement method overloading.
class Demo{
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
}
class Exercise3{
    public static void main(String[] args){
    Demo D1 = new Demo();
    
    int sum = D1.add(1,2);
    int sum2 =D1.add(1,2 ,3);
    System.out.println("sums are "+sum+ "  "+sum2);

    }
}
    

//  * Implement method overloading.


class Student{
    String name;
    int age;
    Student(){
        name = "Unknown";
        age = 0;

    }
    Student(String n){
        name = n;
        age = 0;
    }
    Student(String n,int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("The name of the student is "+name+ " the age is "+age);
    }
}
class Exercise3{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("kumar");
        Student s3 = new Student("kumar",19);
        s1.display();
        s2.display();
        s3.display();

    }
}