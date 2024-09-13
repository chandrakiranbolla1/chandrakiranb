class Up
{
    public void show1()
    {
        System.out.println("in A show");
    }

}

class Down extends Up
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class Downandupcasting {
    public static void main(String[] args)
    {
        //Upcasting
        Up obj = (Up)new Down();
        obj.show1();

        //Downcasting
        Down obj1 = (Down) obj;
        obj1.show2();


//         This is known as typecasting
//        double d = 4.5;
//        int i = (int) d;
//
//        System.out.println(i);
    }
}
