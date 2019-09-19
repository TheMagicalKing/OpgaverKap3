import java.util.Scanner;
public class OpgKap3_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int nextInputa = input.nextInt();
        nextInputa -= 1;
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

