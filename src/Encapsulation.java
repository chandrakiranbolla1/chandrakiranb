// Method name should define what is your intention,Most of the time it is not about writing code it is also
// about reading code.  getName, setName are considered standards
// variable getName is getter
// Variable setName is Setter

class Human{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge()
    {
        return age;
    }
}


public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("ChandraKiran_Bolla");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
