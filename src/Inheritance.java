 class Bolla extends Podila{
    public String Bolla(String FK){

        return FK;

    }
}


public class Inheritance {
    public static void main(String[] args) {

        Bolla obj = new Bolla();

        System.out.println(obj.Bolla("MadhusudhanRaoBolla") + obj.Podila("Shyamalatha"));


    }

}
