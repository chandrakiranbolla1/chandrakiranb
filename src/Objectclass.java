import java.util.Objects;

class Laptop
{
    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    String model;
    int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

}

public class Objectclass
{
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "lenovo yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "lenovo yoga1";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);


        System.out.println(result);
    }
}
