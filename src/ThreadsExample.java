class Greeting{
    public void run(){
        System.out.println("Greeting everyone");
    }
}

class Hi extends Greeting implements Runnable{
    public void run(){
        for (int i = 0;i<10;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello extends Greeting implements Runnable{
    public void run(){
        for (int i=0;i<10;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


public class ThreadsExample {
    public static void main(String[] args) {
        Runnable obj =  new Hi();
        Hello obj1 = new Hello();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        //using priority we are giving the scheduler the suggestion.
        t1.setPriority(Thread.MAX_PRIORITY-1);
        t2.setPriority(4);
        //range of prioritry is 1-10 1 is least and 10 is the highest
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }
}
