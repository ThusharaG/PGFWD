import java.util.Scanner;

public class QuizDemo {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	
System.out.println("Who is the CEO of Google?");
System.out.println("1. Jeff Bezos \n2. Gopinath \n3. Naraya Murthy\n4. Sundar Picchai");

	while(true) {

		System.out.println("\nEnter your choice 1 or 2 or 3 or 4 ");
		int n = sc.nextInt();
		 if(n==4)
		 {
			 System.out.println("\nCongratulations,"+" " +"You are right!");
			 break;
		 }
		 else 
			 System.out.println("You have choosen wrong answer, please try again!!");
	
}	
}
}
