package practice;

/*
public class MainApp extends RoadBike {
    MainApp(int tireWidth, int speed,int cadence,int gear) {
        super(tireWidth, speed,cadence,gear);
    }

    public static void main(String[] args) {
        MainApp app1 = new MainApp(10,35,5,2);
        RoadBike bike1  = new RoadBike(15,2,5,50);
        app1.printAll();
        System.out.println("\n");
        bike1.printAll();
    }

}
*/
public class MainApp {
    public static void main(String[] args) {
       /* PlayingCards card = new PlayingCards(7,"diamond");
        Fulldeck deck = new Fulldeck();
        card.print();
        deck.CreateDeck(new PlayingCards(8,"diamond"));
        deck.CreateDeck(card);
        deck.CreateDeck(new PlayingCards(3,"Aces"));
        deck.print();*/
        PlayingCards newCard = new PlayingCards(6,2);
        newCard.print();
        Fulldeck newDeck = new Fulldeck();
        newDeck.print();
    }
}