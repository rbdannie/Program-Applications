package application.model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class will represent a DisneyMovie object, which we is defined as having:
 * A name, represented as a String, Movies, stored as an array of movie objects, 
 * a toString() method, and an addMovie(..) method. 
 * This class has a constructor, getters and setters to accommodate its variables.
 *
 * @author Renae Bergen rui026
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */

public class DisneyMovies {

	//variables
	private String DisneyMovies_Name;
	private ArrayList<Movies> movies;
	private ArrayList<Cast> matchResults;
	
	/**
	 * Constructor that initializes Disney Movies with provided attributes
	 * 
	 * @param DisneyMovies_Name
	 * 		Movie Name
	 */
	public DisneyMovies(String DisneyMovies_Name){
		this.setDisneyMovies_Name(DisneyMovies_Name);
		this.setMovies(new ArrayList<Movies>());
	}

	/* Calls upon the toString() method in Zone.java to return as a 
	 * string for all needed information 
	 */
	public String toString()
	{
		//Creates a string and sets needed String format command to newly created string
		return this.DisneyMovies_Name + "\"! \n================================\n" + Arrays.deepToString(movies.toArray())
		.replace(",", "")
		.replace("[", "")
		.replace("]", "")
		.replace("null", "");
	}//end of toString 
	

	/* 
	 * @param fileName
	 * @throws IOException
	 */
	public void loadMovies(String fileName) throws IOException
	{
		fileName = "data/movies.csv";
		File file = new File(fileName); ///creates a file object
		try {
		Scanner inputStream = new Scanner(file); //opens the file for reading
		while(inputStream.hasNextLine())
		{
			//read it and use it
			String data = inputStream.nextLine();
			String[] values = data.split(","); //specifies boundary for characters in file	
			String Movie_Name = values[0];
			String Movie_Id = values[1];
			String Movie_genres = values[2];
			Movies movie = new Movies(Movie_Name, Movie_Id, Movie_genres);
			addMovie(movie);
		}//end of while
		inputStream.close();
		}//end of try
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}//end of catch
	}//end of loadZones method
	
	
	
	/* Read the contents of a file and saves them to a movie as 
	 * cast members or characters in specified movies
	 * 
	 * @param fileName location of a file to be read in
	 * @throws IOException in the case of the file not being openable
	 */
	public void loadCast(String fileName) throws IOException {

		fileName = "data/characters.csv";
		File file = new File(fileName); ///creates a file object
		try {
		Scanner inputStream = new Scanner(file); //opens the file for reading
		while(inputStream.hasNextLine())
		{
			// read it in and use it
			String data = inputStream.nextLine();
			String[] values = data.split(",");
			String character_Name = values[0];
			String actor_Name = values[1];
			String character_role = values[2];
			String Movie_Id = values[3];
			String actor_nationality = values[4];
			
			Cast characters = new Cast(character_Name, actor_Name, character_role, actor_nationality);
			int movieIndex = 0;
			//checks for movie name and if it matches inputs into the correct movie
			for(int k = 0; k < movies.size(); k++)
			{
				if(movies.get(k).getMovie_Id().equalsIgnoreCase(Movie_Id))
				{
					movieIndex = k;
					break;
				}//end of if
			}//end of for loop
			this.movies.get(movieIndex).addCastInfo(characters);
		}//end of while
		inputStream.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}//end of catch
		
	}//end of loadCast method 
	
	/** 
	 * An addMovie method, which allows the movies to be inputed 
	 * into the movie list and returns nothing.
	 * 
	 * @param new_Movie
	 * 		    new_movie object
	 */
	public void addMovie(Movies new_movie)
	{
		movies.add(new_movie);
	}//end of addMovie method
	
	/** 
	 * A removeMovie method, which allows the movies to be removed
	 * from the movie list and returns nothing.
	 * 
	 * @param delete_movie
	 */
	public void removeMovie(Movies delete_movie)
	{
		this.movies.remove(delete_movie);
	}
	
	/**
	 * @return the disneyMovies_Name
	 */
	public String getDisneyMovies_Name() {
		return DisneyMovies_Name;
	}

	/**
	 * @param disneyMovies_Name the disneyMovies_Name to set
	 */
	public void setDisneyMovies_Name(String disneyMovies_Name) {
		DisneyMovies_Name = disneyMovies_Name;
	}

	/**
	 * @return the movies
	 */
	public ArrayList<Movies> getMovies() {
		return movies;
	}

	/**
	 * @param movies the movies to set
	 */
	public void setMovies(ArrayList<Movies> movies) {
		this.movies = movies;
	}
	
	public ArrayList<Cast> getMoviesByName(String movieInput){
		matchResults = new ArrayList<Cast>();
		for(int k = 0; k < movies.size(); k++)
		{
			if(movieInput.matches(movies.get(k).getMovie_Name()))
			{
				matchResults.addAll(movies.get(k).getCharacters());
            }
        }
		return matchResults;
		
	}
	
	
}//end of DisneyMovies class
