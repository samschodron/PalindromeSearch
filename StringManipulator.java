/*Samuel Thomas Schodron 2069
 * SkillsUSA State Competition 2019
 * 5/1/2019
 */
import java.util.*;
public class StringManipulator 
{

	public static void main(String[] args) 
	{
		//Declaring necessary variables and instantiating when necessary.
		Scanner input = new Scanner(System.in);
		Scanner inputN = new Scanner(System.in);
		String sent;
		String longest = "";
		String backwards = "";
		
		//Asks user for user input and instantiating the "sent" variable.
		System.out.print("Enter string: ");
		sent = input.nextLine();
		
		//Using a for loop to instantiate the "backwards" variable.
		for(int x = 0; x<sent.length(); x++)
		{
			backwards+=sent.substring(sent.length()-(x+1), sent.length()-x);
		}

		//Using a for loop to find the longest palindrome in the string.
		for(int x = 0; x<sent.length(); x++)
		{
			for(int y=x+1; y<sent.length(); y++)
				if(sent.substring(x,y).equals(backwards.substring(backwards.length()-y,backwards.length()-x)))
				{
					String temp = sent.substring(x,y);
					if(temp.length()>longest.length())
					{
						longest = temp;
					}
				}
		}
		if(backwards.equals(sent))
		{
			longest = backwards;
		}
	
		//Prints outputs
		System.out.println();
		System.out.println("Longest palindrome is: " + longest);
	}

}
