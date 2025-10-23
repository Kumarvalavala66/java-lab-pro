//  Implement Single Inheritance.
class Demo {
    int a;
    int b;
    void display(){
        System.out.println("The value of A = "+a+" B = "+b+" This is from Demo class");
    }
}
class Inherited extends Demo{
    int c;
    void show(){
    System.out.println("This is from Inherted classs the value of c = "+c);
    }
    void add(){
        System.out.println("The value of A+B+C = "+(a+b+c)+" This is from Inherited class");
    }
}
class Exercise4{
    public static void main(String[] args){
        Demo D1 = new Demo();
        D1.a = 1;
        D1.b = 2;
        Inherited I1 = new Inherited();
        I1.a = 3;
        I1.b = 4;
        I1.c = 5;
        D1.display();
        I1.show();
        I1.add();
    }
}
//Implement Multilevel Inheritance
class A{
    String str = "";
    A(){
        str = "This";
    }
}
class B extends A{
        B(){
            str = str.concat( " is");
        }
}
class C extends B{
        C(){
            str = str.concat( " Multilevel");
        }
}
class D extends C{
        D(){
            str = str.concat( " Inheritence");
        }
        void display(){
            System.out.println(str);
        }
}

class Exercise4{
    public static void main(String[] args){
        D d1 = new D();
        d1.display();
    }
}

//  * Abstract class to find areas of different shapes.
abstract class Area{
    abstract void area_cricle(double r);
    abstract void area_rectangle(double l,double w);
    abstract void area_triangle(double b,double h);
    abstract void area_square(double s);
}
class Find_areas extends Area{
    void area_cricle(double r){
        double area = Math.PI*r*r;
        System.out.printf("The area of Circle is %.2f sq.units %n", area);
    }

    void area_rectangle(double l,double b){
        double area = l*b;
        System.out.println("The area of Rectangle is "+area+" sq.units");
    }

    void area_square(double l){
        double area = l*l;
        System.out.println("The area of Square is "+area+" sq.units");
    }


    void area_triangle(double b,double h){
        double area = 0.5 * b * h;
        System.out.println("The area of Triangle is "+area+" sq.units");
    }

}
class Exercise4{
    public static void  main(String [] args){
        Find_areas F1 = new Find_areas();
        F1.area_cricle(5);
        F1.area_rectangle(5,10);
        F1.area_square(5);
        F1.area_triangle(5,10);
        
    }
}