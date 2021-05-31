package sample.Methods;

import javafx.scene.canvas.GraphicsContext;

// Module - зарезервированное слово в Java, поэтому к класс переименован в Module1

public class Module1 extends Shape{

    double height;

    double width;

    public Module1(double width,double height) {

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
    }

}