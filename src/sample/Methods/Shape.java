package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

 abstract class Shape  {

    //параметры фигуры - приватные поля

    Color color;

    // объявление абстрактных методов

    abstract double area();

    public abstract String toString();

    abstract void draw( GraphicsContext gr);

    // конструктор

    public Shape() {

        System.out.println("Shape constructor called");

          }



    // реализация методов

    public void setColor(Color color) {

        this.color=color;     }

}