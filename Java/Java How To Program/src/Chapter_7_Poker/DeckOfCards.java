package Chapter_7_Poker;

import java.util.Random;

public class DeckOfCards {
    private final String[] faces = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "king"};
    private final String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

    private Card[] deck = new Card[52];

    public DeckOfCards(Card[] deck){
        this.deck = deck;
    }

    public void fillDeck(){

        for(int i = 0; i < deck.length; i++){

            this.deck[i] = new Card(faces[i % 13] , suit[i/13]);

        }
    }

    public void printDeck(){
        for (int i = 1; i < this.deck.length + 1; i++){
            System.out.printf("[%d] %-19s", i, this.deck[i - 1].getCard());

            if (i % 4 == 0){
                System.out.println();
            }
        }
    }

    public static void shuffle (Card[] deck){
        Random rand = new Random();
        for (int i = deck.length - 1; i >= 1; i--) {

            int j = rand.nextInt(i + 1);
            Card temp = deck[i];

            deck[i] = deck[j];
            deck[j] = temp;

        }
    }
}
