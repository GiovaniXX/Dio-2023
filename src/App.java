import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primmaryStage) throws Exception {
             primmaryStage.setTitle("Academia dos Devs");
             Button botao = new Button("Click");
             botao.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent arg0) {
                          System.out.println("Click next");             
                }
                
             });

             StackPane root = new StackPane();
             root.getChildren().addAll(botao);
             primmaryStage.setScene(new Scene(root, 300, 250));
             primmaryStage.show();
    }
}
