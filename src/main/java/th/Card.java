package th;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Card {
    private String suit; //tür
    private String value; //deger
    private static final List<String> SUIT_ORDER = Arrays.asList("Kreuz", "Pik", "Herz", "Karo");
    private static final List<String> VALUE_ORDER = Arrays.asList("Bube", "Ass", "10", "König", "Dame", "9", "8", "7");
    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }


    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public static Comparator<Card> CardComparator = new Comparator<Card>() {
        @Override
        public int compare(Card c1, Card c2) {
            boolean isC1Bube = c1.getValue().equals("Bube");
            boolean isC2Bube = c2.getValue().equals("Bube");

            if (isC1Bube && !isC2Bube) {
                return -1;
            } else if (!isC1Bube && isC2Bube) {
                return 1;
            } else if (isC1Bube && isC2Bube) {
                return Integer.compare(SUIT_ORDER.indexOf(c1.getSuit()), SUIT_ORDER.indexOf(c2.getSuit()));
            }


            int suitComparison = Integer.compare(SUIT_ORDER.indexOf(c1.getSuit()), SUIT_ORDER.indexOf(c2.getSuit()));
            if (suitComparison != 0) {
                return suitComparison;
            } else {
                return Integer.compare(VALUE_ORDER.indexOf(c1.getValue()), VALUE_ORDER.indexOf(c2.getValue()));
            }
        }
    };


    @Override
    public String toString() {
        return suit + " " + value;
    }

}
