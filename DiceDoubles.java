/**
 * 
 * @author jane schneider
 * 
 * roll two die and roll until you get doubles, when you get them, state how many roll it took to get them
 */
public class DiceDoubles
{
	 public static void main(String args)
	 {
		 Dice mellis = new Dice();
	
		 
		 int janeRoll = mellis.roll();
		 int maeRoll = mellis.roll();
		 boolean roll = true;
		 
		 
		while(roll = true)
		
		{
			janeRoll = mellis.roll();
			maeRoll = mellis.roll();
			System.out.println("first roll: " + janeRoll + "second roll: " + maeRoll);
			int add = janeRoll + maeRoll;
			System.out.println("sum of your rolls is: " + add);
			
			if(janeRoll == maeRoll)
			{
				roll = false;
				System.out.println("you rolled two " + maeRoll + "'s");
				System.out.println("you rolled a toal of " + mellis.numRolls() + "rolls");
				
			}
			else
			{
				roll = true;
			}
		}
	 }
}
