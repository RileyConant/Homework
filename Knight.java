
public class Knight extends Character{
	/**
	 * Constructs the specific character class and sets its specific weapon
	 * @param name The name of the character
	 */
	Knight(String name)
	{
		super(name);
		weaponbehavior = new WeaponBow();
	}

	@Override
	void display() 
	{
		System.out.println(name + " is a valiant knight");		
	}

}
