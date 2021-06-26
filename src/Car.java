public class Car extends  Vehicle {
    int liczbaDrzwi;

    public Car(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, Double pojemnoscZbiornika, int liczbaDrzwi) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM, pojemnoscZbiornika);
        this.liczbaDrzwi = liczbaDrzwi;
    }
}

