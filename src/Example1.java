//Home and ppl

interface House
{
    void people();
    void male();
    void female();
}

class Members implements House
{

    public void people()
    {
        System.out.println("Total no.of People is 2");
    }

    public void male() {
        System.out.println("Total No.of Male is 1");
    }

    public void female() {
        System.out.println("Total No.of Female is 1");
    }
}


public class Example1 {
    public static void main(String[] args) {
        House Living = new Members();
        Living.male();
        Living.female();
        Living.people();
    }

}
