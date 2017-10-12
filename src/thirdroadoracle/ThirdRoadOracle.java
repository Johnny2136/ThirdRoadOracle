/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdroadoracle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author johnn
 */
public class ThirdRoadOracle extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView image = new ImageView(new Image(ThirdRoadOracle.class.getResourceAsStream("images/major04.jpg")));
        Pane root = new Pane();
        root.getChildren().add(image);
        Scene scene = new Scene(root, 320, 620);
        primaryStage.setTitle("Third Road Oracle! by Francesca DeGrandis");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
