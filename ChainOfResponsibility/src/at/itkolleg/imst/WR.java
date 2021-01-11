package at.itkolleg.imst;

public abstract class WR implements IUmrechnen{

    private WR next;


    public abstract double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException;

    public WR getNext() {
        return next;
    }

    public void setNext(WR next) {
        this.next = next;
    }
}

