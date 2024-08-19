class Human{
    private String name = "ChandraKiran_Bolla";
    private int age = 25;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}


public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();

        System.out.println(obj.getName() +" " +obj.getAge() );

    }
}
