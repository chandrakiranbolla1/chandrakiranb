import java.nio.channels.ScatteringByteChannel;

public class exceptions1example {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;


        int nums[] = new int[5];
        String str = null;


        try
        {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by Zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Going out of Range");
        }
        catch (Exception e)
        {
            System.out.println("something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("bye");


    }
}