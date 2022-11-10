import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner stdIn = new Scanner(System.in);

 		System.out.print("1人目の身長(cm):");
                double height1 = stdIn.nextDouble();
                System.out.print("1人目の体重(kg):");
                double weight1 = stdIn.nextDouble();
		double h1 = height1 / 100;
                double bmi1 = weight1 / h1 / h1;
        	
        	System.out.print("2人目の身長(cm):");
                double height2 = stdIn.nextDouble();
                System.out.print("2人目の体重(kg):");
                double weight2 = stdIn.nextDouble();
		double h2 = height2 / 100;
                double bmi2 = weight2 / h2 / h2;

                System.out.println("1人目のBMI:"+ (Math.floor(bmi1 * 100)) / 100);
	        System.out.println("2人目のBMI:"+ (Math.floor(bmi2 * 100)) / 100);
        }
}
