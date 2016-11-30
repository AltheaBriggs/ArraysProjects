import java.util.Scanner;


/**
 *
 * Name:Althea Briggs
 * Teacher:Mr.Hardman
 * Assignment #5, Program #
 * Date Last Modified:Nov.29 
 *
 */ 
/**
 * @author A.briggs
 *
 */
	public class Arraysproject2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
			int[] userArray = new int[10];
			int element;
			int found = 0;
			
		System.out.println("Enter 10 integer numbers: ");
		System.out.println();
		
		for(int i = 0; i < userArray.length; i++){
			System.out.println("Please enter a number: ");
			userArray[i] = userInput.nextInt();
			
		}
		
		System.out.println("What element do you want to search for? ");
		element = userInput.nextInt();
		
		for(int i = 0; i < userArray.length; i++){
			if(element == userArray[i]){
				
				found++;
			}
		}

		System.out.println("That element " + element + "is found " + found + "times! ");
		
			userInput.close();
	}

}
