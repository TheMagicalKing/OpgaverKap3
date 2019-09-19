import java.sql.SQLOutput;
import java.util.Scanner;
public class OpgKap3_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This program tells you what day of the week you have and what day of the week you'll get after x amount of days");
        System.out.println("The week start on Sunday so Sunday is 1, Monday is 2, Tuesday is 3, so on and so forth");
        System.out.println("Please input the day of the weeks in numbers");
        int nextInputa = input.nextInt();
        nextInputa -= 1;
        System.out.println("Please input the amount of days you'd like to look into the 'future' so we can tell you which day it is in x amount of days.");
        int nextInputb = input.nextInt();

        switch (nextInputa){
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;

        }
        switch (nextInputa+nextInputb%7) {
            case 0:
        System.out.println("The future day is Sunday");
        break;
        case 1:
        System.out.println("The future day is Monday");
        break;
        case 2:
        System.out.println("The future day is Tuesday");
        break;
        case 3:
        System.out.println("The future day is Wednesday");
        break;
        case 4:
        System.out.println("The future day is Thursday");
        break;
        case 5:
        System.out.println("The future day is Friday");
        break;
        case 6:
        System.out.println("The future day is Saturday");
        break;
    }


        }

}

