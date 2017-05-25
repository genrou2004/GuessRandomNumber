import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		int x = 1+ r.nextInt(999);
		
		Scanner scan = new Scanner(System.in);
		

		int gueesedNumber = 0;
		
		
	do{
		System.out.println("Enter the number between 0 and 1000 you want to guess");
		gueesedNumber = scan.nextInt();
		
		if(gueesedNumber < x){
			System.out.println("You guessed very low number: ");
		}else if(gueesedNumber > x){
			System.out.println("You guessed very high number: ");
		}else
			System.out.println("Congrats! You guessed correct!");
	}while(gueesedNumber != x);
	scan.close();
	}
}
