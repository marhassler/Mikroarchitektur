package at.itkolleg.imst;

public interface IUmrechnen {
    double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException;
}
