public class if_else {
    public static void main(String[] args) {
        
        int x = 18;
        int y = 7;
        int z = 5;
    

        // if (x > y && y > z)  //11-20
        // {
        //     System.out.println("Chandra");
        //     System.out.println("kiran Bolla");
        // } 
        // else
        // System.out.println("kiran");


        if (x > y && x > z)
        System.out.println("x is greater: " + x );
        else if (y > x && y > z)
        System.out.println("y is greater:" + y);
        else
        System.out.println("z is greater:" + z);
    }
    
}
