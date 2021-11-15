package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        //TODO: Star
        Path path = new Path();

        //Moving to the starting point
        MoveTo moveTo=new MoveTo(18, 90);

        //Creating 1st line
        LineTo line1 = new LineTo(220, 90);

        //Creating 2nd line
        LineTo line2 = new LineTo(36,210);

        //Creating 3rd line
        LineTo line3 = new LineTo(120,12);

        //Creating 4th line
        LineTo line4 = new LineTo(179, 210);

        //Creating 5th line
        LineTo line5 = new LineTo(19, 90);

        //Adding all elements to the path
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);
        //Creating a Group object
        Group root = new Group(path);

        //Creating a scene Object
        Scene scene = new Scene(root, 600,600);
        primaryStage.setTitle("Drawing");
        primaryStage.setScene(scene);
        //Displaying the contents of the stage
        primaryStage.show();

        //TODO : Rocket

        MoveTo moveTo1 = new MoveTo(490, 20);

        LineTo line1_1 = new LineTo(455, 60);
        LineTo line1_2 = new LineTo(455, 120);
        LineTo line1_3 = new LineTo(435, 130);
        LineTo line1_4 = new LineTo(435, 150);
        LineTo line1_5 = new LineTo(455,140);
        LineTo line1_6 = new LineTo(520, 140);
        LineTo line1_7 = new LineTo(540, 150);
        LineTo line1_8 = new LineTo(540, 130);
        LineTo line1_9 = new LineTo(520, 120);
        LineTo line1_10 = new LineTo(520,60);
        LineTo line1_11 = new LineTo(490, 20);
        path.getElements().add(moveTo1);
        path.getElements().addAll(
                line1_1, line1_2, line1_3, line1_4,
                line1_5, line1_6, line1_7, line1_8,
                line1_9, line1_10, line1_11);

        //TODO: some square with pattern
        //TODO: square
        MoveTo moveTo2 = new MoveTo(30, 500);
        LineTo line2_1 = new LineTo(30, 350);
        LineTo line2_2 = new LineTo(180, 350);
        LineTo line2_3 = new LineTo(180, 500);
        LineTo line2_4 = new LineTo(30,500);
        path.getElements().add(moveTo2);
        path.getElements().addAll(line2_1, line2_2, line2_3, line2_4);

        //TODO: pattern
        //1st part
        MoveTo moveTo3 = new MoveTo(105, 425);
        LineTo line3_1 = new LineTo(150,435);
        LineTo line3_2 = new LineTo(180,500);
        LineTo line3_3 = new LineTo(120,480);
        LineTo line3_4 = new LineTo(105, 425);
        //2nd part
        LineTo line3_5 = new LineTo(150, 405);
        LineTo line3_6 = new LineTo(180, 350);
        LineTo line3_7 = new LineTo(120, 370);
        LineTo line3_8 = new LineTo(105, 425);
        //3rd part
        LineTo line3_9 = new LineTo(90, 370);
        LineTo line3_10 = new LineTo(30, 350);
        LineTo line3_11 = new LineTo(60 ,405);
        LineTo line3_12 = new LineTo(105, 425);
        //4th part
        LineTo line3_13 = new LineTo(60 ,435);
        LineTo line3_14 = new LineTo(30, 500);
        LineTo line3_15 = new LineTo(90, 480);
        LineTo line3_16 = new LineTo(105, 425);

        path.getElements().add(moveTo3);
        path.getElements().addAll(
                line3_1, line3_2,line3_3, line3_4,
                line3_5,line3_6, line3_7, line3_8,
                line3_9, line3_10, line3_11, line3_12,
                line3_13, line3_14, line3_15, line3_16);

        //TODO: КВАДРАТИКИИИИИИ

        MoveTo moveTo4 = new MoveTo(470, 425);
        LineTo line4_1 = new LineTo(510, 425);
        LineTo line4_2 = new LineTo(510, 465);
        LineTo line4_3 = new LineTo(550, 465);
        LineTo line4_4 = new LineTo(550, 425);
        LineTo line4_5 = new LineTo(510, 425);
        LineTo line4_6 = new LineTo(510, 385);
        LineTo line4_7 = new LineTo(470, 385);
        LineTo line4_8 = new LineTo(470, 345);
        LineTo line4_9 = new LineTo(430, 345);
        LineTo line4_10 = new LineTo(430, 385);
        LineTo line4_11 = new LineTo(470, 385);
        LineTo line4_12 = new LineTo(470, 425);
        LineTo line4_13 = new LineTo(430, 425);
        LineTo line4_14 = new LineTo(430, 465);
        LineTo line4_15 = new LineTo(470, 465);
        LineTo line4_16 = new LineTo(470, 425);

        path.getElements().add(moveTo4);
        path.getElements().addAll(
                line4_1, line4_2, line4_3, line4_4,
                line4_5, line4_6, line4_7, line4_8,
                line4_9, line4_10, line4_11, line4_12,
                line4_13, line4_14, line4_15, line4_16
        );

    }


    public static void main(String[] args) {
        launch(args);
    }
}