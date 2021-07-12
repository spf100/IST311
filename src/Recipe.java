import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

public class Recipe extends Application {
    static AnchorPane login;
    static List<AnchorPane> grid = new ArrayList<AnchorPane>();

    private static int index_cur = 0;

    public static void main(String[] args)  {
        // runs in AWT thread
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            login = (AnchorPane) FXMLLoader.load(getClass().getResource("View/LoginForm.fxml"));

            Scene scene = new Scene(login, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    private void init_app(){
        for(int i = 0; i < grid.size(); i++){

        }
    }
    public static AnchorPane get_pane(int index){
        return grid.get(index);
    }

}