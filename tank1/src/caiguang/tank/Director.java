package caiguang.tank;

import caiguang.tank.scene.Index;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Director {

    public static final double  WIDTH = 960,HEIGHT =640;

    private Stage stage;

    private Director(){};

    private static Director instance=new Director();

    public static Director getInstance(){
        return instance;
    }

    public void init(Stage stage){
        this.stage=stage;
        AnchorPane root=new AnchorPane();
        Scene scene=new Scene(root,WIDTH,HEIGHT);
        stage.setTitle("坦克");
        stage.getIcons().add(new Image("image/logo.png"));
        stage.setResizable(false);//改变窗口大小
        stage.setScene(scene);
        toIndex();
        stage.show();
    }

    public void gameStart(){

    }

    public void gameOver(){

    }
    public void toIndex(){
        Index.load(stage);

    }


}
