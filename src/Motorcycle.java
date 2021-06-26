public class Motorcycle extends Vehicle{
    float pojemnoscSilnika;
    int moc;

    public Motorcycle(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, Double pojemnoscZbiornika, float pojemnoscSilnika, int moc) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM, pojemnoscZbiornika);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.moc = moc;
    }
}
