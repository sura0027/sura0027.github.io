//Written by Saanvi Kulkarni kulka362
//Written by Kali Sura sura0027
package Projects;
import Projects.Canvas;
import Projects.Rectangle;
import java.awt.Color;
import java.util.Random;
import java.util.Scanner;
import Projects.Circle;
import Projects.Triangle;
public class FractalDrawer{
    //totalArea initalized to 0, increments every time a new shape is created
    private double totalArea=0.0;
    //empty constructor to instantiate FractralDrawer class
    public FractalDrawer(){

    }
    //Draw fractral method which takes in the user input and calls the appriate fractal shape method to create the fractral shape. Returns the total area of the fractral at the end.
    public double drawFractal(String type){
        //Creates a blank canvas of 800 by 800 diemensions
        Canvas c = new Canvas(800,800);
        //3 loops, each that will call recursive factral method that corresponds to what shape the user want's to build a fractal from
        if (type.equals("circle")){
            //If user types in circle, create a circle instance using a pre-enntered x position, y position and radius, that will draw a circle in the middle of the canvas
            double xPos_circ= 400.0;//
            double yPos_circ=400.0;
            double radius_circ = 100.0;
            Circle type1 = new Circle(xPos_circ, yPos_circ,radius_circ);
            //Calls drawCircleFractral, using the pre-entered x position, y postion, radius, Canvas c object, Circle object type1's color and a recursion depth of 7 levels
            drawCircleFractal(radius_circ, xPos_circ, yPos_circ, type1.getColor(), c, 7 );
        }

        else if(type.equals("rectangle")){
            //If user types in rectangle, initalize the x position, y position, width and height with pre-set diemension, so first rectangle appears in the middle of canvas
            double xPos= 400.0;
            double yPos=400.0;
            double wt=100.0;
            double ht=200.0;
            //Creates a rectangle class object, using pre-set width, height, x position and y position
            Rectangle type2 = new Rectangle(xPos, yPos, wt, ht);
            //Calls drawRectangleFractral method using the pre-set conditions, the Canvas Object c, and the triangle object type2's color and a recursion depth of 7 layers
            drawRectangleFractal( wt, ht,xPos, yPos, type2.getColor(), c, 7);
        }
        else if(type.equals("triangle")){
            //If user types in triangle, initalize the x position, y position, width and height with pre-set diemension, so first triangle appears in the middle of canvas
            double XPos = 400.0;
            double Ypos = 400.0;
            double width=100.0;
            double height=200.0;
            //Creates a triangle class object, using pre-set width, height, x position and y position
            Triangle type3 = new Triangle(XPos, Ypos, width, height);
            //Calls drawTriangleFractral method using the pre-set conditions, the Canvas Object c, and the triangle object type2's color and a recursion depth of 7 layers
            drawTriangleFractal(width, height, XPos,Ypos,type3.getColor(), c, 7);   
        }
    //returns the total area of the shapes inside of the fractral drawing
       return totalArea;
  
    }
    //Method that draws the rectangle fractral pattern with the specified amount of levels
    public void drawRectangleFractal(double width, double height, double x, double y, Color c,  Canvas can, int level){
        //Creates a new instance of the Rectangle Class with parameters x, y, width and height
        Rectangle myRectangle = new Rectangle(x,y,width,height);
        //Creates a new instance of the Random Class and then assigns integers r,g,b with a random number between 0 and 255
        Random randomColorRec= new Random();
        int r = randomColorRec.nextInt(255);
        int g = randomColorRec.nextInt(255);
        int b = randomColorRec.nextInt(255);
        //Creates a new instance of the Color class with the random integers r,g,b which stand for the r,g,b color values using the method .nextInt()
        Color randColorRec = new Color(r,g,b);
        //Sets this color to be the rectangle obbject's color
        myRectangle.setColor(randColorRec);
        //Uses method from Canvas class to draw a rectangle
        can.drawShape(myRectangle);
        //Increments total area by adding the area of the rectangle to the totalArea variable
        totalArea+=myRectangle.calculateArea();
        //Assigns a new width and height value that is half of the orginal value, so rectangle shrinks in size with every recursion level
        double newWidth=width/2;
        double newHeight = height/2;
        //Base case, if level reaches 0, return to exit the method
        if( level==0){
            return;
        }
        
        else{
            //Recursive call, decrements level and recursively calls drawRectangleFractral to draw a rectangle in the four corners of the orginal rectangle
            level--;
                drawRectangleFractal(newWidth, newHeight, x-width, y+height, randColorRec, can, level);
                drawRectangleFractal(newWidth, newHeight, x+width, y+height, randColorRec, can, level);
                drawRectangleFractal(newWidth, newHeight, x-width, y-height, randColorRec, can, level);
                drawRectangleFractal(newWidth, newHeight, x+width, y-height, randColorRec, can, level);
        }
    }
    //Method that draws the circle fractral pattern with the specified amount of levels
    public void drawCircleFractal(double radius, double x, double y, Color c,  Canvas can, int level){
        //Creates a new instance of the Circle Class with parameters x, y and radius
            Circle myCircle = new Circle(x, y, radius);
            Random randomColorCirc= new Random();
            int r = randomColorCirc.nextInt(255);
            int g =randomColorCirc.nextInt(255);
            int b = randomColorCirc.nextInt(255);
            Color randColorCirc= new Color(r, g, b);        
            //Sets this color to be the circle obbject's color
            myCircle.setColor(randColorCirc);
            //Uses method from Canvas class to draw a circle
            can.drawShape(myCircle);
            //Increments total area by adding the area of the circle to the totalArea variable
            totalArea+=myCircle.calculateArea();
            //Assigns a new radius value that is half of the orginal value, so circle shrinks in size with every recursion level
            double newRadius = radius/2; 
             //Base case, if level reaches 0, return to exit the method
            if (level==0){
            return;
            }
            else{ 
                //Recursive call, decrements level and recursively calls drawCircleFractral to draw a circle in the four corners of the orginal circle
                level--;
                drawCircleFractal(newRadius, x - radius, y + radius, randColorCirc, can, level);
                drawCircleFractal(newRadius, x + radius, y- radius, randColorCirc, can, level);
                drawCircleFractal(newRadius, x+radius, y + radius, randColorCirc, can, level);
                drawCircleFractal(newRadius, x-radius, y - radius, randColorCirc, can, level);
        }
        
    }
    
//Method that draws the triangle fractral pattern with the specified amount of levels
    public void drawTriangleFractal(double width, double height, double x, double y, Color c,  Canvas can, int level){
        //Creates a new instance of the Triangle Class with parameters x, y, width and height
        Triangle myTriangle = new Triangle(x,y,width,height);
        Random randomColorTri = new Random();
        int r =randomColorTri.nextInt(255);
        int g = randomColorTri.nextInt(255);
        int b = randomColorTri.nextInt(255);
        Color randColorTri = new Color(r,g,b);
        //Sets this color to be the triangle object's color
        myTriangle.setColor(randColorTri);
        //Uses method from Canvas class to draw a triangle
        can.drawShape(myTriangle);
         //Increments total area by adding the area of the triangle to the totalArea variable
        totalArea+=myTriangle.calculateArea();
        //Assigns a new width and height value that is half of the orginal value, so triangle shrinks in size with every recursion level
        double newWidth=width/2;
        double newHeight = height/2;
         //Base case, if level reaches 0, return to exit the method
        if(level==0){
            return;
        }
        else{
            //Recursive call, decrements level and recursively calls drawTriangleFractral to draw a triangle in the four corners of the orginal triangle
                level--;
                drawTriangleFractal(newWidth, newHeight, x-width, y-height, randColorTri, can, level);
                drawTriangleFractal(newWidth, newHeight, x-width, y+height, randColorTri, can, level);
                drawTriangleFractal(newWidth, newHeight, x+width, y+height, randColorTri, can, level);
                drawTriangleFractal(newWidth, newHeight, x+width, y-height, randColorTri, can, level);
        }

    }
    //Main method which calls for user input
    public static void main(String[] args){
        //Scanner object input, which is used to take in user input using the method .nextLine()
        Scanner input = new Scanner(System.in);
        System.out.println("What shape would you like to do a fractal of? Pick triangle, rectangle or circle.");
        String shape = input.nextLine();
        //Creates a new instance of the Fractral Drawer class with empty constructor
        FractalDrawer f = new FractalDrawer();
        //Calls method drawFractral on Fractral Drawer Object, and print's out the total area of the fractral after method executes
        f.drawFractal(shape);
        System.out.println("The total area of the" + shape + "fractal is " + f.totalArea);
        return;
        }
}