package Day11;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TodoList extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<String> todos = FXCollections.observableArrayList();
        ListView<String> listview = new ListView<>(todos);

        TextField inputField = new TextField();

        Button addButton = new Button();
        addButton.setText("Add");
        addButton.disableProperty().bind(Bindings.isEmpty(inputField.textProperty()));

        addButton.setOnAction(e-> {
            todos.add(inputField.getText());
            inputField.setText("");
            inputField.requestFocus();
        });


        HBox entryBox = new HBox();
        entryBox.getChildren().addAll(inputField, addButton);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(listview, entryBox);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Todos");
        primaryStage.show();
    }
}
