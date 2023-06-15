package Chapter_7_Poker;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
    private final String[] faces = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "king"};

    private final String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

    private final Card[] deck;


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

    public Card[] drawCards(int from, int to) {


        Card[] table;

        table = Arrays.copyOfRange(this.deck,  from ,to);

        /*table[0] = this.deck[5];
        table[1] = this.deck[6];
        table[2] = this.deck[7];
        table[3] = this.deck[8];
        table[4] = this.deck[9];*/



        return table;
    }
}
