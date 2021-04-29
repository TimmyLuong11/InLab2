
/**
 * @author MoSho
 *
 * Generic hero could come from any comic book universe.
 */
public class GenericHero {
	
	/** Hero's super alias */
	private String name;
	
	/** Hero's super team */
	private String team;
	
	/** Default, empty constructor (not necessary for the demo) */
	public GenericHero() {}

	/** (not necessary for the demo)
	 * Create hero with the alias and for the corresponding team
	 * @param alias The hero's superhero name
	 * @param teamName The name of the superhero team the hero belongs to
	 */
	public GenericHero(String alias, String teamName) 
	{
		name = alias;
		team = teamName;
	}

	/** (not necessary for the demo)
	 * Set the hero's alias
	 * @param alias The hero's superhero name
	 * */
	public void setName(String alias)
	{
		name = alias;
	}

	/** (not necessary for the demo)
	 * Set the hero's team
	 * @param teamName The hero's superhero name
	 * */
	public void setTeam(String teamName)
	{
		team = teamName;
	}
}
