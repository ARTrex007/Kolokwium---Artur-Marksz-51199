package vehicle;

public class Truck extends Vehicle
{
    int ilośćKol;
    double ładownosc;

    public Truck(String nrRej, String nrVin, String kolor, double price,
                 double spalanie, double stanZbiornika, double licznik,
                 double pojemnoscZbiornika, int ilośćKol, double ladownosc)
    {
        super(nrRej, nrVin, kolor, price, spalanie, stanZbiornika, licznik, pojemnoscZbiornika);
        this.ilośćKol = ilośćKol; this.ładownosc = ladownosc;
    }
}