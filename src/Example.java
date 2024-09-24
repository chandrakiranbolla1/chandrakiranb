interface game
{
    void bat();
    void bowl();
    void feild();
    void keep();
    void captain();
}

interface batsman extends game
{
    void bat();
    void feild();
    void keep();
}

interface bowler extends game
{
    void bowl();
    void feild();
}

interface captainwicki extends game
{
    void captain();
}

class play implements game
{

    public void bat()
    {
        System.out.println("This player does Batting");
    }

    public void bowl()
    {
        System.out.println("This player does Bowling");
    }

    public void feild()
    {
        System.out.println("This player does Feilding");
    }

    public void keep()
    {
        System.out.println("This player does Keeping");
    }

    public void captain()
    {
        System.out.println("This player does captain");
    }
}

class cricket
{
    public void playgame(play crick)
    {
        crick.captain();
        crick.bat();
        crick.bowl();
        crick.feild();
    }
}

public class Example {
    public static void main(String[] args) {
//        game cricket = new play();
//        cricket.bat();
//        cricket.bowl();
//        cricket.feild();
//        cricket.keep();
//        cricket.captain();





    }
}
