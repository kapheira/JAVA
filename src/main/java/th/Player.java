package th;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
    public void sortHand() {
        hand.sort(Card.CardComparator);
    }

    public void showHand() {
        System.out.println(name + " 'in eli: ");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
