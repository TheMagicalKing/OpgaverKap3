import java.lang.Math;
public class OpgKap3_24 {
    public static void main(String[] args) {
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        int x = (int)(Math.random()*13);
        int y = (int)(Math.random()*4);
        System.out.println("Your card is " + ranks[x] + " of " + suits[y]);
    }
}
