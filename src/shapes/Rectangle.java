package shapes;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {

        super(color);
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return length * width;
    }
}
