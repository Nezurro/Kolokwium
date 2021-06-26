import java.io.Console;

public class Car extends  Vehicle implements  Actions{
    int liczbaDrzwi;

    @Override
    public void Jedz() {
        System.out.println("Pojazd porusza się");
    }

    @Override
    public void Tankuj() {
        System.out.println("Pojazd zsotał zatankowany");
    }
}
