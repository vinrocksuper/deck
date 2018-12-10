import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;
    public Deck(String[] ranks, String[] suit, int[] val)
    {
        for(int i=0;i< ranks.length;i++)
        {
            for(int j=0;j< suit.length;j++)
            {
                for(int k=0;k<val.length;k++)
                {
                    unDealt.add(new Card(ranks[i],suit[j],val[k]));
                }
            }
        }
    }
    public boolean isEmpty()
    {
        if(Dealt.size() == 0)
        {
            return true;
        }
        return false;
    }
    public int size()
    {
        return unDealt.size();
    }
    public Card deal()
    {
        if(unDealt.size()>0)
        {
            Card temp = unDealt.get(0);
            Dealt.add(temp);
            unDealt.remove(0);
            return temp;
        }
        return null;
    }
    public void shuffle(){
        unDealt.addAll(Dealt);
        for(int i=0;i<Dealt.size();i++)
        {
            Dealt.remove(i);
        }
        for(int i=51;i>=1;i--)
        {
            int pos = (int) (Math.random() * i);
            Card temp = unDealt.get(i);
            unDealt.set(i,unDealt.get(pos));
            unDealt.set(pos,temp);
        }
    }

}

