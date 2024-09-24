interface Alpha
{
    void a1();
    void b1();
    void c1();
    void d1();
}

abstract class Beta implements Alpha
{
    public void c1() {
        System.out.println("I am C");
    }
}

class Meta extends Beta
{

    public void a1() {
        System.out.println("I am A");
    }

    public void b1() {
        System.out.println("I an B");
    }

    public void d1() {
        System.out.println("I am D");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Alpha a = new Meta();
        a.a1();
        a.b1();
        a.c1();
        a.d1();
    }
}
