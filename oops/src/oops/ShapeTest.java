package oops;
import java.util.*;
//Base class
class Shape {
 public void draw() {
     System.out.println("Drawing Shape");
 }

 public void erase() {
     System.out.println("Erasing Shape");
 }
}

//Subclass: Circle
class Circle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing Circle");
 }

 @Override
 public void erase() {
     System.out.println("Erasing Circle");
 }
}

//Subclass: Triangle
class Triangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing Triangle");
 }

 @Override
 public void erase() {
     System.out.println("Erasing Triangle");
 }
}

//Subclass: Square
class Square extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing Square");
 }

 @Override
 public void erase() {
     System.out.println("Erasing Square");
 }
}

//Main class to demonstrate polymorphism
public class ShapeTest {
 public static void main(String[] args) {
     // Polymorphic references
     Shape c = new Circle();
     Shape t = new Triangle();
     Shape s = new Square();

     // Calling overridden methods
     c.draw();    // Drawing Circle
     c.erase();   // Erasing Circle

     t.draw();    // Drawing Triangle
     t.erase();   // Erasing Triangle

     s.draw();    // Drawing Square
     s.erase();   // Erasing Square
 }
}