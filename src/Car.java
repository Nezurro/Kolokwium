import java.io.Console;

public class Car extends  Vehicle {
    int liczbaDrzwi;

    @Override
    public void Jedz() {
        System.out.println("Pojazd sie porusza");
    }

    @Override
    public void Tankuj() {
        System.out.println("Pojazd został zatankowany");
    }

    @Override
    public void WyliczZasieg() {

    }
}

