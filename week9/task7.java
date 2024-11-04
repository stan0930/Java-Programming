package week9;

class Circle2 {
    /* The radius of the circle */
    double radius;

    /* The number of objects created */
    static int numberOfObjects = 0;

    /* Construct a circle with radius 1 */
    Circle2() {
        radius = 1;
        numberOfObjects++;
    }

    /* Return number of objects */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /* Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
}
public class task7 {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle2 objects is " + Circle2.numberOfObjects);

        // Create object c1
        Circle2 c1 = new Circle2();

        // Display c1 before c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius = " + c1.radius +
            " and number of Circle objects = " + c1.numberOfObjects);

        // Create c2
        Circle2 c2 = new Circle2(); // This constructor call seems incorrect based on the Circle2 class provided earlier

        // Modify c1
        c1.radius = 9;

        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius = " + c1.radius +
            " and number of Circle objects = " + c1.numberOfObjects);
        System.out.println("c2: radius = " + c2.radius +
            " and number of Circle objects = " + c2.numberOfObjects);
    }
}

