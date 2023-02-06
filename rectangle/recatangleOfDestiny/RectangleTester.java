package recatangleOfDestiny;
public class RectangleTester {
    public static void main(String[] args ){

            //rectangle objects 
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle(7,7);

            //setting height and width for two rectangles so area can be calculated 
        rect1.setHeight (10);
        rect1.setWidth (10);
        rect1.setArea();
        

        rect2.setHeight (9);
        rect2.setWidth (9);
        rect2.setArea();
        
        //prints rectangle info
        rect1.printRectangle();
        rect2.printRectangle();
        rect3.printRectangle();

    
    }
}