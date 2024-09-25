enum Status{
    Running,Failed,Pending,Success;
}

public class Enum {
    public static void main(String[] args) {
        int i = 5;
        Status [] ss = Status.values();
        //ordinal is the order of how we gave the numbers
        //System.out.println(s.ordinal());
        System.out.println(ss[0]);

        for (Status s:ss)
        {
            System.out.println(s+ " : "+s.ordinal());
        }
    }
}
