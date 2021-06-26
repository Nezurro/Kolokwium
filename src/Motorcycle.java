public class Motorcycle extends Vehicle{
    float pojemnoscSilnika;
    int moc;

    public Motorcycle(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, float pojemnoscSilnika, int moc) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.moc = moc;
    }

    @Override
    public void Jedz() {
        System.out.println("Pojazd sie porusza");
    }

    @Override
    public void Tankuj() {
        System.out.println("Pojazd został zatankowany");
    }


    @Override
    public double WyliczZasieg() {

        return stanPaliwa/spalanie*100;
    }
}
