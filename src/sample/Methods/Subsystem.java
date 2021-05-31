package sample.Methods;

import javafx.scene.canvas.GraphicsContext;

public class Subsystem extends Shape {

    double height;

    double width;

    public Subsystem(double width,double height) {

        // calling Shape constructor

        this.height = height;

        this.width = width;  }

    @Override

    double area() {

        return height * width;   }

    @Override

    public String toString() {

        return "Rectangle color is " + super.color +  "and area is : " + area();   }

    @Override
    public void draw(GraphicsContext gr) {
        gr.strokeRect(200,100,this.width,this.height);
        gr.strokeLine(230,100,230,200);
        gr.strokeLine(200+this.width - 30,100,200+this.width - 30,200);
    }
}
