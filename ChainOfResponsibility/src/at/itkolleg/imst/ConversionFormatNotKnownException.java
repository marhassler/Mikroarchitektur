package at.itkolleg.imst;

public class ConversionFormatNotKnownException extends Exception{
    public ConversionFormatNotKnownException() {
        super("Konvertierung mit den gegebenen Konvertierern nicht möglich.");
    }
}
