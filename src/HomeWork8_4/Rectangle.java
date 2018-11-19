package HomeWork8_4;

public class Rectangle {
    private float length=1;
    private float width=1;


    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    public String calculateArea() {
        return "Area: " + getLength() * getWidth();
    }


    public String calculatePerimeter() {
        return "Perimeter: " + 2 * (getLength() + getWidth());
    }

    public void setLength(float length) {
        if (length <= 0 || length > 20)
            throw new IllegalArgumentException("Length must be higher than 0 and smaller than 20 ");
        this.length = length;
    }

    public void setWidth(float width) {
        if (width <= 0 || width > 20)
            throw new IllegalArgumentException("Width must be higher than 0 and smaller than 20!");
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

}
