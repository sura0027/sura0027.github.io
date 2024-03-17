//Written by Saanvi Kulkarni kulka362
//Written by Kali Sura sura0027
package Projects;

import java.awt.Color;

public class Triangle {
    private double xPos; // initializing the horizontal position
    private double yPos; // initializing the vertical position
    private double width; // initializing the width of the triangle
    private double height; // initializing the length of the triangle
    private Color color; // initializing the color for the triangle
    public Triangle(double xPos, double yPos, double width, double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = Color.WHITE; 
    }

    public double calculatePerimeter() { // Calculates the perimeter of triangle
        double side = Math.sqrt((width / 2) * (width / 2) + height * height);
        return width + 2 * side;
    }

    public double calculateArea() { // Calculates the area of triangle
        return (width * height) / 2;
    }

    public void setColor(Color color) { // Sets a color for the triangle
        this.color = color;
    }

    public void setPos(double xPos, double yPos) { // Sets the horizontal and vertical position for the triangle
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void setHeight(double height) {  // Sets the horizontal and vertical position for the triangle
        this.height = height;
    }

    public void setWidth(double width) {  // Sets the width for the triangle
        this.width = width;  
    }

    public Color getColor() { // Returns a color for the triangle
        return this.color;
    }

    public double getXPos() { // Returns a x-postion for the triangle
        return this.xPos;
    }

    public double getYPos() { // Returns a y-postion for the triangle
        return this.yPos;
    }

    public double getHeight() { // Returns a height for the triangle
        return this.height;
    }

    public double getWidth() { // Returns a width for the triangle
        return this.width;
    }
}


