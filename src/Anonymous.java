import Gat.*;

class C
{
    public C()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in show");
    }
}

public class Anonymous {
    public static void main(String[] args) {
//        This is the tradational method for object creation where obj is a refrence varibale in stack memory
//        C obj = new C();
//        obj.show();
        //Anonymous object can be called only once
        new C();  // This is to create an Anonymous object
        new C().show();  // and this is to call both objects and its methods

        B1 obj = new B1();
        System.out.println(obj.B1(" "));
    }
}
