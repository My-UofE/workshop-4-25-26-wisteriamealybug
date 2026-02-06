// A Rectangle class
public class Rectangle {

    // 4 instance attributes
    public double width;
    public double height;
    public double originX = 0.0;
    public double originY = 0.0;

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
}
