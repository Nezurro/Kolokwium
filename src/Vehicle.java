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

    public double WyliczZasieg() {
        return stanPaliwa/spalanie*100;
    }

    @Override
    public void Jedz(int kilometry) {
        if(WyliczZasieg() >= kilometry)
        {
            stanLicznikaKM += kilometry;
            stanPaliwa -= spalanie*kilometry/100;
        }else System.out.println("Brakuje paliwa aby przejechac taki dystans");

    }

    @Override
    public void Tankuj(Double iloscPaliwa) {
        stanPaliwa += iloscPaliwa;
        System.out.println("Pojazd zostal zatankowany");
    }
}
