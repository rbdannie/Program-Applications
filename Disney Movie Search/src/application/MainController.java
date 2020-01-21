package application;
import javafx.event.ActionEvent;
import java.io.IOException;
import application.model.DisneyMovies;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * This class will represent the MainController....
 *
 * @author Renae Bergen rui026
 * UTSA CS 3443 - Lab 3
 * Fall 2019
 */

public class MainController {
		
	    @FXML
	    private TextArea results;

	    @FXML
	    private Label userPrompt;

	    @FXML
	    private Button button;

	    @FXML
	    private TextField userinput;

	    @FXML
	    void handleButton(ActionEvent event) throws IOException {
	    	
	    	DisneyMovies movies19 = new DisneyMovies("Disney Movies 2019");
			// Load data for the zoo, and print its current status
			movies19.loadMovies("data/movies.csv");
			movies19.loadCast("data/characters.csv");
			//String input = userinput.getText();
			
			
			
			
			
	    }

	}


