abstract class A1
{
    public abstract void show();
    public abstract void config();
}

public class Abstractandanonymous {
    public static void main(String[] args) {
        A1 obj = new A1() {
            public void show() {
                System.out.println("in Anonymous inner class A show");
            }
            public void config() {
                System.out.println("in Anonymous inner class A config");
            }
        };
        obj.show();
        obj.config();
    }
}
