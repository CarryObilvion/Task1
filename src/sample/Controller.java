package sample;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import sample.Methods.Library;
import sample.Methods.Module1;
import sample.Methods.Subsystem;

import java.awt.*;

public class Controller  {

    public Canvas can;

    GraphicsContext gc;

    public void moduleClicked(MouseEvent mouseEvent) {
        gc = can.getGraphicsContext2D();
        gc.clearRect(0,0,can.getWidth(),can.getHeight());
        Module1 module = new Module1(200,100);
        gc.fillText("Модуль", 300,  150);
        gc.setTextAlign(TextAlignment.CENTER);
        module.draw(gc);

    }


    public void subsystemClicked(MouseEvent mouseEvent) {
        gc = can.getGraphicsContext2D();
        gc.clearRect(0,0,can.getWidth(),can.getHeight());
        Subsystem module = new Subsystem(200,100);
        gc.fillText("Подсистема", 300,  150);
        gc.setTextAlign(TextAlignment.CENTER);
        module.draw(gc);
    }

    public void libraryClicked(MouseEvent mouseEvent) {
        gc = can.getGraphicsContext2D();
        gc.clearRect(0,0,can.getWidth(),can.getHeight());
        Library module = new Library(200,100);
        gc.fillText("Библиотека", 300,  150);
        gc.setTextAlign(TextAlignment.CENTER);
        module.draw(gc);
    }
}
