import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        weight = input.nextDouble();

        System.out.print("Enter height (m): ");
        height = input.nextDouble();

        bmi = weight / Math.pow(height, 2);
        String result;
        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi >= 1 && bmi < 25) {
            result = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            result = "Overweight";
        } else {
            result = "Obese";
        }
        System.out.println(result);

    }

}
