package at.itkolleg.imst;

public class EurToYen extends WR
{
    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        if(variante.equals("EURTOYEN"))
        {
            return betrag * 1000;
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
