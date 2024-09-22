class Top
{
    public void show()
    {
        System.out.println("in top show");
    }
}

public class Anonymousinnerclass {
    public static void main(String[] args) {
        Top obj = new Top(){
            public void show()
            {
                System.out.println("in anonymous inward show");
            }
        };
        obj.show();

    }
}
