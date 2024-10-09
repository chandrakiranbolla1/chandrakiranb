class method1{
    public void method1(){

    }
    public void show() throws ClassNotFoundException {

            Class.forName("Anny");
    }
}

class method2 extends method1 {
    public void method2(){

    }
}

class method3 extends method2{
    public void method3(){

    }
}

class method4 extends method3{
    public void method4(){

    }
}

public class ThrowsExample {

    static {
        System.out.println("class loaded");
    }

    public static void main(String[] args) {

        method1 obj = new method1();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }


    }
}
