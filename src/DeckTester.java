public class DeckTester {

    public static void main(String[] args) {
        String[] suit = {"Hearts","Diamonds","Spades","Clubs"};
        String[] rank = {"1","2","3","4"};
        int[] val = {1,2,3,4};
        Deck x = new Deck(suit,rank,val);
        System.out.println(x.getDealt());
        System.out.println(x.getUnDealt());
        x.shuffle();
        while(x.size()>0)
        {
            System.out.println(x.deal());
        }

    }
}
