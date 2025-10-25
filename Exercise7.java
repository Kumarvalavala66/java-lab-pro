// * Creates threads by extending Thread class (and implementing Runnable).
class ThreadOne extends Thread{
    ThreadOne()
    {
        super();

    }
    public void run(){
        for (int i =0;i<5;i++){
            System.out.println("hi");
            try{
                sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("thread one interepted ");
            }
        }
    }
}

class ThreadTwo extends Thread{
    ThreadTwo()
    {
        super();
    }
    public void run(){
        for (int i =0;i<5;i++){
            System.out.println("hello");
            try{
                sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("thread two interepted ");
            }
        }
    }
}

class ThreadThree extends Thread{
    ThreadThree()
    {
        super();
    }
    public void run(){
        for (int i =0;i<5;i++){
            System.out.println("good Morning");
            try{
                sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("thread three interepted ");
            }
        }
    }
}
class Exercise7{
    public static void main(String[] args){
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        try{ t1.start();
            t1.sleep(5);
            t2.start();
            t2.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println(e+"problem");
        }
        t3.start();
    }
}




//  Write a program illustrating isAlive and join ()



class Mythread extends Thread{                  //this create a new thread 
    public void run(){                  
        try{
            for (int i=0;i<5;i++){
            System.out.println("this is "+i+" iteration ");
            sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("some error babu "+e);
        }
    }
}
class Exercise7{
    public static void main(String[] args){
        Mythread m1 = new Mythread();        //creating obj for Mythread class
        Mythread m2 = new Mythread();          //creating obj for Mythread class
        System.out.println("Is m1 running "+m1.isAlive());              //check whether  the  thread m1 running 
        m1.start();                                 //start void run method in Mythread
        try{
            m1.join();                                  // stops main thread until m1 completly finished
        }
        catch(InterruptedException e){
            System.out.println("some error babu "+e);
        }
        m2.start();
        System.out.println("Is m2 running "+m2.isAlive());
        System.out.println("Is m1 running "+m1.isAlive());
    }
}


//  Write a Program illustrating Daemon Threads.

class Mythread extends Thread{
    public String name ;
    public int  num ;

    Mythread(String name,int num ) {
        this.name = name;
        this.num = num; 
    }
    public void run(){
        
        if (num == 1){
            for (int i =1 ;i<=5;i++){
            System.out.println("name of obj "+name+ " # "+i);
            }
        }
        else{
            for (int i =1 ;i<=100;i++){
            System.out.println("name of obj "+name+ " # "+i);
        }
    }
}
}

class Exercise7{  
        public static void main(String[] args){
        Mythread m1 = new Mythread("m1",1);
        Mythread m2 = new Mythread("m2",1);
        Mythread daemon = new Mythread("daemon",2);
        
        m1.start();
        
        m2.start();
        daemon.setDaemon(true);
        System.out.println("is daemon is a daemon thread "+daemon.isDaemon());
        daemon.start();
        
        
    }
}


// * Producer Consumer Problem.
class A{
    public int num;
    public boolean Valset = false;
    public synchronized void set(int num){
        while (Valset){
            try {
                wait();
            } catch (Exception e) {
            }
        }
       
            this.num = num;
            System.out.print("The producer # "+num);
            System.out.println(" set "+num);
            Valset = true;
            notifyAll();
        
    }

    public synchronized  void get(){
        while(!Valset){
            try {
                wait();
            } catch (Exception e) {
            }
        }
            System.out.print("The Consumer # "+num);
            System.out.println(" get "+num);
            Valset = false;
        
        notifyAll();
    }
}

class Producer extends Thread{
    A num;
    Producer(A num){
        this.num = num;
    }
    public  void run(){
        for (int i = 0; i<= 20;i++){
            
            try {
                sleep(1000);
            } catch (Exception e) {
                
            }
            num.set(i);

        }
    }
}
class Consumer extends Thread{
    A num;
    Consumer(A num){
        this.num = num;
    }
    public  void run(){
        for (int i = 0; i<= 20;i++){
            
            num.get();
            try {
                sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}
class Exercise7{
    public static void main(String[] args) {
        A num = new A();
        Consumer cmr = new Consumer(num);
        Producer pro = new Producer(num);
        pro.start();
        cmr.start();
    }
}