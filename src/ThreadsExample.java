class Hi extends Thread{
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

class Hello extends Thread{
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
        Hi obj =  new Hi();
        Hello obj1 = new Hello();

        //using priority we are giving the scheduler the suggestion.
        obj1.setPriority(Thread.MAX_PRIORITY-1);
        obj1.setPriority(4);
        //range of prioritry is 1-10 1 is least and 10 is the highest
        System.out.println(obj1.getPriority());
        obj.start();
        obj1.start();
    }
}
