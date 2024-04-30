package shapes;

public class Square extends Rectangle{
    private boolean isFilled;

    public Square(String color, int size, boolean isFilled) {
        super(color, size, size);
        this.isFilled = isFilled;
    }

    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setWidth (int width) {
        super.setLength(width);
        super.setWidth(width);
    }

    public boolean getIsFilled() {
        return isFilled;
    }
}

