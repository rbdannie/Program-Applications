package application.model;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class will represent a Movie object, which we is defined as having:
 * A name, represented as a String, Characters, stored as an array of character objects, 
 * a toString() method, and an addCharacters(..) method. 
 * This class has a constructor, getters and setters to accommodate its variables.
 *
 * @author Renae Bergen rui026
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */

public class Movies {
	
	//Variables
	private String Movie_Name;
	private String Movie_Id;
	private String Movie_genres;
	private ArrayList<Cast> characters;
	
	/**
	 * Constructor that initializes Movies with provided attributes
	 * 
	 * @param Movie_Name
	 * 		New Movie Name
	 * @param Movie_Id
	 * 		Intials of Movie & Year Produced
	 * @param Movie_genres
	 * 		Different genres of movies
	 */
	public Movies(String Movie_Name, String Movie_Id, String Movie_genres)
	{
		this.Movie_Name = Movie_Name;
		this.Movie_Id = Movie_Id;
		this.Movie_genres = Movie_genres;
		this.characters = new ArrayList<Cast>();
	}
	
	/* This method takes in an Cast object and adds them to that 
	 * respective Movie.
	 * 
	 * @param NewAnimal
	 */
	 public void addCastInfo(Cast character) 
	 { 
		 characters.add(character);
	 }
	 
	 /* This method takes in an Animal and removes them
	  * from that Zone.
	  * 
	  * @param animal
	  */
	 public void removeCast(Cast character)
	 {
		 for(int i=0; i>characters.size();i++)
			if(character.getCharacter_Name() == character.get(i).getCharacter_Name())	
			   characters.remove(character);
	 }
	
	/* A toString() method which returns a String representation 
	 * of all characters in the movie 
	 */
	public String toString()
	{
		//creates new string and sets needed string into newly formed zoneString
		return Movie_Name + Movie_Id + ", Genre: " + Movie_genres + "Cast: " + getCastSize() 
			+ Arrays.toString(characters.toArray());
	}//end of toString
	 
	/**
	 * @return the movie_Name
	 */
	public String getMovie_Name() {
		return Movie_Name;
	}
	/**
	 * @param movie_Name the movie_Name to set
	 */
	public void setMovie_Name(String movie_Name) {
		Movie_Name = movie_Name;
	}
	/**
	 * @return the movie_Id
	 */
	public String getMovie_Id() {
		return Movie_Id;
	}
	/**
	 * @param movie_Id the movie_Id to set
	 */
	public void setMovie_Id(String movie_Id) {
		Movie_Id = movie_Id;
	}
	/**
	 * @return the movie_genres
	 */
	public String getMovie_genres() {
		return Movie_genres;
	}
	/**
	 * @param movie_genres the movie_genres to set
	 */
	public void setMovie_genres(String movie_genres) {
		Movie_genres = movie_genres;
	}
	/**
	 * @return the characters
	 */
	public ArrayList<Cast> getCharacters() {
		return characters;
	}
	/**
	 * @param characters the characters to set
	 */
	public void setCharacters(ArrayList<Cast> characters) {
		this.characters = characters;
	}
	
	/* returns the total number of characters in the cast ArrayList
	 * @return int number of characters
	 */
	public int getCastSize() 
	{
		return characters.size();
	}
	
	/* returns a character based on character position in the array list
	 * @param i position in cast array
	 * @return character at specified position
	 */
	public Cast getcharacter(int i)
	{
		return characters.get(i);
	}
	
}//end of Movies class
