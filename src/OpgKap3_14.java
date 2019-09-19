import java.lang.Math;
import java.util.Scanner;
public class OpgKap3_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Heads or tails?");
        String headsTailsAnswer = input.next();
        int headsTails = (int)(Math.random()*2);

        if (headsTailsAnswer.equalsIgnoreCase("heads") && headsTails == 0){
            System.out.println("Answer is Heads you won!");
        }
        else if (headsTailsAnswer.equalsIgnoreCase("tails") && headsTails == 1)
            System.out.println("Answer is Tails you won!");
        else
            System.out.println("Sorry you lost!");
    }

}
