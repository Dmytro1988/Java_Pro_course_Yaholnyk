package app.shape;

import app.shape.Shape;

class Square implements Shape {

     private double side;

     public Square(double side) {
         this.side = side;
     }

     @Override
     public double getArea() {
         return side * side;
     }

 }




