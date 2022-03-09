//Do-while, For, while, and recursion examples
import java.util.*;
public class Iterative extends Structure{
	Scanner input = new Scanner(System.in);
	private String type;
	public Iterative (String newType) {
		type = newType;
	}
	boolean run = true;
	Random randomNumber = new Random();
	int num = 0, iterations = 0;
	
	void run() {
		System.out.print("What type of iterative structure would you like to see? ");
	    type = input.next();
		switch(type) {
		case "Do-While Loop":
			System.out.println("You are entering level 1. ");
			do {
				num = randomNumber.nextInt(100);
				if ( num > 50) {
					iterations++;
					System.out.println(" Iterations = " + iterations);
				}

			} while (num > 50);
			
		case "For Loop":
			int num = 0;
		    for(int i = 0; i < 3; i++){

		      System.out.println("Guess my number from 10-20 *You have 3 tries* ;) ");
		      num = input.nextInt();
		      if(num == 19){
		        System.out.print("You got it dude! o/");
		    
		        break;

		      }
		    }
		case "While Loop":
			String response = "";
		    boolean play = true;
		    Random ranNum = new Random();
		    int num = 0, player = 0;

		    System.out.println( "Get as close to 100 as you can without going over. " );   

		    while (play) {

		      num = ranNum.nextInt(20);                             
		      player = player + num;
		      System.out.println( "You got " + num + ". Your total is " + player + "." );             
		                       
		      if (player < 100){  
		        System.out.println("Would you like to more?");  
		        response = input.next();
		        if(response.equals( " no " )){
		           play = false;                                        
		        }
		       } else {
		          play = false;                                
		      }
		    }
		      System.out.println( "You're final score is: "  + player);
		
		case "Recursion":
		    System.out.print("Pick a number ");
		    int num = input.nextInt();

		    subtracting(num);
		  }

		  public static void subtracting(int number){
		    if(number!= 0){

		      System.out.println(number);

		      number--;

		      subtracting(number);
		    }
		}
		
	}
}

