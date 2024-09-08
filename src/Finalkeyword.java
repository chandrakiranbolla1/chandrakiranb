//class shiva cannot be inherited

final class shiva
{
    public int population()
    {
        int numbers = 1;
        return numbers;
    }
    shiva obj = new shiva();
}

class Janakiram{
    public String son(String name)
    {
        name = "murali and madhusudhan";
        return name;
    }
    public final String firstson(String name)
    {
        name = "Madhusudhan_Rao";
        return name;
    }
}

class pushpa extends Janakiram
{
    public String son(String name)
    {
        name = "madhusudhan and muralikrishna ";
        return name;
    }

    public String secondson(String name)
    {
        name = "Murali krishna";
        return name;
    }
}
public class Finalkeyword {
    public static void main(String[] args) {

        // this is an example of final key word in a variable,
        // where the "num" here cannot be changed because of the final keyword.
        final int num = 9;
        System.out.println(num);
        Janakiram obj = new Janakiram();
        //obj.firstson("madhusudhan");
        obj = new pushpa();
        System.out.println(obj.son(""));
    }
}