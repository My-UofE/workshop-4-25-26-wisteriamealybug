// A Rectangle class
public class Rectangle {

    // 4 instance attributes
    private double width;
    private double height;
    private double originX = 0.0;
    private double originY = 0.0;

    // 1 static attributes
    public static final int NUMBER_OF_SIDES = 4;

    // main constructor
    public Rectangle(double width, double height, double originX, double originY) {
        this.width = width;
        this.height = height;
        this.originX = originX;
        this.originY = originY;
    }

    public Rectangle(double width, double height) {
        this(width, height, 0, 0);
    }

    public Rectangle() {
        this(1, 1);
    }

    // method: move the rectangle
    public void move(double dx, double dy) {
        originX += dx;
        originY += dy;
    }

    // method: compute the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // method: compute the area of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // method: scale the rectangle
    public void scale(double scaleX, double scaleY) {
        width *= scaleX;
        height *= scaleY;
    }

    public void scale(double scale) {
        scale(scale, scale);
    }

    public boolean isOverlappedWith(Rectangle r) {
        boolean x_overlap = (Math.abs(this.originX - r.originX) <= (this.width + r.width) / 2);
        boolean y_overlap = (Math.abs(this.originY - r.originY) <= (this.height + r.height) / 2);

        return (x_overlap && y_overlap);
    }

    public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
        boolean x_overlap = (Math.abs(r1.originX - r2.originX) <= (r1.width + r2.width) / 2);
        boolean y_overlap = (Math.abs(r1.originY - r2.originY) <= (r1.height + r2.height) / 2);

        return (x_overlap && y_overlap);
    }

    public double calcRatio() {
        return height / width;
    }

    public boolean isSquare() {
        if (calcRatio() >= 0.999 && calcRatio() <= 1.001) {
            return true;
        }
        return false;
    }

    // getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getOriginX() {
        return originX;
    }

    public double getOriginY() {
        return originY;
    }

    // Setters

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public void setOrginX(double originX) {
        this.originX = originX;
    }

    public void setOriginY(double originY) {
        this.originY = originY;
    }

    // Return a description of a rectangle in the form of
    // Rectangle[x=*,y=*,w=*,h=*]
    public String toString() {
        return "Rectangle[x=" + originX + ",y=" + originY + ",w=" + width + ",h=" + height + "]";
    }
}
