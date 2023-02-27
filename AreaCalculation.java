import java.util.Scanner;

//Shape class extended by Square and Rectangle class to provide the implementations of the setWidth, setHeight, and calculateArea methods.
abstract class Shape
{
    int m_height;
    int m_width;
    abstract void setWidth(int width);
    abstract void setHeight(int height);
    abstract int calculateArea(int m_width, int m_height);
}

/*object of Rectangle created in main class, user input for width and height are passed as parameters,
their dimensions are set using the setWidth and setHeight methods, and calculates their areas using the calculateArea method */
class Rectangle extends Shape
{
    public void setWidth(int width)
    {
        m_width = width;
    }

    public void setHeight(int height)
    {
        m_height = height;
    }

    public int getWidth()
    {
        return m_width;
    }

    public int getHeight()
    {
        return m_height;
    }

    public int calculateArea(int m_width, int m_height)
    {
        return m_width * m_height;
    }
}

    /*object of square created in main class, user input for width and height are passed as parameters,
    their dimensions are set using the setWidth and setHeight methods, and calculates their areas using the calculateArea method */


class Square extends Shape

{
    public void setWidth(int width)
    {
        m_width = width;
    }

    public void setHeight(int height)
    {
        m_height = height;
    }

    public int getWidth()
    {
        return m_width;
    }

    public int getHeight()
    {
        return m_height;
    }
    public int calculateArea(int m_width, int m_height)
    {
        return m_width * m_height;
    }

}
class AreaCalculation{
    public static void main(String args[]) {
        int width, height;

        //Object of Rectangle and square class created, their dimensions are set using setWidth and setHeight methods, area calculated using calculateArea and printed on console.
        Rectangle rectangleDimension = new Rectangle();
        Square squareDimension = new Square();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of rectangle: ");
        width = input.nextInt();
        System.out.println("Enter the Height of rectangle: ");
        height = input.nextInt();
        rectangleDimension.setWidth(width);
        rectangleDimension.setHeight(height);
        int rectangleWidth = rectangleDimension.getWidth();
        int rectangleHeight = rectangleDimension.getHeight();
        System.out.println("width of rectangle: " + rectangleWidth);
        System.out.println("height of rectangle: " + rectangleHeight);
        int rectangleArea = rectangleDimension.calculateArea(rectangleWidth, rectangleHeight);
        System.out.println("area of rectangle: " + rectangleArea);

        System.out.println("Enter the width of square: ");
        width = input.nextInt();
        System.out.println("Enter the Height of square: ");
        height = input.nextInt();
        squareDimension.setWidth(width);
        squareDimension.setHeight(height);
        int squareWidth = squareDimension.getWidth();
        int squareHeight = squareDimension.getHeight();
        System.out.println("width of square: " + squareWidth);
        System.out.println("height of square: " + squareHeight);
        int squareArea = squareDimension.calculateArea(squareWidth, squareHeight);
        System.out.println("area of rectangle: " + squareArea);

    }

}
