public class Car extends  Vehicle {
    int liczbaDrzwi;

    public Car(String numerRejestracyjny, Integer numerVin, String kolor, Double spalanie, Double stanPaliwa, Integer stanLicznikaKM, int liczbaDrzwi) {
        super(numerRejestracyjny, numerVin, kolor, spalanie, stanPaliwa, stanLicznikaKM);
        this.liczbaDrzwi = liczbaDrzwi;
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

        return stanPaliwa/spalanie;
    }
}

