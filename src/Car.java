public class Car extends  Vehicle {
    int liczbaDrzwi;

    public Car(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, Double pojemnoscZbiornika, Double wartosc, int liczbaDrzwi) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM, pojemnoscZbiornika, wartosc);
        this.liczbaDrzwi = liczbaDrzwi;
    }
}

