import java.util.Scanner;
public class OpgKap3_35 {
    public static void main(String[] args) {

        long x;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker here we check if your number is even or odd");
        System.out.println("Enter your number to begin");
        x=input.nextLong();
        if (x%2 == 0)
            System.out.println("The number you've entered is even!");
        else
            System.out.println("The number you've entered is odd!");
    }
}
