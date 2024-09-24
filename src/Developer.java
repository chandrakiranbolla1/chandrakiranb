interface Computer1
{
     void code();
}


class Laptop1 implements Computer1
{
    public void code(){
        System.out.println("code,compile,run");
    }
}

class Desktop implements Computer1
{
    public void code()
    {
        System.out.println("code,compile,run : Faster");
    }
}

class dev
{
    public void devApp(Computer1 lap)
    {
        lap.code();
    }
}

public class Developer {
    public static void main(String[] args) {

        Computer1 lap = new Laptop1();
        Computer1 desk = new Desktop();
        dev chandra = new dev();
        chandra.devApp(lap);
    }

}
