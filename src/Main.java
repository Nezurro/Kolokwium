public class Main {

    static Car samochod = new Car("GDfasf",521521521, "czarny", 10.0, 50.0,50000,100.0,50000.0, 4);
    static Car samochod2 = new Car("FDdsa",757574,"Fioletowy",5.0,10.0,10000,50.0,30000.0,2);

    static Motorcycle motor1 = new Motorcycle("Dsafasf", 4215215,"Czerwony", 5.0, 6.0,1000,10.0,15000.0,0.75f,70);
    static Motorcycle motor2 = new Motorcycle("241512", 53236,"Czarny", 6.0, 10.0,10020,15.0,18000.0,0.9f,90);

    static Truck truck1 = new Truck("G214124", 85751251, "Czarny",20.0,100.0,50000,200.0,140000.0,100);
    static Truck truck2 = new Truck("H646", 521512, "Czarny",29.0,120.0,10000,250.0,120000.0,150);

    public static void main(String[] args)
    {
        System.out.println(samochod.WyliczZasieg());
        samochod.Jedz(1900);
        System.out.println(samochod.stanPaliwa);
        samochod.Tankuj(10.0);
        System.out.println(samochod.stanPaliwa);
        samochod.Przemaluj("Bialy");

        truck1.Jedz(500);
        truck1.Tankuj(500.0);
        truck1.Przemaluj("Kolorowy");
    }
}
