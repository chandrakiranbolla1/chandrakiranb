public class ThreadsExample {
    public static void main(String[] args) {
        Runnable obj = () -> {
                for (int i=0;i<5;i++)
                    System.out.println("Hi");
                try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
            };
        Runnable obj1 = () ->{
            for (int i =0;i<5;i++)
                System.out.println("Hello");
            try {Thread.sleep(10);}catch (InterruptedException e) {throw new RuntimeException(e);}
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
