class test

{

    int a;

    int b;

    test(int i, int j)

    {

        a = i;

        b = j;

    }

    void meth(test o)

    {

        o.a *= 2;

        o.b /= 2;

    }

}

class Output

{

    public static void main(String args[])

    {

        test obj = new test(10 , 20);

        obj.meth(obj);

        System.out.println(obj.a + " " + obj.b);

    }

}

