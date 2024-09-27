@FunctionalInterface
interface First
{
    void show();
}

@FunctionalInterface
interface Second
{
    int add(int a, int b);
}

@FunctionalInterface
interface Third
{
    int multiply(int a,int b);
}

public class Lambdaexp {
    public static void main(String[] args) {

        Second obj = ( a, b) -> a+b;
        Third obj1 = (a,b) -> a*b;
        int addition = obj.add(5,4);
        System.out.println(addition);
        int multiplication = obj1.multiply(5,4);
        System.out.println(multiplication);
    };

}
