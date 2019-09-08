
public class King extends Character {
	/**
	 * Constructs the specific character class and sets its specific weapon
	 * @param name The name of the character
	 */
	King(String name)
	{		
		super(name);
		weaponbehavior = new WeaponSword();
	}
	@Override
	public void display()
	{
		System.out.println(name + " is a noble king");		
	}
}
