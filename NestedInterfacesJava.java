package practice;
interface Universe
{
	interface Planets
	{
		interface Moons
		{
			public int noOfMoons();
			public String nameOfMoons();
		}	
		public String nameOfPlanet();
	}
	interface Comets
	{
		public String nameOfComet();
		public boolean isPeriodic();
	}
}
class Earth implements Universe.Planets.Moons,Universe.Planets
{
	@Override
	public String nameOfPlanet()
	{
		return "Earth";
	}
	@Override
	public int noOfMoons()
	{
		return 1;
	}
	@Override
	public String nameOfMoons()
	{
		return "The Moon";
	}		
}
class Mars implements Universe.Planets.Moons,Universe.Planets
{
	@Override
	public String nameOfPlanet()
	{
		return "Mars";
	}
	@Override
	public int noOfMoons()
	{
		return 2;
	}
	@Override
	public String nameOfMoons()
	{
		return "Deimos & Phobos";
	}	
}
class HaleBopp implements Universe.Comets
{
	@Override
	public String nameOfComet()
	{
		return "HaleBopp";
	}
	@Override
	public boolean isPeriodic()
	{
		return true;
	}
}
public class NestedInterfacesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Nested Interfaces in JAVA.\n@Nishant Amoli,B.Tech IT\n");
		Earth earthlings = new Earth();
		Mars martians=new Mars();
		HaleBopp hale=new HaleBopp();
		System.out.print("\n"+earthlings.nameOfPlanet()+" has "+earthlings.noOfMoons()+" moon named "+earthlings.nameOfMoons());
		System.out.print("\n"+martians.nameOfPlanet()+" has "+martians.noOfMoons()+" moons named "+martians.nameOfMoons());
		System.out.print("\n"+hale.nameOfComet()+" is a periodic comet? "+hale.isPeriodic());

	}

}
