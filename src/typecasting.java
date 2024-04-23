public class typecasting {
    public static void main(String a[])
    {
        int alpha = 51;
        int beta = 25;
        alpha = beta;
        int gama = ' ';
        beta++;
        System.out.println(alpha);
        System.out.println(gama);

        int c = 257;
        float d =  5.64f;
        int t = (int) d;
        System.out.println(t);

        byte x = 10;
        byte y = 20;
        int result = x * y;
        System.out.println(result);
    }    
}
