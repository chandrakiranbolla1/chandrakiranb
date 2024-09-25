//enum cannot be extended as a class

enum Statuses
{
    Running,Failed,Pending,Success;
}

public class Enumsecondpart {
    public static void main(String[] args)
    {
        Statuses s = Statuses.Success;

        switch (s)
        {

            case Running -> {
                System.out.println("All Good");
                break;
            }

            case Pending -> {
                System.out.println("Please wait");
                break;
            }

            case Failed -> {
                System.out.println("Try Again");
                break;
            }

            case Success -> {
                System.out.println("Done");
                break;
            }
        }

    }
}
