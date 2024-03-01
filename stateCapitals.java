import java.util.Scanner;
import java.util.Arrays;

public class stateCapitals {

private static final Scanner input = new Scanner(System.in);
    
	public static void main(String[] args) {
		String[][] capitals = {
				  {"Alabama", "Montgomery"},
			        {"Alaska", "Juneau"},
			        {"Arizona", "Phoenix"},
			        {"Arkansas", "Little Rock"},
			        {"California", "Sacramento"},
			        {"Colorado", "Denver"},
			        {"Connecticut", "Hartford"},
			        {"Delaware", "Dover"},
			        {"Florida", "Tallahassee"},
			        {"Georgia", "Atlanta"},
			        {"Hawaii", "Honolulu"},
			        {"Idaho", "Boise"},
			        {"Illinois", "Springfield"},
			        {"Indiana", "Indianapolis"},
			        {"Iowa", "Des Moines"},
			        {"Kansas", "Topeka"},
			        {"Kentucky", "Frankfort"},
			        {"Louisiana", "Baton Rouge"},
			        {"Maine", "Augusta"},
			        {"Maryland", "Annapolis"},
			        {"Massachusetts", "Boston"},
			        {"Michigan", "Lansing"},
			        {"Minnesota", "Saint Paul"},
			        {"Mississippi", "Jackson"},
			        {"Missouri", "Jefferson City"},
			        {"Montana", "Helena"},
			        {"Nebraska", "Lincoln"},
			        {"Nevada", "Carson City"},
			        {"New Hampshire", "Concord"},
			        {"New Jersey", "Trenton"},
			        {"New York", "Albany"},
			        {"New Mexico", "Santa Fe"},
			        {"North Carolina", "Raleigh"},
			        {"North Dakota", "Bismarck"},
			        {"Ohio", "Columbus"},
			        {"Oklahoma", "Oklahoma City"},
			        {"Oregon", "Salem"},
			        {"Pennsylvania", "Harrisburg"},
			        {"Rhode Island", "Providence"},
			        {"South Carolina", "Columbia"},
			        {"South Dakota", "Pierre"},
			        {"Tennessee", "Nashville"},
			        {"Texas", "Austin"},
			        {"Utah", "Salt Lake City"},
			        {"Vermont", "Montpelier"},
			        {"Virginia", "Richmond"},
			        {"Washington", "Olympia"},
			        {"West Virginia", "Charleston"},
			        {"Wisconsin", "Madison"},
			        {"Wyoming", "Cheyenne"}
			       };
		
		System.out.println("Sorted by state:");
		System.out.println(Arrays.deepToString(capitals) + "\n"); //Array sorted by state
		
		bubbleSortByCapital(capitals);  				//perform bubble sort of array
		System.out.println("Sorted by city:");
		System.out.println(Arrays.deepToString(capitals)); 	//Array is sorted by capital
		
		int correctAnswers = 0;   			//Counter of questions answered correctly

		for (int j = 0; j < 50; j++) {         //call the method for all 50 states
			int questionCounter = j + 1;
			int varQuestion = askQuestion(capitals, j);
			correctAnswers = correctAnswers + varQuestion;
			System.out.print("Correct answers: " + correctAnswers + "/" + questionCounter +  "\n");
        }		
		
		System.out.println("Thanks for playing!");

      input.close();
	};
	

    public static void bubbleSortByCapital(String[][] array) {
        int rows = array.length;
        
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                if (array[j][1].compareTo(array[j + 1][1]) > 0) {
                    String[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    };


	
	public static int askQuestion(String[][] capitals, int stateNumber) {

    	int retval = 0;
        boolean isValid = false;

        while(!isValid){
            System.out.print("What is the capital of " + capitals[stateNumber][0] + "?\n");  
            var selection = input.nextLine().toUpperCase();
            var correctAnswer = capitals[stateNumber][1].toUpperCase();
            
            if (selection.contains(correctAnswer)) {
            	System.out.println(capitals[stateNumber][1] + " is correct!\n");
            	retval = 1;
                isValid = true;
            } else {

                System.out.println("Sorry, the correct answer is " + capitals[stateNumber][1] +"\n");
                retval = 0;
                isValid = true;
            }       
        };
        return retval;
    };
}    
