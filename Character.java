/**
 * Character class that will be the abstract parent of all the characters
 * @author riley
 *
 */
public abstract class Character implements WeaponBehavior{
	protected String name;
	protected WeaponBehavior weaponbehavior;
	/**
	 * This constructs a character with a name
	 * @param name the name of the character
	 */
	Character(String name)
	{
		this.name = name;
		
	}
	/**
	 * Sets the weapon behavior for the character
	 * @param wb the weapon that the character will be using
	 */
	public void setWeaponBehavior(WeaponBehavior wb)
	{
		weaponbehavior = wb;
	}
	/**
	 * Calls the attack method for the specific weapon for the character
	 */
	public void attack()
	{
		weaponbehavior.attack();
	}
	
	
	abstract void display();


	

}
