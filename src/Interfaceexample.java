//class to class         extends
//class to interface     implements
//interface to interface extends

interface Higher
{
    int age =25;        //static and final
    String area="austin";
     void show();
     void config();
}
interface middle
{
    void run();

}

interface secondmiddle extends middle
{

}

class lower implements Higher,secondmiddle
{

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("running..");
    }
}



public class Interfaceexample {
    public static void main(String[] args) {
        Higher obj;
        obj = new lower();
        obj.show();
        obj.config();

        middle obj1 = new lower();
        obj1.run();

        System.out.println(Higher.area);

    }
}
