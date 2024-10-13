class Hi extends Thread{
    public void run(){
        for (int i = 0;i<100;i++)
        {
            System.out.println("Hi");
        }
    }
}

class Hello extends Thread{
    public void run(){
        for (int i=0;i<100;i++)
        {
            System.out.println("Hello");
        }
    }
}


public class ThreadsExample {
    public static void main(String[] args) {
        Hi obj =  new Hi();
        Hello obj1 = new Hello();

        obj1.setPriority(Thread.MAX_PRIORITY-1);
        //range of prioritry is 1-10 1 is least and 10 is the highest
        System.out.println(obj1.getPriority());
        obj.start();
        obj1.start();
    }
}
