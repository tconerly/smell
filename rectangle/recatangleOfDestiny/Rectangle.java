package recatangleOfDestiny;

import java.util.logging.Logger;

public class Rectangle {
    //private variables cannot be accessed outside of class 
    private double height;
    private double width;
    private double area;
   


//sets base rectanlge values to 1
    public Rectangle(){
        height = 1;
        width = 1;
        setArea();
    }
//user specifies values of rectangle in test class 
    public Rectangle(double ht, double w){
        height = ht;
        width = w;
        setArea();
    }
    
//mutator 
    public void setHeight(double ht){
    if (ht >0 )
        height = ht;
    else
        Logger.getLogger("Invalid height: " + ht);
    }

    //accessor
    public double getHeight()
    {
        return height;
    }

    public void setWidth(double w){
        if (w >0 )
            width = w;
        else
            Logger.getLogger("Invalid width: " + w);    
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return area;
    }

    public void setArea(){
        area = height * width;
    }
//method to properly print out rectangle demensions
    public void printRectangle(){
        Logger.getLogger("height " + height);
        Logger.getLogger("width " + getWidth());
        Logger.getLogger("area " + getArea());

    }
}   



