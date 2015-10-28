import java.util.Scanner;
import java.util.Arrays;
public class W10Lab2 {

	public static void main(String[] args) {
		double[] oddGuess = new double [10];
		double[] evenGuess = new double [10];
		double[] compNum = new double [10];
		double[] winLose = new double [10];
		Scanner input = new Scanner(System.in);
		Scanner guesses = new Scanner(System.in);
		int dice = 1 + (int)(Math.random() *6);
		int i =0;
		int n = 0;
		double odd = 0;
		double b =0;
		double j = 0;
		double k = 0;
		double even = 0;
		double evenguess = 0;
		double winning = 0;
		double oddgen = 0;
		String guess;

		do{
			/*Here we will be using the equal string in order to help the dice game determine when
			  to the game will print if you have guessed correctly or not. We use an if then statement 
			  using the remainder to help us determine if odd or even.*/
			System.out.println("You have thrown the dice! Type 'odd' if you think it will be odd"
					+ " or type 'even' if you think it will be even?");
			guess = guesses.nextLine();
			dice = 1 + (int)(Math.random() * 6);
		if ((dice % 2) == 0)
		{
			if (("even").equals(guess.toLowerCase()))
			{
				System.out.println("You have guessed correctly!");
				j++;
				even++;
			}
			else 
			{
				System.out.println("You have guessed incorrectly.");
				k++;
			}
			System.out.printf("Your dice number is %d it is even!\n", dice);
		}
		else
		{
			if ("odd".equals(guess.toLowerCase()))
			{
				System.out.println("You have guessed correctly!");
				j++;
			}
			else 
			{
				System.out.println("You have guessed incorrectly.");
				k++;
				even++;
			}
			System.out.printf("Your dice number is %d it is odd!\n", dice);
			odd++;
			i++;
		}
		//Typing "0" will place the game back in the loop.
		System.out.println("Would you like to play again? Type '0' for yes or '1' for no.");
		i = input.nextInt();
		b++;
		} while(i == 0);
		
		//To find winning percentage divide times received "You guessed correctly" by total games.
		winning = j/b;
		//To find even guesses, divide number of times you typed even by games.
		evenguess = even/b;
		/*To find the number of times odd was rolled by dice, under else condition, increment odd,
		  odd increment divide by total games.*/ 
		oddgen = odd/b;
		System.out.printf("You have played %.0f amount of times.\n", b);
		System.out.printf("Your winning percentage i	s %10.2f%%\n", winning);
		System.out.printf("You have guess even %10.2f%% \n", evenguess);
		System.out.printf("The dice game has generated an odd number %10.2f%% \n", oddgen);

		
	}

}
