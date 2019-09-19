import java.lang.Math;
import java.util.Scanner;
public class OpgKap3_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input your weight in lbs");
        int weight = input.nextInt();
        System.out.println("Please input your height in Feet, press Enter and input your Inches");
        int feet = input.nextInt()*12;
        int inch = input.nextInt();
        int goodInch = feet+inch;

        double bodyMassIndex = weight*0.45359237/((goodInch*0.0254)*(goodInch*0.0254));
        System.out.println("Your BMI is " + bodyMassIndex);
    }

}
