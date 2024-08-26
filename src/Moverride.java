class Chandra1{
    public String Chandrak(String Chandrakiran){
        return "Chandrakiran";
    }
}

class Chandra2 extends Chandra1{
    public String Chandrak(String ChandraKiranBolla){
        return "ChandraKiranBolla";
    }
}


public class Moverride {
    public static void main(String[] args) {

        Chandra2 obj = new Chandra2();
        System.out.println(obj.Chandrak(""));


    }
}
