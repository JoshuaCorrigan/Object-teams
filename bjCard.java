public class bjCard implements Card {
    private static final String[] SUITS     = Constants.SUITS;
    private static final String[] SPECIALS  = Constants.SPECIALS;
    private static final int BASE           = Constants.BASE;

    private int value;
    private String suit;

    public bjCard(int seed) {

    }
    
    public int getValue() {
        return this.value;
    }

    public String getSUITS() {
        return this.suit;
    }
}
