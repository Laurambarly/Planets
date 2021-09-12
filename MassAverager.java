package planets;

public class MassAverager
{
	Planet[] thePlanets = Planet.getAll();
	
	// Complete this. Retrieve the array of planets, then compute average mass.
	public float getMeanPlanetaryMass()
	{
		float total = 0;
		for (int i = 0; i < thePlanets.length; i++)
		{
			total += thePlanets[i].getMass();
			
		}
		float average = 0;
		if (thePlanets.length > 0)
		{
			average = total / thePlanets.length;
		}
		
		return average;
	}
	
	
	
	
	//
	// In almost all classes in almost all 46B homework assignments, the main()
	// method is for you to test your code. The autograder doesn't look at the
	// output from main().
	//
	// Since this assignment is simple, there's really only 1 useful version of
	// main(), and it's provided here. Later, when your assignments are more
	// complicated, your main() will change several or many times as you develop
	// different pieces of your assignment.
	public static void main(String[] args)
	{
		MassAverager averager = new MassAverager();
		System.out.println(averager.getMeanPlanetaryMass());
	}
}
