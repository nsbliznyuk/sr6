package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class Main extends Application {

    @Override public void start(Stage stage) {
        Group group = new Group();
        Scene scene = new Scene(group);
        stage.setTitle("Charts");
        stage.setWidth(800);
        stage.setHeight(600);

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("China", 1275),
                        new PieChart.Data("India", 1017),
                        new PieChart.Data("Brazil", 172),
                        new PieChart.Data("UK", 59),
                        new PieChart.Data("USA", 285));

        PieChart chart = new PieChart(pieChartData);

        group.getChildren().add(chart);

        //((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}