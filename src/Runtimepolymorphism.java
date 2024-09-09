class Parentclass{

    protected String color = "dusky ";
    protected String height = "six_feet ";
    protected String weight = "According to BMI ";
    protected String output = color+height+weight;
    public void characters(String output)
    {
        output = color+height+weight;
    }
}

class X
{
    public void show()
    {
        System.out.println("in X show");
    }
}

class Y extends X
{
    public void show()
    {
        System.out.println("in Y show");
    }
}

class Z extends X
{
    public void show()
    {
        System.out.println("in Z show");
    }
}


public class Runtimepolymorphism
{
    public static void main(String[] args)
    {
//        X obj = new Y();
//        obj.show();

        X obj = new X();
        obj.show();

        //here we dont know which one is going to be printed
        //so this is known as Run-Time ploymorphism
        obj = new Y();
        obj.show();



        Parentclass obj1 = new Parentclass();
        System.out.println(obj1.output);

    }
}
