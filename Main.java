/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;



public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7); // radius = 7
        Shape rectangle = new Rectangle(5, 10); // width = 5, height = 10

        // Draw & print Circle
        ((Drawable) circle).draw();
        System.out.println("Area of Circle: " + circle.getArea());

        System.out.println();

        // Draw & print Rectangle
        ((Drawable) rectangle).draw();
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}

