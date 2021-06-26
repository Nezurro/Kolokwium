public class Motorcycle extends Vehicle{
    float pojemnoscSilnika;
    int moc;

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
