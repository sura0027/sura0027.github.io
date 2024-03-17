//Written by Saanvi Kulkarni kulka362
//Written by Kali Sura sura0027
package Projects;

import java.awt.Color;

public class Circle {
    public double xPos; // initializing the horizontal position
    public double yPos; // initializing the vertical position
    public double radius; // initializing the circle radius
    public Color color; // initializing the color for the circle

    public Circle(double xPos, double yPos, double radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        this.color = Color.WHITE; 
    }

    public double calculatePerimeter() {  // Calculates the perimeter of circle
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {  // Calculates the area of circle
        return Math.PI * this.radius * this.radius;
    }

    public void setColor(Color color) { // Sets a color for the circle
        this.color = color;
    }

    public void setPos(double xPos, double yPos) { // Sets the horizontal and vertical position for the circle
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void setRadius(double radius) { //Sets a radius for the circle
        this.radius = radius;
    }

    public Color getColor() { // returns the color for the circle
        return this.color;
    }

    public double getXPos() { // Returns a x-postion for the circle
        return this.xPos;
    }

    public double getYPos() { // Returns a y-position for the circle
        return this.yPos;
    }

    public double getRadius() { // Returns a radius for the circle
        return this.radius;
    }
}


