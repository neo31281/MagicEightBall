import java.util.Scanner;

public class MagicEightBall
{
	public static void main(String[] args)
	{
		String answers[] = {"It is certain", "It is decidedly so", "Without a doubt", 
			"Yes - definitely", "You may rely on it", "As I see it, yes", "Most likely", 
				"Outlook good", "Signs point to yes", "Yes", "Reply hazy, try again", 
					"Ask again later", "Better not tell you now", "Cannot predict now",
						"Concentrate and ask again", "Don't count on it", "My reply is no", 
							"My sources say no", "Outlook not so good", "Very doubtful"};

		Scanner sc = new Scanner(System.in);
		
		String ques;
		
		System.out.println("Welcome to Magic Eight Ball...");
		
		while(true)
		{
			System.out.println("Ask a question, and I will give you an answer.");
			ques = sc.nextLine();
			
			int index = (int)(Math.random() * 20 + 1);
			
			System.out.println(answers[index]);
			
			System.out.println("Enter 1 to continue or other key to terminate..");
			String ch = sc.nextLine();
			
			if(!ch.equals("1"))
			{
				break;
			}
			System.out.println();
		}
	}
}
