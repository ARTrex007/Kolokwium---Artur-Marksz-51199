package vehicle;

public class Motorcycle extends Vehicle
{
    int pojemność;
    boolean homologacja;

    public Motorcycle(String nrRej, String nrVin, String kolor, double price,
                      double spalanie, double stanZbiornika, double licznik,
                      double pojemnoscZbiornika, int pojemność, boolean homologacja)
    {
        super(nrRej, nrVin, kolor, price, spalanie, stanZbiornika, licznik, pojemnoscZbiornika);
        this.pojemność = pojemność; this.homologacja = homologacja;
    }
}
