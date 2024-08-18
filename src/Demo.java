// we cannot make a non-static method with the help of a class name
// Static method can be called directly with the help of a class name
// Static variable can be used inside a static method, we cannot use a non-static variable inside the static method


class Mobile
{
    String brand;
    int price;
    static String name;

    static {
        name = "phone";
        System.out.println("in Static Block");
    }

    Mobile()
    {
        brand = "";
        price = 1500;
        System.out.println("in constructor");
    }

    void show(){
        System.out.println( name + " " + brand + " " + price);
    }

    public static void show1(Mobile obj1){
        System.out.println(name + " " + obj1.brand + " " + obj1.price);
    }
}


class Demo{
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");
        Mobile obj1 = new Mobile();
        obj1.price = 1500;
        obj1.brand = "Apple";
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.price = 1200;
        Mobile.name = "SmartPhone";
        obj2.brand = "Samsung";

        obj1.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);

    }
}