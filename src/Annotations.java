//Annotations help us to write the methods easily override and other things easily
// we also have annotations like deprecated etc
class One
{
    public void TheClassInTheUpperOne()
    {
        System.out.println("This is the first class, as in the the top class");
    }
}

class Two extends One
{
    @Override
    public void TheClassInTheUpperOne()
    {
        System.out.println("This the the second class, as in the second one in the file");
    }
}
public class Annotations {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.TheClassInTheUpperOne();
    }
}
