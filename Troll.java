
public class Troll extends Character {
	/**
	 * Constructs the specific character class and sets its specific weapon
	 * @param name The name of the character
	 */
	Troll(String name)
	{
	super(name);
	weaponbehavior = new WeaponAxe();
	}

	@Override
	void display() 
	{
		System.out.println(name + " is a funny troll");
	}
}
