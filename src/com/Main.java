/**
 * 
 */
package com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * @author Bruno
 *
 */
public class Main extends Application{

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//GridPane mainPane = new GridPane();
		//Group root = new Group();
		
		
		
		TableView<Usuario> table = new TableView<Usuario>();
		
		TableColumn<Usuario, String> userName = new TableColumn<Usuario, String>("Nome");
		
		TableColumn<Usuario, String> userEmail = new TableColumn<Usuario, String>("Email");
		
		TableColumn<Usuario, String> userFullName = new TableColumn<Usuario, String>("Nome completo");
		
		TableColumn<Usuario, String> firstName = new TableColumn<Usuario, String>("Primeiro nome");
		firstName.setPrefWidth(100);
		
		TableColumn<Usuario, String> lastName = new TableColumn<Usuario, String>("Sobrenome");
		
		
		
		userFullName.getColumns().addAll(firstName,lastName);
		
		TableColumn<Usuario, Boolean> activeCol = new TableColumn<Usuario, Boolean>("Active");
		
		
		table.getColumns().addAll(userName, userEmail, userFullName, activeCol);
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 430, 300);
		
		root.setPadding(new Insets(5));
		root.getChildren().add(table);
		
		
		
		
		
		
		
		
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tabela A");
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
