public class CircleApp {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0, 10.0, 5.0);
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle();

        System.out.println("c1 radius: " + c1.getRadius() + " origin + (" + c1.getOriginX() + ", " + c1.getOriginY()
                + ") circumference: " + c1.getCircumference() + " area: " + c1.getArea());
        System.out.println("c2 radius: " + c2.getRadius() + " origin + (" + c2.getOriginX() + ", " + c2.getOriginY()
                + ") circumference: " + c2.getCircumference() + " area: " + c2.getArea());
        System.out.println("c3 radius: " + c3.getRadius() + " origin + (" + c3.getOriginX() + ", " + c3.getOriginY()
                + ") circumference: " + c3.getCircumference() + " area: " + c3.getArea());

        System.out.println("c1 " + c1);
        System.out.println("c2 " + c2);
        System.out.println("c3 " + c3);

        System.out.println("c2 overlaps c3: " + c2.isOverlappedWith(c3));
        System.out.println("c3 overlaps c2: " + c3.isOverlappedWith(c2));
        System.out.println("c2 overlaps c3: " + Circle.isOverlappedWith(c2, c3));

        System.out.println("c2 encloses c3: " + c3.isEnclosedBy(c2));
        System.out.println("c3 encloses c2: " + c2.isEnclosedBy(c3));

        c2.move(10.0, 20.0);
        System.out.println("moved c2: " + c2);
        System.out.println("c2 overlaps c1: " + c1.isOverlappedWith(c2));
        System.out.println("c2 encloses c3: " + c3.isEnclosedBy(c2));

        c1.scale(20.0);
        System.out.println("scaled c1: " + c1);

    }
}
