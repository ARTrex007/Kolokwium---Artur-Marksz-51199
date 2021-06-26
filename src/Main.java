import vehicle.*;

public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car("GDY 008WC", "123ABC456EF", "biały", 35000, 8, 100, 0, 100, 4, 90);
        Car car2 = new Car("GDY 009WC", "123456789AB", "biały", 45000, 9.2, 97, 120, 150, 90, 100);
        Truck truck1 = new Truck("GDA 928GB", "12345678951", "czarny", 800000, 45, 100, 1500, 1000, 6, 50);
        Truck truck2 = new Truck("GWE 124BA", "4532156TGA7", "srebrny", 900000, 68, 0, 5000, 750, 8, 100);
        Motorcycle motor1 = new Motorcycle("OHW UGB2C", "45687456BC1", "zielony", 25000, 7, 60, 120, 20, 250, true);
        Motorcycle motor2 = new Motorcycle("brak", "brak", "czarny", 7000, 5.5, 5, 7000, 30, 200, false);

        car1.jedź(100);
        car1.tankuj(5);
        System.out.println("Ten pojazd może przejechać jeszcze " + car1.ileKilometrów() + " kilometrów");
        car1.recolor("żółty");

        car2.jedź(50);
        car2.tankuj(153);
        System.out.println("Ten pojazd może przejechać jeszcze " + car2.ileKilometrów() + " kilometrów");
        car2.recolor("niebieski");

        truck1.jedź(500);
        truck1.tankuj(10);
        System.out.println("Ten pojazd może przejechać jeszcze " + truck1.ileKilometrów() + " kilometrów");
        truck1.recolor("ciągnikowy");

        truck2.jedź(50);
        truck2.tankuj(750);
        System.out.println("Ten pojazd może przejechać jeszcze " + truck2.ileKilometrów() + " kilometrów");
        truck2.recolor("pomarańczowy");

        motor1.jedź(200);
        motor1.tankuj(1);
        System.out.println("Ten pojazd może przejechać jeszcze " + motor1.ileKilometrów() + " kilometrów");
        motor1.recolor("wyścigowy");

        motor2.jedź(100);
        motor2.tankuj(20);
        System.out.println("Ten pojazd może przejechać jeszcze " + motor2.ileKilometrów() + " kilometrów");
        motor2.recolor("fioletowy");
    }
}
