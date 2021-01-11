package at.itkolleg.imst;

public class Main {

    public static void main(String[] args) {
	// write your code here

        WR kettenBeginn = new EurToDollar();
        kettenBeginn.setNext(new Gebührendecorator(new EurToYen()));


        try {
            System.out.println(kettenBeginn.umrechnen("EURTOYEN", 100));
            System.out.println(kettenBeginn.umrechnen("EURTODOLLAR", 100));
            System.out.println(kettenBeginn.umrechnen("EURTOYUAN", 100));
        } catch(ConversionFormatNotKnownException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
