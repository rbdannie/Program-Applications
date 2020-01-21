package application.model;

/**
 * This class will represent a Cast object, which we is defined as having:
 * A charater's name, represented as a String, the actor's name, represented as a String,  
 * a string demonstrating the actor's nationality and, a string to represent the character's
 * role in the movie. This class also has a constructor, getters and setters 
 * to accommodate its variables.
 *
 * @author Renae Bergen rui026
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */

public class Cast {
	
	//Variables
	private String character_Name;
	private String actor_Name;
	private String character_role;
	private String actor_nationality;
	
	/**
	 * Constructor that initializes Cast with provided attributes
	 * 
	 * @param character_Name
	 * 		New Movie Character Name
	 * @param actor_Name
	 * 		New Actor's Name
	 * @param character_role
	 * 		Character's role in the movie
	 * @param actor_nationality
	 * 		Actor's Nationality
	 */
	public Cast (String character_Name, String actor_Name, String character_role, String actor_nationality)
	{
		this.character_Name = character_Name;
		this.actor_Name = actor_Name;
		this.character_role = character_role;
		this.actor_nationality = actor_nationality;
		
	}
	
	// Default Case
		public Cast()
		{
			character_Name= "";
			actor_Name = "";
			character_role = "";
			actor_nationality= "";
		}
	
   /* A toString() method which returns a String representation 
	* of the cast object
	*/
	public String toString()
	{
		return String.format(" - %s %s %s (%s)\n", character_role, character_Name, actor_Name, actor_nationality);
	}//end of toString
		
	/**
	 * @return the character_Name
	 */
	public String getCharacter_Name() {
		return character_Name;
	}
	/**
	 * @param character_Name the character_Name to set
	 */
	public void setCharacter_Name(String character_Name) {
		this.character_Name = character_Name;
	}
	/**
	 * @return the actor_Name
	 */
	public String getActor_Name() {
		return actor_Name;
	}
	/**
	 * @param actor_Name the actor_Name to set
	 */
	public void setActor_Name(String actor_Name) {
		this.actor_Name = actor_Name;
	}
	/**
	 * @return the character_role
	 */
	public String getCharacter_role() {
		return character_role;
	}
	/**
	 * @param character_role the character_role to set
	 */
	public void setCharacter_role(String character_role) {
		this.character_role = character_role;
	}
	/**
	 * @return the actor_nationality
	 */
	public String getActor_nationality() {
		return actor_nationality;
	}
	/**
	 * @param actor_nationality the actor_nationality to set
	 */
	public void setActor_nationality(String actor_nationality) {
		this.actor_nationality = actor_nationality;
	}

	public Cast get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}//end of cast class
