abstract public class Vehicle implements  Actions {
    String  numerRejestracyjny;
    Integer numerVin;
    String kolor;
    Double spalanie;
    Double stanPaliwa;
    Integer stanLicznikaKM;

    public Vehicle(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.spalanie = spalanie;
        this.stanPaliwa = stanPaliwa;
        this.stanLicznikaKM = stanLicznikaKM;
    }

    public double WyliczZasieg()
    {
        return stanPaliwa/spalanie;
    }

}
