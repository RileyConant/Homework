
public class Queen extends Character{
	/**
	 * Constructs the specific character class and sets its specific weapon
	 * @param name The name of the character
	 */
	Queen(String name)
	{
	super(name);
	weaponbehavior = new WeaponKnife();
	}

	@Override
	public void display() 
	{
	System.out.println(name +" is a beautiful Queen");
		
	}
}
