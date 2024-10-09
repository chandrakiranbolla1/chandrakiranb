class ChandraKiranException extends RuntimeException
{
    public ChandraKiranException(String String)
    {
        super(String);
    }
}

public class Throwexample2 {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if (j==0)
                throw new ChandraKiranException("I dont want to print zero");
        }
        catch (ChandraKiranException e){
            j = 18/i;
            System.out.println("thats the default output" + e);
        }
        catch (ArithmeticException e){
            j = 18/i;
            System.out.println("thats the default output" + e);
        }
        catch (Exception e) {
            System.out.println("something went wrong" + e);
        }
        System.out.println(j);

    }
}
