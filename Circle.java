public class Circle {
    private double radius;
    private double originX;
    private double originY;

    // Constructors
    public Circle(double radius, double originX, double originY) {
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius) {
        this(radius, 0.0, 0.0);
    }

    public Circle() {
        this(1.0, 0.0, 0.0);
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getOriginX() {
        return originX;
    }

    public double getOriginY() {
        return originY;
    }

    // Setters
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public void setOriginX(double originX) {
        this.originX = originX;
    }

    public void setOriginY(double originY) {
        this.originY = originY;
    }

    // helpful methods
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void move(double x, double y) {
        originX = x;
        originY = y;
    }

    public String toString() {
        return "Circle[radius: " + radius + " center: (" + originY + ", " + originX + ")";
    }

    public void scale(double scaleFactor) {
        radius *= scaleFactor;
    }

    public boolean isOverlappedWith(Circle c) {
        return (this.radius + c.radius <= Math
                .sqrt(Math.pow(this.originX - c.originX, 2) + Math.pow(this.originY - c.originY, 2)));
    }

    public static boolean isOverlappedWith(Circle c1, Circle c2) {
        return (c1.radius + c2.radius <= Math.sqrt(Math.pow(c1.originX - c2.originX, 2)
                + Math.pow(c1.originY - c2.originY, 2)));
    }

    public boolean isEnclosedBy(Circle c) {
        return (Math.sqrt(Math.pow(this.originX - c.originX, 2)
                + Math.pow(this.originY - c.originY, 2)) < c.radius - this.radius);
    }

}
