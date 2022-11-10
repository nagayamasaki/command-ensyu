import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner stdIn = new Scanner(System.in);

                System.out.print("身長(cm):");
                double height = stdIn.nextDouble();
                System.out.print("体重(kg):");
                double weight = stdIn.nextDouble();
				double h = height / 100;
                double bmi = weight / h / h;

                System.out.println("BMI:"+ (Math.floor(bmi * 100)) / 100);
        }
}
