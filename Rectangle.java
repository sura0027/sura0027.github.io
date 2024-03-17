//Written by Saanvi Kulkarni kulka362
//Written by Kali Sura sura0027
package Projects;
import Projects.Canvas;
import java.awt.Color;
public class Rectangle {
    public double xPos; //initializing the horizontal position
    public double yPos; //initializing the vertical position
    public double width;//initializing the width of the rectangle
    public double height;//initalizing the height of the rectangle
    public Color shapeColor;//initalizing color of the rectangle
    
    public Rectangle(double xPosition, double yPosition, double wh, double ht){ //Constrctor for Rectangle Class
        xPos=xPosition;
        yPos=yPosition;
        width=wh;
        height=ht;
    }
    public double calculatePerimeters(){//Calculates perimeter of rectangle
        return (width*2) + (height*2);
    }
    public double calculateArea() {//calculates area of the rectangle
        return (width*height);
    }
    public void setColor(Color shape){//sets the color of the rectangle
        shapeColor=shape;
    }
    public void setPos(double newxPos, double newyPos){//sets the horizontal and vertical position of the rectangle
        xPos=newxPos;
        yPos=newyPos;
    }
    public void setHeight( double newHeight){//sets the height of the rectangle
        height=newHeight;
    }
    public void setWidth(double newWidth){//sets the width of the rectangle
        width=newWidth;
    }
    public Color getColor(){//returns the color of the rectangle
        return shapeColor;
    }
    public double getXPos(){//returns the horizontal position of the rectangle
        return xPos;
    }
    public double getYPos(){//returns the vertical position of the rectangle
        return yPos;
    }
    public double getHeight(){//returns the height of the rectangle
        return height;
    }
    public double getWidth(){//returns the width of the rectangle
        return width;
    }
}
