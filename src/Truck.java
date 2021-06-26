public class Truck extends Vehicle{
    int ladownosc;

    public Truck(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, int ladownosc) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM);
        this.ladownosc = ladownosc;
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
