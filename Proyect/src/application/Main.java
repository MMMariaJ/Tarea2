package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Controles
        Label dateLabel = new Label("Selecciona por favor una fecha:");
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Escoge un color :");
        ColorPicker colorPicker = new ColorPicker();

        Button confirmButton = new Button("Aceptar");

        // Acciones
        confirmButton.setOnAction(event -> {
            LocalDate selectedDate = datePicker.getValue();
            javafx.scene.paint.Color selectedColor = colorPicker.getValue();
            System.out.println("Fecha seleccionada es la siguiente: " + selectedDate);
            System.out.println("Color seleccionado es el siguiente: " + selectedColor);
        });

        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, confirmButton);
        vbox.setSpacing(14);

        Scene scene = new Scene(vbox, 450, 350);

        primaryStage.setTitle("Tarea de fecha y colores");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}