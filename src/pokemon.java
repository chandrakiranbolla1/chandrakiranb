public class pokemon
{
    String name;
    int level;
    int a1;
    int a2;
    int result;

    void attack(){
        System.out.println(name + "attack!" );
    }
    void addition(){
        result = a1 + a2;
        System.out.println(result);
    }
}