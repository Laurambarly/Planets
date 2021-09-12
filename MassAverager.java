package planets;

public class MassAverager
{
	Planet[] thePlanets = Planet.getAll();
	
	// Retrieve the array of planets, then compute average mass.
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
	
	
	
	public static void main(String[] args)
	{
		MassAverager averager = new MassAverager();
		System.out.println(averager.getMeanPlanetaryMass());
	}
}
