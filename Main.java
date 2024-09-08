public class Main {
    public static void main(String[] args) {
        // Create a GeometricObject instance
        GeometricObject geoObj = new GeometricObject("blue", true);
        System.out.println(geoObj);

        // Create a Circle instance
        Circle circle1 = new Circle(5.0, "red", true);
        Circle circle2 = new Circle(3.0, "green", false);

        // Print circle information
        circle1.printCircle();
        circle2.printCircle();

        // Compare two circles
        int comparison = circle1.compareTo(circle2);
        if (comparison > 0) {
            System.out.println("Circle1 is larger than Circle2.");
        } else if (comparison < 0) {
            System.out.println("Circle1 is smaller than Circle2.");
        } else {
            System.out.println("Circle1 and Circle2 are the same size.");
        }

        // Test equals method
        boolean areEqual = circle1.equals(circle2);
        System.out.println("Circle1 and Circle2 are equal: " + areEqual);
    }
}
