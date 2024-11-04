package week9;

public class task2 {
    public static void main(String[] args) {
        task2 Circle1 = new task2();
        System.out.println("The area of the circle of radius " + Circle1.radius + " is " + Circle1.getArea());
        task2 Circle2 = new task2(25);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());

        task2 Circle3 = new task2(75);
        System.out.println("The area of the circle of radius " + Circle3.radius + " is " + Circle3.getArea());


        Circle2.radius = 100;
        Circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());
    }
    double radius;
    task2() {
        radius = 1;
    }
    task2(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}



         
    
    


