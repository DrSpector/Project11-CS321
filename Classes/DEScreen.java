import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class DEScreen extends Application {

//Attributes - need to be here for nested button stuff
    TextField fNameInput;
    TextField lNameInput;
    TextField idInput;
    TextField statusInput;
    TextField fNameOutput;
    TextField lNameOutput;
    TextField idOutput;



    @Override
    public void start(Stage stage) {

	Scene scene = new Scene(new Group(), 450, 250);

	GridPane grid = new GridPane();
	grid.setPadding(new Insets(10, 10, 10, 10));
	grid.setVgap(5);
	grid.setHgap(5);
   
	Label aIDLabel1 = new Label("Alien ID");
	Label nameLabel1 = new Label("First Name");
	Label nameLabel2 = new Label("Last Name");

	Label aIDLabel2 = new Label("Alien ID");
	Label nameLabel3 = new Label("First Name");
	Label nameLabel4 = new Label("Last Name");
	Label statusLabel = new Label("Status");

	//Input stuff
	idInput = new TextField();
	idInput.setPrefColumnCount(10);

	fNameInput = new TextField();
	fNameInput.setPrefColumnCount(10);
	lNameInput = new TextField();
	lNameInput.setPrefColumnCount(10);

	
	//Output stuff
	fNameOutput = new TextField();
	fNameOutput.setPrefColumnCount(10);
	fNameOutput.setDisable(true);

	lNameOutput = new TextField();
	lNameOutput.setPrefColumnCount(10);
	lNameOutput.setDisable(true);

	idOutput = new TextField();
	idOutput.setPrefColumnCount(10);
	idOutput.setDisable(true);

	statusInput = new TextField();
	statusInput.setPrefColumnCount(10);



	grid.add(aIDLabel1, 0, 0);
	grid.add(idInput,1,0);

	grid.add(nameLabel1, 0, 1);
	grid.add(fNameInput,1,1);
	grid.add(nameLabel2, 2, 1);
	grid.add(lNameInput,3,1);


	
	
	

	grid.add(aIDLabel2, 0, 3);
	grid.add(idOutput,1,3);

	grid.add(nameLabel3, 0, 4);
	grid.add(fNameOutput,1,4);

	grid.add(nameLabel4, 0, 5);
	grid.add(lNameOutput,1,5);

	grid.add(statusLabel, 0, 6);
	grid.add(statusInput,1,6);

	Button search = new Button("Search");
	GridPane.setConstraints(search, 0, 2);
	grid.getChildren().add(search);

	Button submit = new Button("Submit");
	GridPane.setConstraints(submit, 0, 7);
	grid.getChildren().add(submit);
	
	//Button that takes the stuff in the top half, searches for Imm, and displays what it got in the bottom
	//ToDo Error handling
	search.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
		Immigrant foundImm = Immigrant.createImmigrant(idInput.getText(),fNameInput.getText(),lNameInput.getText());
		fNameOutput.setText(foundImm.getFirstName());
		lNameOutput.setText(foundImm.getLastName());
		idOutput.setText(foundImm.getAlienID());
            }
	});

	//Button with no functions yet
	submit.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
		Add stuff here
            }
	});

	Group root = (Group) scene.getRoot();
   	root.getChildren().add(grid);

        stage.setScene(scene);
        stage.show();

    }

    public static void main() {
        launch();
    }
    
}