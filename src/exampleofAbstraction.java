 abstract class Abstractexample {

    public abstract void driving();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Music playing..");
    }
}

abstract class car extends Abstractexample
{

    public void fly()
    {
        System.out.println("The car is Flying");
    }
}

class BMW extends car
{
    public void driving()
    {
        System.out.println("The car is driving");
    }
}

public class exampleofAbstraction
{
    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.playMusic();
        obj.driving();
        obj.fly();

    }

}

// Abstract class
abstract class Animal
{
    public abstract void animalSound();

    public void sleep()
    {
        System.out.println("zzz");
    }
}

// Subclass (inherit from Animal)

 class Pig extends Animal
 {
     public void animalSound()
     {
         System.out.println("The pig says: wee wee");
     }
 }

 class Main{
     public static void main(String[] args) {
         Pig myPig = new Pig();
         myPig.animalSound();
         myPig.sleep();
     }
 }