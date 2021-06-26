public class Main {

    static Car samochod = new Car("GDfasf",521521521, "czarny", 10.0, 50.0,50000,4);

    public static void main(String[] args)
    {
        System.out.println(samochod.WyliczZasieg());
        samochod.Jedz(10);
    }
}
