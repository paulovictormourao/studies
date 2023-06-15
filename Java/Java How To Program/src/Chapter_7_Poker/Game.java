package Chapter_7_Poker;

public class Game {
    public static void main(String[] args) {
        Card[] deck = new Card[52];
        DeckOfCards testDeck = new DeckOfCards(deck);

        testDeck.fillDeck();
        DeckOfCards.shuffle(deck);
//        testDeck.printDeck();

        Card[] table = testDeck.drawCards(0, 5);
        Card[] hand = testDeck.drawCards(5, 7);
        Card[] tableAndHand = testDeck.drawCards(0,7);

        String whatsInTheTable = verifyCards(table);
        String whatsInMyHand = verifyCards(hand);
        String whatsInMyHandAndInTheTable = verifyCards(tableAndHand);

        System.out.println("\nTABLE CARDS:\n");

        for(Card card: table){
            System.out.println(card.getCard());
        }

        System.out.println("\nThere's " + whatsInTheTable + " on the table\n");


        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("\nCARDS ON YOUR HAND:\n");

        for(Card card: hand){
            System.out.println(card.getCard());
        }

        System.out.println("\nthere is " + whatsInMyHand + " on your hand");

        if (!whatsInMyHandAndInTheTable.equals(whatsInTheTable))
            System.out.println("\nthere is " + whatsInMyHandAndInTheTable + " on the table and on your hand\n");



    }


    public static String verifyCards(Card[] cards){
        final String[] faces = {"Ace", "Two", "Three", "Four", "Five",
                 "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "king"};

        int[] facesCount = new int[13];
        int numberOfCards = cards.length;


        for (Card card : cards) {

            for (int j = 0; j < 13; j++) {

                if (card.getFace().equals(faces[j])) {
                    facesCount[j]++;
                }
            }
        }

        // Checks full house
        for(int i = 0; i < 13; i++) {

            if ((facesCount[i] == 2)) {

                for (int j = i + 1; j < 13; j++) {

                    if (facesCount[j] == 3) {
                        return "a full house";
                    }
                }
            }

            if ((facesCount[i] == 3)) {

                for (int j = i + 1; j < 13; j++) {

                    if (facesCount[j] == 2) {
                        return "a full house";
                    }
                }
            }
        }

        int straightCounter = 0;

        for(int value: facesCount){
            if (value == 1){
                 straightCounter++;
            }

            if (value == 0 && straightCounter < numberOfCards){
                straightCounter = 0;
            }

        }
        if (straightCounter == numberOfCards){
            return "a straight";
        }

        // Pair Triple or 2 Pair
        int largestFrequency = 0;

        for(int value: facesCount){
            if (value > largestFrequency){
                largestFrequency = value;
            }
        }

        return switch (largestFrequency) {
            case 2 -> "a pair";
            case 3 -> "a triple";
            case 4 -> "a two pairs";
            default -> "nothing";
        };


    }

}
