package practice;

import java.util.ArrayList;
import java.util.List;

public class PlayingCards {
    private final static int DIAMONDS = 1;
    private final static int HEARTS = 2;
    private final static int CLUBS = 3;
    private final static int SPADES = 4;

    private final static int ACE = 1;
    private final static int DEUCE = 2;
    private final static int THREE = 3;
    private final static int FOUR = 4;
    private final static int FIVE = 5;
    private final static int SIX = 6;
    private final static int SEVEN = 7;
    private final static int EIGHT = 8;
    private final static int NINE = 9;
    private final static int TEN = 10;
    private final static int JACK = 11;
    private final static int QUEEN = 12;
    private final static int KING = 13;


    int rank;
    int suit;
    PlayingCards(int rank,int suit){
        this.rank = rank;
        this.suit = suit;
    }
    void print(){
        if(rankToString()!=null && suitToString()!=null)
            System.out.println("rank:"+rankToString()+" suit:"+suitToString());
        else System.out.println("Invalid rank or suit");
    }
    String rankToString(){
        switch (rank){
            case ACE:
                return "Ace";
            case DEUCE:
                return "DEUCE";
            case THREE:
                return "THREE";
            case FOUR:
                return "FOUR";
            case FIVE:
                return "FIVE";
            case SIX:
                return "SIX";
            case SEVEN:
                return "SEVEN";
            case EIGHT:
                return "EIGHT";
            case NINE:
                return "NINE";
            case TEN:
                return "TEN";
            case JACK:
                return "JACK";
            case QUEEN:
                return "QUEEN";
            case KING:
                return "KING";
            default:
                return null;
        }
    }
    String suitToString(){
        switch (suit){
            case DIAMONDS:
                return "DIAMONDS";
            case HEARTS:
                return "HEARTS";
            case SPADES:
                return "SPADES";
            case CLUBS:
                return "CLUBS";
            default:
                return null;
        }
    }
}
class Fulldeck extends PlayingCards{
    private static final int SIZE = 52;

    PlayingCards[][] cards;

    Fulldeck() {
        super(0,0);
        cards = new PlayingCards[4][13];
        for(int suit=0;suit<4;suit++){
            for(int rank=0;rank<13;rank++)
                cards[suit][rank] = new PlayingCards(rank+1,suit+1);
        }
    }

    void print(){
        for(int suit=0;suit<4;suit++){
            for(int rank=0;rank<13;rank++)
                System.out.println(cards[suit][rank].suitToString()+":"+cards[suit][rank].rankToString());
        }
    }
}
