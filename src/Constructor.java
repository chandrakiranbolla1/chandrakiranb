class Human1{
    int age;
    String name;
    String LastName;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human1(){
        name = "Shyam";
        age = 25;
    }

    //Parameterized Constructor
    public Human1(int a, String n,String L){
        age = a;
        name = n;
        LastName = L;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Human1 obj = new Human1();
        Human1 obj1 = new Human1(25,"Ram","Seetha");

        //Line 50 prints null values for string in last name cuz it is not there in obj constructor
        System.out.println(obj.getName() + obj.LastName + " : "+ obj1.getAge());
        System.out.println(obj1.getName()  +obj1.LastName + " : " + obj1.getAge() );



    }
}
