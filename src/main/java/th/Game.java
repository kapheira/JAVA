package th;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Game {
    public static void main(String[] args) {
        List<Card> deck = createDeck();
        Collections.shuffle(deck);

        Player player = new Player("Oyuncu 1");
        player.setHand(drawCards(deck, 10));
        player.sortHand();
        player.showHand();
    }


    public static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        String[] suits = {"Karo", "Kreuz", "Pik", "Herz"};
        String[] values = {"7", "8", "9", "10", "Bube", "König", "Dame", "Ass"};

        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }
        return deck;
    }


    public static List<Card> drawCards(List<Card> deck, int numberOfCards) {
        Set<Card> hand = new HashSet<>();
        int index = 0;
        while (hand.size() < numberOfCards) {
            hand.add(deck.get(index));
            index++;
        }
        return new ArrayList<>(hand);
    }
}
