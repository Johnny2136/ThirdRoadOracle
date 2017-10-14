/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdroadoracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


/**
 *
 * @author johnn
 */
public class ThirdRoadOracle extends Application {
    
    List<Image> deck = new ArrayList<>();

    public void load() {
        for (int i = 1; i < 43; i++) {
            deck.add(new Image(getClass().getResource(i + ".jpg").toExternalForm()));
        }
    }

    @Override
    public void start(Stage primaryStage) {

        load();

        primaryStage.setTitle("Third Road Oracle Viewer");

        BorderPane bPane1 = new BorderPane();
        HBox pane1 = new HBox(100);
        

        ImageView view0 = new ImageView(deck.get(0));
        
        Button refresh = new Button ("Draw Card");
        refresh.setOnAction((event) -> {

            Collections.shuffle( deck);

            view0.setImage(deck.get(0));
            
            
        });

        pane1.setAlignment(Pos.CENTER);
        
        pane1.getChildren().add(refresh);
        pane1.getChildren().addAll(view0);      

        bPane1.setCenter(pane1);
        
        Scene scene1 = new Scene(bPane1, 600, 650);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}