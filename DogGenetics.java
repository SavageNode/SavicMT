package advancedhw;
import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("What is your dogs name? ");
		String dogName = in.nextLine();
		
		System.out.println("Well then, I have this highly reliable report on " + dogName + " prestigious background right here.");
		System.out.println(dogName + " is:");
		
		int total = 0;
		
		int stBernard = 0;
		int chi = 0;
		int asianPug = 0;
		int commonCurr= 0;
		int kingDoberman = 0;
		int remainder = 0;
		
		
		stBernard = (rand.nextInt((100 - 1) + 1) + 1);
		total = total + stBernard;
		
		chi = (rand.nextInt(((100-total)- 1) + 1) + 1);
		total = total + chi;
		
		asianPug = (rand.nextInt(((100-total)- 1) + 1) + 1);
		total = total + asianPug;
		
		commonCurr = (rand.nextInt(((100-total)- 1) + 1) + 1);
		total = total + commonCurr;
		
		kingDoberman = (rand.nextInt(((100-total)- 1) + 1) + 1);
		total = total + kingDoberman;
		
		remainder = 100-total;
		kingDoberman = kingDoberman + remainder;
		total = total + remainder;
		
		
		System.out.println(stBernard + "% St. Bernard \n" + chi + "% Chihuahua \n"+ asianPug + "% Drmatic RedNosed Asian Pug \n"+ commonCurr + "% Common Curr \n"+ kingDoberman + "%  King Doberman");
		System.out.println("Total Percentage: " + total);
		System.out.println("Wow, that's QUITE the dog!");
		
		
	}
}
