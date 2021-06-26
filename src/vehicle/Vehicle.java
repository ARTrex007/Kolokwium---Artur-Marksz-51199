package vehicle;

public abstract class Vehicle implements VehicleInterface
{
    public String nrRej, nrVin, kolor;
    public double price, spalanie, stanZbiornika, licznik; //spalanie na 100 kilometrów!
    public double pojemnoscZbiornika;


    public Vehicle(String nrRej, String nrVin, String kolor, double price,
                   double spalanie, double stanZbiornika, double licznik,
                   double pojemnoscZbiornika)
    {
        this.nrRej = nrRej; this.nrVin = nrVin; this.kolor = kolor;
        this.price = price; this.spalanie = spalanie;
        this.stanZbiornika = stanZbiornika; this.licznik = licznik;
        this.pojemnoscZbiornika = pojemnoscZbiornika;

        if(stanZbiornika > pojemnoscZbiornika)      // Zabezpieczenie przed stworzeniem pojazdu z paliwem większym od zbiornika
            this.stanZbiornika = pojemnoscZbiornika;
    }

    @Override
    public void jedź(double kilometry)
    {
       if(kilometry < ileKilometrów())
       {
           this.stanZbiornika -= (spalanie / 100 * kilometry);
           this.licznik += kilometry;
           System.out.println("Pojazd o rejestracji " + nrRej + " przejechał " + kilometry + " kilometrów\nJego licznik wynosi teraz " + licznik + " kilometrów");
       }
       else
           System.out.println("Pojazd o rejestracji " + nrRej + " nie może przejechać tylu kilometrów! ( za mało paliwa)");
    }

    @Override
    public void tankuj(double ilosc)
    {
        if((this.stanZbiornika + ilosc) <= pojemnoscZbiornika)
        {
            this.stanZbiornika += ilosc;
            System.out.println("Pojazd o rejestracji " + nrRej + " zatankował " + ilosc + " litrów paliwa");
        }
        else
        {
            System.out.println("Pojazd o rejestracji " + nrRej + " zatankowano do pełna (" + (this.pojemnoscZbiornika - this.stanZbiornika) + " litrów - więcej się nie dało)");
            this.stanZbiornika = pojemnoscZbiornika;

        }
    }

    @Override
    public double ileKilometrów()
    {
        return this.stanZbiornika/(this.spalanie/100);
    }

    @Override
    public void recolor(String kolor)
    {
        this.price *= 1.05;
        System.out.println("Pojazd o rejestracji " + nrRej + " przemalowano z koloru: \"" + this.kolor + "\" na kolor: \"" + kolor
                           + "\"\nJego wartość dodatkowo wzrosła do " + this.price + "!");
        this.kolor = kolor;
    }
}