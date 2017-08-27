/**
 * 
 */
package com.implementado;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * @author Bruno
 *
 */
public class MainImp extends Application{

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		TableView<UsuarioImp> table = new TableView<UsuarioImp>();
		
		TableColumn<UsuarioImp, String> userName = new TableColumn<UsuarioImp, String>("Nome");
		
		TableColumn<UsuarioImp, String> userEmail = new TableColumn<UsuarioImp, String>("Email");
		
		TableColumn<UsuarioImp, String> fullName = new TableColumn<UsuarioImp, String>("Nome completo");
		
		TableColumn<UsuarioImp, String> firstName = new TableColumn<UsuarioImp, String>("Primeiro nome");
		//firstName.setPrefWidth(100);
		
		TableColumn<UsuarioImp, String> lastName = new TableColumn<UsuarioImp, String>("Sobrenome");
		
		fullName.getColumns().addAll(firstName,lastName);
		
		TableColumn<UsuarioImp, Boolean> activeCol = new TableColumn<UsuarioImp, Boolean>("Active");
		
		
		// IMPLEMENTAÇÃO
		userName.setCellValueFactory(new PropertyValueFactory<>("userName"));
		userEmail.setCellValueFactory(new PropertyValueFactory<>("userEmail"));
		fullName.setCellValueFactory(new PropertyValueFactory<>("Full Name"));
		firstName.setCellValueFactory(new PropertyValueFactory<>("First Name"));
		lastName.setCellValueFactory(new PropertyValueFactory<>("Last Name"));
		
		
		// SET SORT TYPE FOR USERNAME COLUMN
		userName.setSortType(TableColumn.SortType.DESCENDING);
		lastName.setSortable(false);
		
		
		// DISPLAY ROW DATA
		ObservableList<UsuarioImp> lista = getUserList();
		table.setItems(lista);
		
		
		
		
		table.getColumns().addAll(userName, userEmail, fullName, activeCol);
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 450, 300);
		
		root.setPadding(new Insets(4));
		root.getChildren().add(table);
		
		
		
		
		
		
		
		
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tabela A");
		primaryStage.show();
		
		
	}
	
	/**
	 * @return
	 */
	private ObservableList<UsuarioImp> getUserList() {
		// TODO Auto-generated method stub
		
		UsuarioImp user1 = new UsuarioImp(1L, "smith","smith@gmail.com", //
				"Susan", "Smith", true);
		UsuarioImp user2 = new UsuarioImp(2L, "mcneil", "mcneil@gmail.com",
				"Anne", "Mcneil", true);
		UsuarioImp user3 = new UsuarioImp(3L, "white", "white@gmail.com",
				"Kenvin", "White",false);
		
		
		
		ObservableList<UsuarioImp> list = FXCollections.observableArrayList(user1, user2, user3);
		return list;
	}

	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
