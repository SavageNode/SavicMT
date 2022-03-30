package advancedhw;
import java.util.Scanner;
public class HealthyHearts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your age? ");
		int age = in.nextInt();
		int maxHeartRate = 220 - age;
		double topHR = maxHeartRate * 0.85;
		double bottomHR = maxHeartRate * .50;
		
		System.out.println("Your maximum heart rate should be " + maxHeartRate +" beats per minute");
		System.out.println("Your target HR zone is " + String.format("%.0f", bottomHR) + " - " + String.format("%.0f",topHR) + " beats per minute");
	}

}
