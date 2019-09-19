import java.lang.Math;

public class OpgKap3_4 {

    /*write a program that randomly generates a number corresponding to a month
    i.e. 3 = march, 5 = may, 1 = january
    */


    public static void main(String[] args) {



        int monthNumber = (int)(Math.random()*12);

        switch (monthNumber){
            case 0:
                System.out.println("The First month");
                System.out.println("January");
                break;
            case 1:
                System.out.println("The Second month");
                System.out.println("February");
                break;
            case 2:
                System.out.println("The Third month");
                System.out.println("March");
                break;
            case 3:
                System.out.println("The Fourth month");
                System.out.println("April");
                break;
            case 4:
                System.out.println("The fifth month");
                System.out.println("May");
                break;
            case 5:
                System.out.println("The Sixth month");
                System.out.println("June");
                break;
            case 6:
                System.out.println("The Seventh month");
                System.out.println("July");
                break;
            case 7:
                System.out.println("The Eighth month");
                System.out.println("August");
                break;
            case 8:
                System.out.println("The Ninth month");
                System.out.println("September");
                break;
            case 9:
                System.out.println("The Tenth month");
                System.out.println("October");
                break;
            case 10:
                System.out.println("The Eleventh month");
                System.out.println("November");
                break;
            case 11:
                System.out.println("The Twelfth month");
                System.out.println("December");
                break;

        }


    }
}
