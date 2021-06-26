public class Truck extends Vehicle{
    int ladownosc;

    public Truck(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, Double pojemnoscZbiornika, Double wartosc, int ladownosc) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM, pojemnoscZbiornika, wartosc);
        this.ladownosc = ladownosc;
    }
}
