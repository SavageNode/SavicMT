package advancedhw;

import java.awt.Taskbar.State;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class StateCapitals2 {

	public static void main(String[] args) {
		
		// Make a hashmap for states and capitals
		Map<String,String> stateCapitals = new HashMap<>();
		
		//load in file to read
		try {
			//scanner to read
			Scanner read = new Scanner(
					new BufferedReader(new FileReader("StateCapitals.txt")));
			//adding state and capitals to strings then to hashmap
			while(read.hasNextLine()) {
				String currentLine = read.nextLine();
				String state;
				String capital;
				//split the line we just read
				String[] split = currentLine.split("::");
				//add to string variable
				state = split[0];
				capital = split[1];
				//put into hashmap
				stateCapitals.put(state,capital);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//hashmap size
		System.out.println(stateCapitals.size());
		//list for states
		Collection<String> states = stateCapitals.keySet();
		System.out.println("STATES:\n-----------------------------");
		for(String state: states) {
			System.out.println(state);
		}
		Scanner in = new Scanner(System.in);
		int totalstates = stateCapitals.size();
		//knowledge game
		int rounds = 0;
		int score = 0;
		System.out.println("How many rounds would you like to play? 1-50");
		rounds = in.nextInt();
		Random rand = new Random();
		int i = 0;
		while(i <= rounds) {
			int num = rand.nextInt(totalstates-0);
			//get random state String
			String randomState = (String) states.toArray()[num];
			System.out.println("What is the capital of: " + randomState + "?");
			
			String answer = (in.next()).toLowerCase();
			
			//Check if answer matches real capital
			if(answer.toUpperCase().equals((((stateCapitals.get(randomState)).toString()).toUpperCase()))) {
				System.out.println("Correct the capital of " + randomState + " is " + stateCapitals.get(randomState) + "!");
				score++;
			}
			else {
				System.out.println("Wrong, the capital of " + randomState + " is " + stateCapitals.get(randomState) + "!");
				score--;
			}
			i++;
			//remove state we already use from our list
			states.remove(randomState);
			//reduce size of list
			totalstates--;
		}
		System.out.println("You're score is " + score + " out of " + rounds);

		
		
		
		
	}
	
		
		

}
