public class Truck extends Vehicle{
    int ladownosc;

    public Truck(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, Double pojemnoscZbiornika, int ladownosc) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM, pojemnoscZbiornika);
        this.ladownosc = ladownosc;
    }
}
