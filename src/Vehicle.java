abstract public class Vehicle implements  Actions {
    String  numerRejestracyjny;
    Integer numerVin;
    String kolor;
    Double spalanie;
    Double stanPaliwa;
    Integer stanLicznikaKM;
    Double pojemnoscZbiornika;
    Double wartosc;

    public Vehicle(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, Double pojemnoscZbiornika, Double wartosc) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.spalanie = spalanie;
        this.stanPaliwa = stanPaliwa;
        this.stanLicznikaKM = stanLicznikaKM;
        this.pojemnoscZbiornika = pojemnoscZbiornika;
        this.wartosc = wartosc;
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
        if(stanPaliwa + iloscPaliwa >pojemnoscZbiornika)
        {
            System.out.println("Zatankowano:" + (pojemnoscZbiornika-stanPaliwa) + " Pojazd zatankowany do pelna");
            stanPaliwa = pojemnoscZbiornika;
        }else
        stanPaliwa += iloscPaliwa;
        System.out.println("Pojazd zostal zatankowany");
    }

    @Override
    public void Przemaluj(String kolor)
    {
        this.kolor = kolor;
        wartosc += wartosc*0.05;
        System.out.println("Przemalowano pojazd na kolor:" +kolor);
        System.out.println("Obecna wartosc pojazdu wynosi: " + wartosc);
    }

}
