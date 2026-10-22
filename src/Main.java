
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Toyota");
        car1.setBrand("Corolla");

        Car car2 = new Car();
        car2.setModel("Toyota");
        car2.setBrand("Corolla");

        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
