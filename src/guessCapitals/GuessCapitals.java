//**********************************************************
// Author: Sy Ketsisouvanh
// Program Name: GuessCapitals
// Program Description: Prompt user to guess the capital 
// of a state and display the correct answer upon submission 
// using JavaFx and hashmaps
//**********************************************************

package guessCapitals;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class GuessCapitals extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    // Initialize variables   
    final Button btn1 = new Button ("Submit");
    final TextField tfanswer = new TextField("");
    final TextArea tashowText = new TextArea ("");
    final ComboBox<String> stateComboBox = new ComboBox<String>();
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
 
        // Set Label and size for combo box and textfield 
        Label lb1 = new Label("Select State: ");
        stateComboBox.setPrefWidth(150);
        lb1.setContentDisplay(ContentDisplay.RIGHT);
        tfanswer.setPrefWidth(150);
    	Label lb2 = new Label("Enter Capital: ", tfanswer);
    	lb2.setContentDisplay(ContentDisplay.RIGHT);
    
    	// Set map for states and capitals and iterate to add to combo box 
        Map<String, String> stCpMap = StateAndCapitals.getStates();
        Set<String> keys = stCpMap.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            stateComboBox.getItems().addAll(key);
        
            // Set text area columns and rows
     		tashowText.setPrefColumnCount(60);
     		tashowText.setPrefRowCount(20);
     		
     		// Set event handler for button 
     		btn1.setOnAction(e -> showAnswer());
     		

     		// Set scroll and border pane
     		ScrollPane scrollPane = new ScrollPane(tashowText);
     	    BorderPane pane = new BorderPane(scrollPane);

     	    // Add variables to scene 
     	    HBox hBox = new HBox(25);
     	    hBox.getChildren().addAll(lb1,stateComboBox,lb2,btn1,tashowText);
     	    hBox.setAlignment(Pos.CENTER);
     	    pane.setTop(hBox);
            Scene scene = new Scene(new Group(), 700,200);
            Group root = (Group)scene.getRoot();
            root.getChildren().add(pane);
            
            
            primaryStage.setTitle("Guess State Capital"); // Set the stage title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show(); // Display the stage

    }    
}
    // Method to show answer for user selection
	@SuppressWarnings("unused")
	private void showAnswer() {
		// Initialize variables for states and user answer
		String states = stateComboBox.getValue().toString();
		String answer = tfanswer.getText();
		// Get key value from treemap
		Set<String> keys = StateAndCapitals.hashMap.keySet();
		 for (String key : keys) {
	          String value = StateAndCapitals.hashMap.get(states); 
	          // Display user answer and correct answer in text area 
	      		tashowText.setText("Your answer is: " + answer + " is the capital of " +
				states + '\n' + "Correct answer is: " + value + " is the capital of " + states);
		 	}
		}
	}       	  