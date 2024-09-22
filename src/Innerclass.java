

class Upperclass
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }
    static class Downclass
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

public class Innerclass {

    public static void main(String[] args) {

        Upperclass obj = new Upperclass();
        obj.show();

        //non-static method
//        Upperclass.Downclass obj1 = obj.new Downclass();
//        obj1.config();

    }
}
