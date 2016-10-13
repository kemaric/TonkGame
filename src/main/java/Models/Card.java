package Models;

/**
 * Created by Kemari on 10/7/2016.
 */
public class Card <Suit, Rank> {
    private Suit type;
    private Rank court;

    public Card(Suit type, Rank court) {
        this.type = type;
        this.court = court;
    }

    public enum Suit{
        HEART(1), DIAMOND(2), CLUB(3), SPADE(4);

        private int value;

        private Suit (int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    public enum Rank{
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
        SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11),
        QUEEN(12), KING(13);

        private int value;
        private Rank (int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    public Suit getSuit(){
        return type;
    }

    public Rank getRank(){
        return court;
    }

    public void setSuit(Suit suit){
        this.type = suit;
    }

    public void setRank (Rank rank){
        this.court = rank;
    }

    

}
