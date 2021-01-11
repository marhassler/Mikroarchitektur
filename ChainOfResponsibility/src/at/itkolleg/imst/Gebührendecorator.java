package at.itkolleg.imst;

public class Gebührendecorator extends  WR {

    WR währungsrechner;

    public Gebührendecorator(WR währungsrechner)
    {
        this.währungsrechner = währungsrechner;
    }

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        double ergebnis = this.währungsrechner.umrechnen(variante, betrag);
        ergebnis *= 1.02;
        return ergebnis;
    }
}
