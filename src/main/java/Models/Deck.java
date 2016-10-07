package Models;

import java.util.ArrayList;

/**
 * Created by Kemari on 10/7/2016.
 */
public class Deck {
    private ArrayList<Card> cards;


    public Deck(){
        cards = new ArrayList<Card>();
        for (int i = 1 ; i <= 52 ; i++){
            Card tmp = new Card();
            cards.add(tmp);
        }
    }

    public void shuffle(){

    }

    public Card drawFromDeck(){
        return this.cards.get(0);
    }
}
