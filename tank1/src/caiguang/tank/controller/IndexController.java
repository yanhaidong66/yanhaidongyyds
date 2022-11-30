package caiguang.tank.controller;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class IndexController {

        @FXML
        private ImageView startGame;

        @FXML
        void moseClickGameBegin(MouseEvent event) {

        }

        @FXML
        void moseEnterGameBegin(MouseEvent event) {
            startGame.setOpacity(0.5);
        }

        @FXML
        void moseExitGameBegin(MouseEvent event) {
            startGame.setOpacity(1);
        }

    }


