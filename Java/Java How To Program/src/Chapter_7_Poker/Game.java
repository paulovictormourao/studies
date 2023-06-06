package Chapter_7_Poker;

public class Game {
    public static void main(String[] args) {
        Card[] deck = new Card[52];
        DeckOfCards testDeck = new DeckOfCards(deck);

        testDeck.fillDeck();
        DeckOfCards.shuffle(deck);
        testDeck.printDeck();

    }
}
