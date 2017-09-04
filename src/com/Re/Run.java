/**
 * 
 */
package com.Re;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



/**
 * @author Bruno
 *
 */
public class Run extends Application{

	Stage window;
	TableView<Tab> table = new TableView<>();
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		window = primaryStage;
		window.setTitle("Tabela");
		
		TableColumn<Tab, String> nameId = new TableColumn<>("userId");
		nameId.setCellValueFactory(new PropertyValueFactory<>("id")); // É ESTA LINHA QUE VOCE MANTER IGUAL AO DO USUARIO/TAB
		nameId.setMinWidth(50);
		
		TableColumn<Tab, String> nameColumn = new TableColumn<>("userName"); // Nome para a Coluna
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("userName")); // É ESTA LINHA QUE VOCE MANTER IGUAL AO DO USUARIO/TAB
		nameColumn.setMinWidth(100);
		
		TableColumn<Tab, String> emailColumn = new TableColumn<>("userEmail");
		emailColumn.setCellValueFactory(new PropertyValueFactory<>("userEmail"));
		emailColumn.setMinWidth(150);
		
		TableColumn<Tab, String> firstColumn = new TableColumn<>("firstName");
		firstColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		firstColumn.setMinWidth(100);
		
		TableColumn<Tab, String> lastColumn = new TableColumn<>("lastName");
		lastColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		lastColumn.setMinWidth(100);
		
		TableColumn<Tab, String> actColumn = new TableColumn<>("userAct");
		actColumn.setCellValueFactory(new PropertyValueFactory<>("activeCol"));
		actColumn.setMinWidth(100);
		
		table = new TableView<>();
		table.setItems(getTab());
		table.getColumns().addAll(nameId, nameColumn, emailColumn, firstColumn, lastColumn, actColumn);
		
		VBox box = new VBox();
		box.getChildren().addAll(table);
		
		Scene scene = new Scene(box, 600, 400);
		
		window.setScene(scene);
		window.show();
		
		//stage.setTitle("Tabela");
		//stage.show();
		
		
		
		
	}

	public ObservableList<Tab> getTab(){
		ObservableList<Tab> tab = FXCollections.observableArrayList();
		tab.add(new Tab(1L, "Bruno", "bruno@gmail.com", "Pruno", "bain", true));
		tab.add(new Tab(2L, "San", "san@gmail.com", "Runo", "brin", true));
		tab.add(new Tab(3L, "Uno", "uno@gmail.com", "no", "ba", true));
		
		return tab;
		
	}
	
	
	
	public static void main(String[]args){
		Application.launch(args);
	}
	
}
