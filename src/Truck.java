public class Truck extends Vehicle{
    int ladownosc;

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
