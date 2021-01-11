package at.itkolleg.imst;

public class EurToDollar extends WR
{
    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        if(variante.equals("EURTODOLLAR"))
        {
            return betrag * 1.2;
        } else
        {
            if(this.getNext()!=null)
            {
                return this.getNext().umrechnen(variante,betrag);
            }
            else
            {
                throw new ConversionFormatNotKnownException();
            }
        }
    }
}
