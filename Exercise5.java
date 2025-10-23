
// * Example for "super" keyword.
class A{
    int i =10;
    A(){
        System.out.println("---- This is from constructor in A class ------");
    }
    void view(){
        System.out.println("-------- This is from view method in class A ---------");
        System.out.println("the value of i = "+i);
    }
}
class B extends A{
    int j;
    B(int j){
        super();
        this.j = j;
    }
    void display(){
        super.view();
        System.out.println("-------- This is from Display method in class B ---------");
        System.out.println("the value of i = "+super.i);
        System.out.println("the value of j = "+j);
    }

}
class Exercise5{
    public static void main(String[] args){
    B b1 = new B(17);
    b1.display();

    }
}


// Implement Interface.
interface Add {
    int addition();
}
interface Sub {
    int Subtraction();
}
class A implements Add,Sub{
    int i,j;
    A(int i,int j){
        this.i = i;
        this.j = j;

    }
    public int addition(){
        System.out.println("The sum is "+(i+j));
        return (i+j);
    }
    public int  Subtraction(){
        System.out.println("The diff is "+(i-j));
        return (i-j);
    }
}
public class Exercise5{
    public static void main(String[] args){
        A a1 = new A(12,34);
        a1.Subtraction();
        a1.addition();

    }
}


// implements Runtime polymorphism.
class A{
    void Display(){
        System.out.println("this method is executed from class A");
    }
}
class B extends A{
    void Display(){
        System.out.println("this method is executed from class B");
    }
}
class C extends B{
    void Display(){
        System.out.println("this method is executed from class C");
    }
}
class Exercise5{
    public static void main(String[] args){
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        A ref;
        ref = a1;
        ref.Display();
        ref = b1;
        ref.Display();
        ref = c1;
        ref.Display();
    }
}