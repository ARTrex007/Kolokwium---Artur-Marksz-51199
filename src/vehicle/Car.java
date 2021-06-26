package vehicle;

public class Car extends Vehicle
{
    int drzwi, konieMechaniczne;

    public Car(String nrRej, String nrVin, String kolor, double price,
               double spalanie, double stanZbiornika, double licznik,
               double pojemnoscZbiornika, int drzwi, int konieMechaniczne)
    {
    super(nrRej, nrVin, kolor, price, spalanie, stanZbiornika, licznik, pojemnoscZbiornika);
    this.drzwi = drzwi; this.konieMechaniczne = konieMechaniczne;
    }
}
