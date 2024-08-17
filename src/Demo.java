class Mobile
{
    String brand;
    int price;
    String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        obj2.name = "smart phone";

        obj1.show();
        obj2.show();

    }
}