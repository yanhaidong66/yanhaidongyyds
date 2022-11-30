package caiguang.tank.scene;

import com.sun.javafx.fxml.FXMLLoaderHelper;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Index {
    public static void load(Stage stage)  {
        try {
            Parent root= FXMLLoader.load(Index.class.getResource("/fxml/index.fxml"));
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
